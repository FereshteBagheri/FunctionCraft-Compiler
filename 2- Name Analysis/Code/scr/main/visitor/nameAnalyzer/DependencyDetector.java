package main.visitor.nameAnalyzer;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.declaration.PatternDeclaration;
import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.statement.*;
import main.compileError.CompileError;
import main.compileError.nameErrors.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.FunctionItem;
import main.symbolTable.item.VarItem;
import main.visitor.Visitor;
import main.symbolTable.utils.Graph;

import java.util.ArrayList;
import java.util.List;

public class DependencyDetector extends Visitor<Void> {
    public ArrayList<CompileError> dependencyError = new ArrayList<>();
    private Graph dependencyGraph = new Graph();
    private String parentFunctionName;
    @Override
    public Void visit(Program program){
        for(FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()){
            functionDeclaration.accept(this);
        }
        return null;
    }
    //TODO:visit function declarations and construct dependency graph


    @Override
    public Void visit(FunctionDeclaration functionDeclaration)
    {
        functionDeclaration.getFunctionName().accept(this);
        parentFunctionName = functionDeclaration.getFunctionName().getName();
        for (Statement statement: functionDeclaration.getBody())
        {statement.accept(this);}

        return null;
    }

    @Override
    public Void visit(AssignStatement assignmentStmt) {

        try {
            VarItem varItem = new VarItem(assignmentStmt.getAssignedId());
            SymbolTable.top.put(varItem);
        } catch (ItemAlreadyExists ignored) {
        }
        assignmentStmt.getAssignedId().accept(this);
        assignmentStmt.getAssignExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(ExpressionStatement expressionStatement) {
        expressionStatement.getExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(ReturnStatement returnStatement) {
        if (returnStatement.hasRetExpression())
        {returnStatement.getReturnExp().accept(this);}
        return null;
    }

    @Override
    public Void visit(AccessExpression accessExpression) {
        if (accessExpression.isFunctionCall()) {
            if ( accessExpression.getAccessedExpression()  instanceof LambdaExpression) {
            }
            else {
            Identifier id = (Identifier) accessExpression.getAccessedExpression();
            dependencyGraph.addEdge(parentFunctionName, id.getName());
        }}
        return null;
    }

    @Override
    public Void visit(IfStatement ifStatement){
        for(Expression expression: ifStatement.getConditions()){
            expression.accept(this);
        }
        for(Statement statement: ifStatement.getThenBody()){
            statement.accept(this);
        }
        for(Statement statement: ifStatement.getElseBody()){
            statement.accept(this);
        }
        return null;
    }
    @Override
    public Void visit(PutStatement putStatement){
        putStatement.getExpression().accept(this);
        return null;
    }
    @Override
    public Void visit(LenStatement lenStatement){
        lenStatement.getExpression().accept(this);
        return null;
    }
    @Override
    public Void visit(PushStatement pushStatement){
        pushStatement.getInitial().accept(this);
        pushStatement.getToBeAdded().accept(this);
        return null;
    }
    @Override
    public Void visit(LoopDoStatement loopDoStatement){
        for(Statement statement: loopDoStatement.getLoopBodyStmts()){
            statement.accept(this);
        }
        for(Expression expression : loopDoStatement.getLoopConditions()){
            expression.accept(this);
        }
        if(loopDoStatement.getLoopRetStmt() != null) {
            loopDoStatement.getLoopRetStmt().accept(this);
        }
        return null;
    }
    @Override
    public Void visit(ForStatement forStatement){
        for(Expression expression: forStatement.getRangeExpressions()){
            expression.accept(this);
        }
        for(Statement statement: forStatement.getLoopBody()){
            statement.accept(this);
        }
        for(Expression expression: forStatement.getLoopBodyExpressions()){
            expression.accept(this);
        }
        if(forStatement.getReturnStatement() != null){
            forStatement.getReturnStatement().accept(this);
        }
        return null;
    }
    @Override
    public Void visit(MatchPatternStatement matchPatternStatement){
        matchPatternStatement.getMatchArgument().accept(this);
        return null;
    }
    @Override
    public Void visit(ChopStatement chopStatement){
        chopStatement.getChopExpression().accept(this);
        return null;
    }
    @Override
    public Void visit(ChompStatement chompStatement){
        chompStatement.getChompExpression().accept(this);
        return null;
    }

    @Override
    public Void visit(AppendExpression appendExpression){
        appendExpression.getAppendee().accept(this);
        for(Expression expression : appendExpression.getAppendeds()){
            expression.accept(this);
        }
        return null;
    }
    @Override
    public Void visit(BinaryExpression binaryExpression){
        binaryExpression.getFirstOperand().accept(this);
        binaryExpression.getSecondOperand().accept(this);
        return null;
    }
    @Override
    public Void visit(UnaryExpression unaryExpression){
        unaryExpression.getExpression().accept(this);
        return null;
    }


    public Void findDependency(){
        //TODO:find dependencies by analyzing dependency graph
        ArrayList<List<String>> cylces = dependencyGraph.findCycles();
        for (List<String> cycle : cylces)
        {
            dependencyError.add(new CircularDependency(cycle));
        }
        return null;
    }

}
