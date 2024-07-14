//package main.symbolTable.item;
//
//public abstract class SymbolTableItem {
//    protected String name;
//    public abstract String getKey();
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//
//}

package main.symbolTable.item;

public abstract class SymbolTableItem implements Cloneable {
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Implementing clone method
    @Override
    public SymbolTableItem clone() {
        try {
            return (SymbolTableItem) super.clone();
        } catch (CloneNotSupportedException e) {
            // This should never happen since SymbolTableItem implements Cloneable
            e.printStackTrace();
            return null;
        }
    }

    public abstract String getKey();
}
