//package main.symbolTable;
//
//import main.symbolTable.exceptions.ItemAlreadyExists;
//import main.symbolTable.exceptions.ItemNotFound;
//import main.symbolTable.item.SymbolTableItem;
//import main.symbolTable.utils.Stack;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class SymbolTable {
//    public static SymbolTable top;
//    public static SymbolTable root;
//    private static Stack<SymbolTable> stack = new Stack<>();
//    private Map<String, SymbolTableItem> items;
//    public static void push(SymbolTable symbolTable) {
//        if (top != null)
//            stack.push(top);
//        top = symbolTable;
//    }
//    public static void pop() {
//        top = stack.pop();
//    }
//    public SymbolTable() {
//        this.items = new HashMap<>();
//    }
//    public void put(SymbolTableItem item) throws ItemAlreadyExists {
//        if (items.containsKey(item.getKey()))
//            throw new ItemAlreadyExists();
//        items.put(item.getKey(), item);
//    }
//    public SymbolTableItem getItem(String key) throws ItemNotFound {
//        SymbolTableItem symbolTableItem = this.items.get(key);
//        if( symbolTableItem != null ){
//            return symbolTableItem;
//        }
//        throw new ItemNotFound();
//    }
//
//    public SymbolTable clonee() {
//        SymbolTable clonedSymbolTable = new SymbolTable();
//        for (Map.Entry<String, SymbolTableItem> entry : items.entrySet()) {
//            try {
//                clonedSymbolTable.put(entry.getValue().clonee());
//            } catch (ItemAlreadyExists ignored) {
//                // Handle if item already exists, though this should not occur
//            }
//        }
//        return clonedSymbolTable;
//    }
//}

package main.symbolTable;

import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.SymbolTableItem;
import main.symbolTable.utils.Stack;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    public static SymbolTable top;
    public static SymbolTable root;
    private static Stack<SymbolTable> stack = new Stack<>();
    private Map<String, SymbolTableItem> items;

    public static void push(SymbolTable symbolTable) {
        if (top != null)
            stack.push(top);
        top = symbolTable;
    }

    public static void pop() {
        top = stack.pop();
    }

    public SymbolTable() {
        this.items = new HashMap<>();
    }

    public void put(SymbolTableItem item) throws ItemAlreadyExists {
        if (items.containsKey(item.getKey()))
            throw new ItemAlreadyExists();
        items.put(item.getKey(), item);
    }

    public SymbolTableItem getItem(String key) throws ItemNotFound {
        SymbolTableItem symbolTableItem = this.items.get(key);
        if (symbolTableItem != null) {
            return symbolTableItem;
        }
        throw new ItemNotFound();
    }

    // Implementing clonee method
    public SymbolTable clone_() {
        SymbolTable clonedSymbolTable = new SymbolTable();
        for (Map.Entry<String, SymbolTableItem> entry : items.entrySet()) {
            try {
                clonedSymbolTable.put(entry.getValue().clone());
            } catch (ItemAlreadyExists ignored) {
                // Handle if item already exists, though this should not occur
            }
        }
        return clonedSymbolTable;
    }
}

