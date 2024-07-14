package main.visitor.nameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.declaration.PatternDeclaration;
import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.value.ListValue;
import main.ast.nodes.statement.*;
import main.compileError.CompileError;
import main.compileError.nameErrors.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.FunctionItem;
import main.symbolTable.item.PatternItem;
import main.symbolTable.item.VarItem;
import main.visitor.Visitor;
import java.util.HashMap;
import main.symbolTable.utils.Pair;


import java.util.ArrayList;

public class NameAnalyzer extends Visitor<Void> {

    public ArrayList<CompileError> nameErrors = new ArrayList<>();
    private HashMap<String, Pair<Integer, Integer>> functionArgsMap = new HashMap<>();

    @Override
    public Void visit(Program program) {
        SymbolTable.root = new SymbolTable();
        SymbolTable.top = new SymbolTable();

        for (FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()) {
            String functionName = functionDeclaration.getFunctionName().getName();
            if (!functionArgsMap.containsKey(functionName)) {
                int minArgs = functionDeclaration.getMinArgs();
                int maxArgs = functionDeclaration.getMaxArgs();
                functionArgsMap.put(functionName, new Pair<>(minArgs, maxArgs));
            }
        }

        int dubplicateFunctionId = 0;
        ArrayList<FunctionItem> functionItems = new ArrayList<>();
        for (FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()) {
            FunctionItem functionItem = new FunctionItem(functionDeclaration);
            try {
                SymbolTable.root.put(functionItem);
                functionItems.add(functionItem);
            } catch (ItemAlreadyExists e) {
                nameErrors.add(new RedefinitionOfFunction(functionDeclaration.getLine(),
                        functionDeclaration.getFunctionName().getName()));
                dubplicateFunctionId += 1;
                String freshName = functionItem.getName() + "#" + String.valueOf(dubplicateFunctionId);
                Identifier newId = functionDeclaration.getFunctionName();
                newId.setName(freshName);
                functionDeclaration.setFunctionName(newId);
                FunctionItem newItems = new FunctionItem(functionDeclaration);
                functionItems.add(newItems);
                try {
                    SymbolTable.root.put(newItems);
                } catch (ItemAlreadyExists ignored) {
                }
            }
        }

        //addPatterns
        int duplicatePatternId = 0;
        ArrayList<PatternItem> patternItems = new ArrayList<>();
        for (PatternDeclaration patternDeclaration : program.getPatternDeclarations()) {
            PatternItem patternItem = new PatternItem(patternDeclaration);
            try {
                SymbolTable.root.put(patternItem);
                patternItems.add(patternItem);
            } catch (ItemAlreadyExists e) {
                nameErrors.add(new RedefinitionOfPattern(patternDeclaration.getLine(),
                        patternDeclaration.getPatternName().getName()));
                duplicatePatternId += 1;
                String freshName = patternItem.getName() + "#" + String.valueOf(duplicatePatternId);
                Identifier newId = patternDeclaration.getPatternName();
                newId.setName(freshName);
                patternDeclaration.setPatternName(newId);
                PatternItem newItem = new PatternItem(patternDeclaration);
                patternItems.add(newItem);
                try {
                    SymbolTable.root.put(newItem);
                } catch (ItemAlreadyExists ignored) {
                }
            }
        }
        //TODO:visitFunctions

        for (FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()) {
            functionDeclaration.accept(this);
        }

        //visitPatterns
        int visitingPatternIndex = 0;
        for (PatternDeclaration patternDeclaration : program.getPatternDeclarations()) {
            PatternItem patternItem = patternItems.get(visitingPatternIndex);
            SymbolTable patternSymbolTable = new SymbolTable();
            patternItem.setPatternSymbolTable(patternSymbolTable);
            SymbolTable.push(patternSymbolTable);
            patternDeclaration.accept(this);
            SymbolTable.pop();
            visitingPatternIndex += 1;
        }
        //visitMain
        program.getMain().accept(this);
        return null;
    }

    //TODO:visit all other AST nodes and find name errors

