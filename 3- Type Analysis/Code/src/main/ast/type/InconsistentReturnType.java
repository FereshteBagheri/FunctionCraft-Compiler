package main.ast.type;

import main.ast.type.ListType;
import main.ast.type.Type;
public class InconsistentReturnType extends Type {
    @Override
    public boolean sameType(Type other) {
        return other instanceof InconsistentReturnType;
    }

    @Override
    public String toString() {
        return "InconsistentReturnType";
    }
}
