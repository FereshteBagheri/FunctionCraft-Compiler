package main.ast.nodes.declaration;

import main.ast.nodes.expression.Identifier;
import main.ast.nodes.statement.Statement;
import main.visitor.IVisitor;

import java.util.ArrayList;

public class FunctionDeclaration extends Declaration{
    private Identifier functionName;
    private ArrayList<VarDeclaration> args = new ArrayList<>();
    private ArrayList<Statement> body = new ArrayList<>();

    private int minArgs;
    private int maxArgs;

    public int getMinArgs(){return this.minArgs;}

    public int getMaxArgs(){return this.maxArgs;}

    public void setMaxArgs(int maxArgs){this.maxArgs = maxArgs;}

    public void setMinArgs(int minArgs){this.minArgs = minArgs;}

    public void calculateMinMaxArgs() {
        int min = 0;
        int max = this.args.size();
        for (VarDeclaration arg : this.args) {
            if (!arg.getIsDefaultVar()) {
                min = min + 1;
            }
        }
        this.setMinArgs(min);
        this.setMaxArgs(max);
    }


    public Identifier getFunctionName(){return this.functionName;}
    public void setFunctionName(Identifier functionName){this.functionName = functionName;}

    public ArrayList<VarDeclaration> getArgs(){return this.args;}
    public void setArgs(ArrayList<VarDeclaration> args){this.args = args;}
    public void addArg(VarDeclaration arg){this.args.add(arg);}

    public ArrayList<Statement> getBody(){return this.body;}
    public void setBody(ArrayList<Statement> body){this.body = body;}
    public void addStmt(Statement stmt){this.body.add(stmt);}
    @Override
    public String toString(){return "FunctionDeclaration:" + this.functionName.getName();}
    @Override
    public <T> T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
