package main.symbolTable.item;

import main.ast.nodes.declaration.FunctionDeclaration;
import main.symbolTable.SymbolTable;

public class FunctionItem extends SymbolTableItem{
    public static final String START_KEY = "Function:";
    private SymbolTable functionSymbolTable;
    private FunctionDeclaration functionDeclaration;
    private int minArgs;
    private int maxArgs;

    public int getMinArgs() { return minArgs; }
    public void setMinArgs(int minArgs) { this.minArgs = minArgs; }
    public int getMaxArgs() { return maxArgs; }
    public void setMaxArgs(int maxArgs) { this.maxArgs = maxArgs; }


    public FunctionItem(FunctionDeclaration functionDeclaration){
        this.functionDeclaration = functionDeclaration;
        this.name = this.functionDeclaration.getFunctionName().getName();
        this.minArgs = functionDeclaration.getMinArgs();
        this.maxArgs = functionDeclaration.getMaxArgs();
    }

    public SymbolTable getFunctionSymbolTable() {
        return functionSymbolTable;
    }

    public void setFunctionSymbolTable(SymbolTable functionSymbolTable) {
        this.functionSymbolTable = functionSymbolTable;
    }

    public FunctionDeclaration getFunctionDeclaration() {
        return functionDeclaration;
    }

    public void setFunctionDeclaration(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }
    @Override
    public String getKey() {return START_KEY + this.name;}

}