    @Override
    public Void visit(FunctionDeclaration functionDeclaration){
//        functionDeclaration.getFunctionName().accept(this);
        FunctionItem functionItem = new FunctionItem(functionDeclaration);
        SymbolTable functionSymbolTable = new SymbolTable();
        functionItem.setFunctionSymbolTable(functionSymbolTable);
        try {
            SymbolTable.root.put(functionItem);
        } catch (ItemAlreadyExists ignored) {

        }

        for (VarDeclaration arg : functionDeclaration.getArgs()) {
            try {
                VarItem varItem = new VarItem(arg.getName());
                functionSymbolTable.put(varItem);
            } catch (ItemAlreadyExists ignored) {

            }

            if (arg.getName().getName().equals(functionDeclaration.getFunctionName().getName())) {
                nameErrors.add(new IdenticalArgFunctionName(arg.getLine(), arg.getName().getName()));
            }
            arg.accept(this);
        }

        SymbolTable.push(functionSymbolTable);
        for (Statement stmt : functionDeclaration.getBody()) {
            stmt.accept(this);
        }

        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(VarDeclaration varDeclaration) {
        VarItem varItem = new VarItem(varDeclaration.getName());
        if (varDeclaration.getDefaultVal() != null) {
            varDeclaration.getDefaultVal().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(AccessExpression accessExpression) {

        if (accessExpression.isFunctionCall()) {
            Expression accessedExpression = accessExpression.getAccessedExpression();

            if (accessedExpression instanceof LambdaExpression) {
                LambdaExpression lambdaExpression = (LambdaExpression) accessedExpression;
                int numArgs = accessExpression.getArguments().size();
                int expectedArgs = lambdaExpression.getDeclarationArgs().size();
                if (numArgs != expectedArgs) {
                    nameErrors.add(new ArgMisMatch(accessExpression.getAccessedExpression().getLine(), "lambda function"));
                }
            } else {
                String functionName = ((Identifier) accessedExpression).getName();
                if (!functionArgsMap.containsKey(functionName)) {
                    nameErrors.add(new FunctionNotDeclared(accessedExpression.getLine(), functionName));
                } else {

                    Pair<Integer, Integer> argsPair = functionArgsMap.get(functionName);
                    int numArgs = accessExpression.getArguments().size();
                    if (numArgs < argsPair.getFirst() || numArgs > argsPair.getSecond()) {
                        nameErrors.add(new ArgMisMatch(accessExpression.getAccessedExpression().getLine(), functionName));
                    }
                }
            }
        }
        else{
            Expression accessedExpression = accessExpression.getAccessedExpression();
            if (accessedExpression instanceof Identifier) {
                Identifier identifier = (Identifier) accessedExpression;
                try {
                    SymbolTable.top.getItem(VarItem.START_KEY + identifier.getName());
                } catch (ItemNotFound e) {
                    nameErrors.add(new VariableNotDeclared(identifier.getLine(), identifier.getName()));
                }
            }
        }

        for (Expression dim : accessExpression.getDimentionalAccess()) {
            dim.accept(this);
        }

        for (Expression arg : accessExpression.getArguments()) {
            arg.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(Identifier identifier) {
        VarItem varItem = new VarItem(identifier);
        try {
            SymbolTable.top.getItem(VarItem.START_KEY + varItem.getName());
        } catch (ItemNotFound e) {
            try {
                SymbolTable.top.getItem(FunctionItem.START_KEY + varItem.getName());
            } catch (ItemNotFound ex) {
                nameErrors.add(new VariableNotDeclared(identifier.getLine(), identifier.getName()));
            }
        }
        return null;
    }

    @Override
    public Void visit(PatternDeclaration patternDeclaration) {
        patternDeclaration.getPatternName().accept(this);
        for (Expression expression : patternDeclaration.getConditions()) {
            expression.accept(this);
        }

        for (Expression expression : patternDeclaration.getReturnExp()) {
            expression.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDec) {
        for (Statement statement : mainDec.getBody()) {
            statement.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(AppendExpression appendExpression) {
        appendExpression.getAppendee().accept(this);

        for (Expression expression : appendExpression.getAppendeds()) {
            expression.accept(this);
        }
        return null;
    }

    @Override
    public Void visit(BinaryExpression binaryExpression) {
        binaryExpression.getFirstOperand().accept(this);
        binaryExpression.getSecondOperand().accept(this);

        return null;
    }

    @Override
    public Void visit(AssignStatement assignmentStmt) {

        assignmentStmt.getAssignExpression().accept(this);
        try {
            VarItem varItem = new VarItem(assignmentStmt.getAssignedId());
            SymbolTable.top.put(varItem);
        } catch (ItemAlreadyExists ignored) {

        }
        assignmentStmt.getAssignedId().accept(this);

        return null;
    }

    @Override
    public Void visit(ExpressionStatement expressionStatement) {
        expressionStatement.getExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(ReturnStatement returnStatement) {
        if (returnStatement.hasRetExpression()) {
            returnStatement.getReturnExp().accept(this);
        }
        return null;
    }

    @Override
    public Void visit(IfStatement ifStatement) {

        SymbolTable currentSymbolTable = SymbolTable.top;
        SymbolTable ifScope = currentSymbolTable.clone_();
        SymbolTable.push(ifScope);

        // Visit the conditions and body of the if statement
        for (Expression condition : ifStatement.getConditions()) {
            condition.accept(this);
        }
        for (Statement statement : ifStatement.getThenBody()) {
            statement.accept(this);
        }
        SymbolTable.pop();

        if (ifStatement.getElseBody() != null) {
            SymbolTable elseScope = currentSymbolTable.clone_();
            SymbolTable.push(elseScope);
            for (Statement statement : ifStatement.getElseBody()) {
                statement.accept(this);
            }
            SymbolTable.pop();
        }
        return null;
    }

    @Override
    public Void visit(PutStatement putStatement) {
        putStatement.getExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(LenStatement lenStatement) {
        lenStatement.getExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(PushStatement pushStatement) {
        pushStatement.getInitial().accept(this);
        pushStatement.getToBeAdded().accept(this);
        return null;
    }

    @Override
    public Void visit(LoopDoStatement loopDoStatement) {
        SymbolTable currentSymbolTable = SymbolTable.top;
        SymbolTable loopScope = currentSymbolTable.clone_();
        SymbolTable.push(loopScope);

        for (Statement statement : loopDoStatement.getLoopBodyStmts()) {
            statement.accept(this);
        }
        for (Expression expression : loopDoStatement.getLoopConditions()) {
            expression.accept(this);
        }
        if (loopDoStatement.getLoopRetStmt() != null) {
            loopDoStatement.getLoopRetStmt().accept(this);
        }
        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(ForStatement forStatement) {
        SymbolTable currentSymbolTable = SymbolTable.top;
        SymbolTable loopScope = currentSymbolTable.clone_();
        SymbolTable.push(loopScope);

        for (Expression expression : forStatement.getRangeExpressions()) {
            expression.accept(this);
        }
        for (Statement statement : forStatement.getLoopBody()) {
            statement.accept(this);
        }
        for (Expression expression : forStatement.getLoopBodyExpressions()) {
            expression.accept(this);
        }
        if (forStatement.getReturnStatement() != null) {
            forStatement.getReturnStatement().accept(this);
        }

        SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(MatchPatternStatement matchPatternStatement) {
        matchPatternStatement.getMatchArgument().accept(this);
        return null;
    }

    @Override
    public Void visit(ChopStatement chopStatement) {
        chopStatement.getChopExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(ChompStatement chompStatement) {
        chompStatement.getChompExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(UnaryExpression unaryExpression) {
        unaryExpression.getExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(LambdaExpression lambdaExpression) {
        for (VarDeclaration varDeclaration : lambdaExpression.getDeclarationArgs()) {
            varDeclaration.accept(this);
        }

        for (Statement statement : lambdaExpression.getBody()) {
            statement.accept(this);
        }
        return null;
    }
    
    @Override
    public Void visit(ListValue listValue) {
        for (Expression expression : listValue.getElements()) {
            expression.accept(this);
        }
        return null;
    }
}