package main.visitor.type;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.*;
import main.ast.nodes.expression.value.*;
import main.ast.nodes.expression.value.primitive.*;
import main.ast.nodes.statement.*;
import main.ast.type.*;
import main.ast.type.primitiveType.*;
import main.compileError.CompileError;
import main.compileError.typeErrors.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.*;
import main.symbolTable.item.*;
import main.visitor.Visitor;

import java.util.*;

public class TypeChecker extends Visitor<Type> {
    public ArrayList<CompileError> typeErrors = new ArrayList<>();
    private boolean isArithmetic(BinaryOperator operator) {
        return operator == BinaryOperator.PLUS || operator == BinaryOperator.MINUS ||
                operator == BinaryOperator.MULT || operator == BinaryOperator.DIVIDE;
    }

    private boolean isComparison(BinaryOperator operator) {
        return operator == BinaryOperator.GREATER_THAN || operator == BinaryOperator.LESS_THAN ||
                operator == BinaryOperator.GREATER_EQUAL_THAN || operator == BinaryOperator.LESS_EQUAL_THAN ||
                operator == BinaryOperator.EQUAL || operator == BinaryOperator.NOT_EQUAL;
    }
    
    private boolean isUnaryArithmetic(UnaryOperator operator) {
        return operator == UnaryOperator.MINUS || operator == UnaryOperator.INC || operator == UnaryOperator.DEC;
    }

    private boolean isUnaryLogical(UnaryOperator operator) {
        return operator == UnaryOperator.NOT;
    }

    private Type visitStatements(List<Statement> statements) {
        List<Type> returnTypes = new ArrayList<>();
        for (Statement statement : statements) {
            Type returnType = statement.accept(this);
            if (returnType != null) {
                returnTypes.add(returnType);
            }
        }

        if (returnTypes.isEmpty()) {
            return null;
        }

        Type firstType = null;
        boolean hasNoType = false;
        boolean hasOtherType = false;

        for (Type type : returnTypes) {
            if (type instanceof NoType) {
                hasNoType = true;
            } else {
                if (firstType == null) {
                    firstType = type;
                } else if (!type.sameType(firstType)) {
                    hasOtherType = true;
                    break;
                }
            }
        }

        if (hasOtherType) {
            return new InconsistentReturnType();
        }

        if (firstType == null) {
            return new NoType();
        }

        if (hasNoType) {
            return new NoType();
        }

        return firstType;
    }


    @Override
    public Type visit(Program program){
        SymbolTable.root = new SymbolTable();
        SymbolTable.top = new SymbolTable();
        for(FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()){
            FunctionItem functionItem = new FunctionItem(functionDeclaration);
            try {
                SymbolTable.root.put(functionItem);
            }catch (ItemAlreadyExists ignored){}
        }
        for(PatternDeclaration patternDeclaration : program.getPatternDeclarations()){
            PatternItem patternItem = new PatternItem(patternDeclaration);
            try{
                SymbolTable.root.put(patternItem);
            }catch (ItemAlreadyExists ignored){}
        }
        program.getMain().accept(this);

        return null;
    }
    @Override
    public Type visit(FunctionDeclaration functionDeclaration){
        SymbolTable.push(new SymbolTable());
        List<Type> returnTypes = new ArrayList<>();
        try {
            FunctionItem functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                    functionDeclaration.getFunctionName().getName());
            ArrayList<Type> currentArgTypes = functionItem.getArgumentTypes();
            for (int i = 0; i < functionDeclaration.getArgs().size(); i++) {
                VarItem argItem = new VarItem(functionDeclaration.getArgs().get(i).getName());
                argItem.setType(currentArgTypes.get(i));
                try {
                    SymbolTable.top.put(argItem);
                }catch (ItemAlreadyExists ignored){}
            }
        }catch (ItemNotFound ignored){}

        for (Statement statement : functionDeclaration.getBody()) {
            Type returnType = statement.accept(this);
            if (returnType != null) {
                returnTypes.add(returnType);
            }
        }
        SymbolTable.pop();

        if (returnTypes.isEmpty()) {
            return new NoType();
        }

        Type firstType = null;
        boolean hasNoType = false;
        boolean hasOtherType = false;

        for (Type type : returnTypes) {
            if(type instanceof InconsistentReturnType){
                hasOtherType = true;
            }
            if (type instanceof NoType) {
                hasNoType = true;
            } else {
                if (firstType == null) {
                    firstType = type;
                } else if (!type.sameType(firstType)) {
                    hasOtherType = true;
                }
            }
        }

