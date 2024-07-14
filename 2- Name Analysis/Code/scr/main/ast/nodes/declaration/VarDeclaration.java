package main.ast.nodes.declaration;

import main.ast.nodes.expression.Expression;
import main.ast.nodes.expression.Identifier;
import main.visitor.IVisitor;

public class VarDeclaration extends Declaration{
    private Identifier name;
    private Expression defaultVal;

    private boolean isDefaultVar;

    public boolean getIsDefaultVar(){return this.isDefaultVar;}

    public void setIsDefaultVar(){this.isDefaultVar = true;}



    public VarDeclaration(Identifier name){
        this.name = name;
        this.defaultVal = null;
        this.isDefaultVar = false;
    }
    public Identifier getName(){return this.name;}
    public void setName(Identifier name){this.name = name;}
    public Expression getDefaultVal(){return this.defaultVal;}
    public void setDefaultVal(Expression defaultVal){this.defaultVal = defaultVal;}
    @Override
    public String toString(){return "VarDeclaration:" + this.name;}
    @Override
    public<T>T accept(IVisitor<T> visitor){return visitor.visit(this);}
}