        if (hasOtherType) {
            typeErrors.add(new FunctionIncompatibleReturnTypes(functionDeclaration.getLine(), functionDeclaration.getFunctionName().getName()));
            return new NoType();
        }

        if (firstType == null) {
            return new NoType();
        }

        if (hasNoType) {
            return new NoType();
        }

        return firstType;
    }

    @Override
    public Type visit(PatternDeclaration patternDeclaration){
        boolean conditionFlag = false;
        List<Type> returnTypes = new ArrayList<>();

        SymbolTable.push(new SymbolTable());
        try {
            PatternItem patternItem = (PatternItem) SymbolTable.root.getItem(PatternItem.START_KEY +
                    patternDeclaration.getPatternName().getName());
            VarItem varItem = new VarItem(patternDeclaration.getTargetVariable());
            varItem.setType(patternItem.getTargetVarType());
            try {
                SymbolTable.top.put(varItem);
            } catch (ItemAlreadyExists ignored) {
            }

            for (Expression expression : patternDeclaration.getConditions()) {
                Type type = expression.accept(this);
                if (!(type instanceof BoolType) && !(type instanceof NoType)) {
                    typeErrors.add(new ConditionIsNotBool(expression.getLine()));
                    conditionFlag = true;
                }
            }

            for (Expression returnExp : patternDeclaration.getReturnExp()) {
                Type returnType = returnExp.accept(this);
                if (returnType != null) {
                    returnTypes.add(returnType);
                }
            }

        } catch (ItemNotFound ignored) {}
        SymbolTable.pop();

        if (returnTypes.isEmpty()) {
            return new NoType();
        }

        Type firstType = null;
        boolean hasNoType = false;
        boolean hasOtherType = false;

        for (Type type : returnTypes) {
            if (type instanceof NoType) {
                hasNoType = true;
            } else {
                if (firstType == null) {
                    firstType = type;
                } else if (!type.sameType(firstType)) {
                    hasOtherType = true;
                }
            }
        }

        if (hasOtherType) {
            typeErrors.add(new PatternIncompatibleReturnTypes(patternDeclaration.getLine(), patternDeclaration.getPatternName().getName()));
            return new NoType();
        }

        if (firstType == null) {
            return new NoType();
        }

        if (hasNoType) {
            return new NoType();
        }

        if (conditionFlag) {
            return new NoType();
        }

        return firstType;
    }

    @Override
    public Type visit(MainDeclaration mainDeclaration){
        SymbolTable.push(new SymbolTable());
        for (Statement statement : mainDeclaration.getBody())
            statement.accept(this);
        SymbolTable.pop();
        return null;
    }

    @Override
    public Type visit(AccessExpression accessExpression){
        if(accessExpression.isFunctionCall()){
            try {
                Identifier functionIdentifier;
                Type t = accessExpression.getAccessedExpression().accept(this);
                if(t instanceof FptrType f){
                    functionIdentifier = new Identifier(f.getFunctionName());
                }
                else{
                    functionIdentifier = (Identifier) accessExpression.getAccessedExpression();
                }

                FunctionItem functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY + functionIdentifier.getName());
                ArrayList<Expression> arguments = accessExpression.getArguments();
                ArrayList<Type> argumentTypes = new ArrayList<>();
                List<VarDeclaration> params = functionItem.getFunctionDeclaration().getArgs();

                for (int i = 0; i < params.size(); i++) {
                    if (i < arguments.size()) {
                        argumentTypes.add(arguments.get(i).accept(this));
                    } else if (params.get(i).getDefaultVal() != null) {
                        argumentTypes.add(params.get(i).getDefaultVal().accept(this));
                    } else {
                        return new NoType();
                    }
                }
                functionItem.setArgumentTypes(argumentTypes);
                FunctionDeclaration functionDeclaration = functionItem.getFunctionDeclaration();
                return functionDeclaration.accept(this);
            } catch ( ItemNotFound e) {
                return new NoType();
            }
        }
        else{
            boolean flag = false;
            Type accessedType = accessExpression.getAccessedExpression().accept(this);
            if(!(accessedType instanceof StringType) && !(accessedType instanceof ListType) && !(accessedType instanceof NoType)){
                typeErrors.add(new IsNotIndexable(accessExpression.getLine()));
                flag = true;
            }

            for (Expression exp: accessExpression.getDimentionalAccess())
            {
                Type index = exp.accept(this);
                if (!(index instanceof IntType || index instanceof NoType))
                {
                    typeErrors.add(new AccessIndexIsNotInt(accessExpression.getLine()));
                    return new NoType();
                }
            }
            if(flag){
                return new NoType();
            }
            if (accessedType instanceof ListType) {
                return ((ListType) accessedType).getType();
            } else{
                return new StringType();
            }
        }
    }

    @Override
    public Type visit(ReturnStatement returnStatement){
        if(!returnStatement.hasRetExpression())
            return new NoType();
        else return returnStatement.getReturnExp().accept(this);
    }

    @Override
    public Type visit(ExpressionStatement expressionStatement){
        expressionStatement.getExpression().accept(this);
        return null;
    }

    @Override
    public Type visit(ForStatement forStatement){

        SymbolTable.push(SymbolTable.top.copy());

        String varName = forStatement.getIteratorId().getName();
        VarItem varItem;
        Type assignedType = forStatement.getRangeExpression().accept(this);
        Type prev = new NoType();

        try {
            varItem = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY + varName);
            prev = varItem.getType();
            varItem.setType(assignedType);
        } catch (ItemNotFound e) {
            varItem = new VarItem(forStatement.getIteratorId());
            varItem.setType(assignedType);
            try {
                SymbolTable.top.put(varItem);
            } catch (ItemAlreadyExists ignored) {}
        }

        Type returnType = visitStatements(forStatement.getLoopBodyStmts());
        SymbolTable.pop();

        try {
            varItem = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY + varName);
            varItem.setType(prev);
        } catch (ItemNotFound ignored) {}

        if (returnType instanceof InconsistentReturnType) {
            return new InconsistentReturnType();
        }
        return returnType;
    }

    @Override
    public Type visit(IfStatement ifStatement){
        SymbolTable.push(SymbolTable.top.copy());

        for (Expression expression : ifStatement.getConditions()) {
            Type conditionType = expression.accept(this);
            if (!( conditionType instanceof BoolType || conditionType instanceof NoType)) {
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));
            }
        }

        Type thenType = visitStatements(ifStatement.getThenBody());
        Type elseType = visitStatements(ifStatement.getElseBody());
        SymbolTable.pop();

        if (thenType == null && elseType == null) {
            return null;
        }

        if (thenType instanceof InconsistentReturnType || elseType instanceof InconsistentReturnType) {
            return new InconsistentReturnType();
        }

        if (thenType != null && elseType != null && !thenType.sameType(elseType)) {
            if(thenType instanceof NoType){
                return elseType;
            }
            if(elseType instanceof NoType){
                return thenType;
            }
            return new InconsistentReturnType();
        }

        return thenType != null ? thenType : elseType;
    }

    @Override
    public Type visit(LoopDoStatement loopDoStatement){
        SymbolTable.push(SymbolTable.top.copy());

        Type returnType = visitStatements(loopDoStatement.getLoopBodyStmts());
        SymbolTable.pop();

        if (returnType instanceof InconsistentReturnType) {
            return new InconsistentReturnType();
        }
        return returnType;
    }

    @Override
    public Type visit(AssignStatement assignStatement){
        if(assignStatement.isAccessList()){
            Type index = assignStatement.getAccessListExpression().accept(this);
            if (!(index instanceof IntType || index instanceof NoType))
            {
                typeErrors.add(new AccessIndexIsNotInt(assignStatement.getLine()));
                return null;
            }
        }
        else {
            String varName = assignStatement.getAssignedId().getName();
            VarItem varItem;
            Type assignedType = assignStatement.getAssignExpression().accept(this);
            try {
                varItem = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY + varName);
                varItem.setType(assignedType);
            } catch (ItemNotFound e) {
                varItem = new VarItem(assignStatement.getAssignedId());
                varItem.setType(assignedType);
                try {
                    SymbolTable.top.put(varItem);
                } catch (ItemAlreadyExists ignored) {}
            }
        }
        return null;
    }

    @Override
    public Type visit(BreakStatement breakStatement){
        for(Expression expression : breakStatement.getConditions())
            if(!((expression.accept(this)) instanceof BoolType))
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));

        return null;
    }

    @Override
    public Type visit(NextStatement nextStatement){
        for(Expression expression : nextStatement.getConditions())
            if(!((expression.accept(this)) instanceof BoolType))
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));

        return null;
    }
    
    @Override
    public Type visit(PushStatement pushStatement){
        Type initialType = null;
        Type toBeAddedType=null;
        try {
            if (pushStatement.getInitial() instanceof Identifier) {
                VarItem varItem = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY + ((Identifier) pushStatement.getInitial()).getName());
                initialType = varItem.getType();
            } else {
                initialType = pushStatement.getInitial().accept(this);
            }
            if (pushStatement.getToBeAdded() instanceof Identifier) {
                VarItem varItem = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY + ((Identifier) pushStatement.getToBeAdded()).getName());
                toBeAddedType = varItem.getType();
            } else {
                toBeAddedType = pushStatement.getToBeAdded().accept(this);
            }
            if (!(initialType instanceof ListType || initialType instanceof StringType || initialType instanceof NoType))
            {
                typeErrors.add(new IsNotPushedable(pushStatement.getLine()));
            }
            else if(initialType instanceof ListType listType && listType.getType() == null){
                listType.setType(toBeAddedType);
            }
            else if(!( initialType instanceof ListType listType && listType.getType().sameType(toBeAddedType)
                    || (initialType instanceof ListType ls && ls.getType().sameType(new NoType()))
                    || (initialType instanceof NoType)
                    || (initialType instanceof StringType && toBeAddedType instanceof StringType))){

                typeErrors.add(new PushArgumentsTypesMisMatch(pushStatement.getLine()));
            }

        } catch (ItemNotFound ignored) {}
        return null;
    }

    @Override
    public Type visit(PutStatement putStatement){
        putStatement.getExpression().accept(this);
        return null;
    }

    @Override
    public Type visit(BoolValue boolValue){
        return new BoolType();
    }

    @Override
    public Type visit(IntValue intValue){
        return new IntType();
    }

    @Override
    public Type visit(FloatValue floatValue){return new FloatType();}
    @Override

    public Type visit(StringValue stringValue){
        return new StringType();
    }

    @Override
    public Type visit(ListValue listValue){
        if (listValue.getElements().isEmpty()) {
            return new ListType(null);
        }

        List<Type> elementTypes = new ArrayList<>();
        for (Expression element : listValue.getElements()) {
            Type elementType = element.accept(this);
            if (elementType != null) {
                elementTypes.add(elementType);
            }
        }

        if (elementTypes.isEmpty()) {
            return new ListType(new NoType());
        }

        Type firstType = null;
        boolean hasNoType = false;
        boolean hasOtherType = false;

        for (Type type : elementTypes) {
            if (type instanceof NoType) {
                hasNoType = true;
            } else {
                if (firstType == null) {
                    firstType = type;
                } else if (!type.sameType(firstType)) {
                    hasOtherType = true;
                }
            }
        }

        if (hasOtherType) {
            typeErrors.add(new ListElementsTypesMisMatch(listValue.getLine()));
            return new ListType(new NoType());
        }

        if (firstType == null) {
            return new ListType(new NoType());
        }

        if (hasNoType) {
            return new ListType(new NoType());
        }

        return new ListType(firstType);
    }

    @Override
    public Type visit(FunctionPointer functionPointer){
        return new FptrType(functionPointer.getId().getName());
    }

    @Override
    public Type visit(AppendExpression appendExpression){
        Type appendeeType = appendExpression.getAppendee().accept(this);
        if(!(appendeeType instanceof ListType) && !(appendeeType instanceof StringType)){
            typeErrors.add(new IsNotAppendable(appendExpression.getLine()));
            return new NoType();
        }
        return appendeeType;
    }

    @Override
    public Type visit(BinaryExpression binaryExpression){
        Type leftType = binaryExpression.getFirstOperand().accept(this);
        Type rightType = binaryExpression.getSecondOperand().accept(this);
        BinaryOperator operator = binaryExpression.getOperator();

        if (!leftType.sameType(rightType) && !(leftType instanceof NoType) && !(rightType instanceof NoType)) {
            typeErrors.add(new NonSameOperands(binaryExpression.getLine(), operator));
            return new NoType();
        }

        if ((leftType instanceof NoType &&
                (rightType instanceof NoType
                        || rightType instanceof IntType
                        || rightType instanceof FloatType))
                || (rightType instanceof NoType &&
                ( leftType instanceof IntType
                        || leftType instanceof FloatType))) {
            return new NoType();
        }

        if (isArithmetic(operator)) {
            if (!(leftType instanceof IntType && rightType instanceof IntType)
                     && !(leftType instanceof FloatType && rightType instanceof FloatType)) {
                typeErrors.add(new UnsupportedOperandType(binaryExpression.getLine(), operator.toString()));
                return new NoType();
            }
            return leftType;
        }
        else if (isComparison(operator)) {
            if (!((leftType instanceof IntType && rightType instanceof IntType)
                    || (leftType instanceof FloatType && rightType instanceof FloatType))) {
                typeErrors.add(new UnsupportedOperandType(binaryExpression.getLine(), operator.toString()));
                return new NoType();
            }
            return new BoolType();
        } else {
            return new NoType();
        }
    }

    @Override
    public Type visit(UnaryExpression unaryExpression){
        Type exprType = unaryExpression.getExpression().accept(this);
        UnaryOperator operator = unaryExpression.getOperator();

        if (exprType instanceof NoType) {
            return new NoType();
        }

        if (isUnaryArithmetic(operator)) {
            if (!(exprType instanceof IntType || exprType instanceof FloatType)) {
                typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), operator.toString()));
                return new NoType();
            }
            return exprType;

        } else if (isUnaryLogical(operator)) {
            if (!(exprType instanceof BoolType)) {
                typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(), operator.toString()));
                return new NoType();
            }
            return new BoolType();
        }
        else{
            return new NoType();
        }
    }

    @Override
    public Type visit(ChompStatement chompStatement){
        if (!(chompStatement.getChompExpression().accept(this) instanceof StringType)) {
            typeErrors.add(new ChompArgumentTypeMisMatch(chompStatement.getLine()));
            return new NoType();
        }
        return new StringType();
    }

    @Override
    public Type visit(ChopStatement chopStatement){
        return new StringType();
    }


    @Override
    public Type visit(Identifier identifier){
        try {
            VarItem varItem;
            varItem = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY + new VarItem(identifier).getName());
            return varItem.getType();

        } catch (ItemNotFound e) {
                return new NoType();
            }
        }

    @Override
    public Type visit(LenStatement lenStatement){

        Type expressionType = lenStatement.getExpression().accept(this);
        if (expressionType instanceof NoType){
            return new NoType();
        }

        if(!(expressionType instanceof StringType) && !(expressionType instanceof ListType)){
            typeErrors.add(new LenArgumentTypeMisMatch(lenStatement.getLine()));
            return new NoType();
        }
        return new IntType();
    }

    @Override
    public Type visit(MatchPatternStatement matchPatternStatement){
        try{
            PatternItem patternItem = (PatternItem)SymbolTable.root.getItem(PatternItem.START_KEY +
                    matchPatternStatement.getPatternId().getName());
            patternItem.setTargetVarType(matchPatternStatement.getMatchArgument().accept(this));
            return patternItem.getPatternDeclaration().accept(this);
        }catch (ItemNotFound ignored){}
        return new NoType();
    }

    @Override
    public Type visit(RangeExpression rangeExpression) {
        RangeType rangeType = rangeExpression.getRangeType();

        if (rangeType.equals(RangeType.LIST)) {
            ArrayList<Expression> elements = rangeExpression.getRangeExpressions();
            if (elements.isEmpty()) {
                return new NoType();
            }

            List<Type> elementTypes = new ArrayList<>();
            for (Expression element : elements) {
                Type elementType = element.accept(this);
                if (elementType != null) {
                    elementTypes.add(elementType);
                }
            }

            if (elementTypes.isEmpty()) {
                return new NoType();
            }

            Type firstType = null;
            boolean hasNoType = false;
            boolean hasOtherType = false;

            for (Type type : elementTypes) {
                if (type instanceof NoType) {
                    hasNoType = true;
                } else {
                    if (firstType == null) {
                        firstType = type;
                    } else if (!type.sameType(firstType)) {
                        hasOtherType = true;
                    }
                }
            }

            if (hasOtherType) {
                typeErrors.add(new ListElementsTypesMisMatch(rangeExpression.getLine()));
                return new NoType();
            }

            if (firstType == null) {
                return new NoType();
            }

            if (hasNoType) {
                return new NoType();
            }

            return firstType;

        } else if (rangeType.equals(RangeType.DOUBLE_DOT)) {
            return new IntType();
        } else {
            if (rangeExpression.getRangeExpressions().getFirst().accept(this) instanceof ListType listType) {
                return listType.getType();
            }
            return new NoType();
        }
    }
}
