package main.visitor.codeGenerator;

import java.io.*;
import java.util.*;
import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.operators.UnaryOperator;
import main.ast.nodes.expression.value.FunctionPointer;
import main.ast.nodes.expression.value.ListValue;
import main.ast.nodes.expression.value.primitive.BoolValue;
import main.ast.nodes.expression.value.primitive.IntValue;
import main.ast.nodes.expression.value.primitive.StringValue;
import main.ast.nodes.statement.*;
import main.ast.type.FptrType;
import main.ast.type.ListType;
import main.ast.type.NoType;
import main.ast.type.Type;
import main.ast.type.primitiveType.BoolType;
import main.ast.type.primitiveType.IntType;
import main.ast.type.primitiveType.StringType;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.FunctionItem;
import main.symbolTable.item.VarItem;
import main.visitor.Visitor;
import main.visitor.type.TypeChecker;

public class CodeGenerator extends Visitor<String> {

    private final String outputPath;
    private FileWriter mainFile;
    private final TypeChecker typeChecker;
    private final Set<String> visited;
    private FunctionItem curFunction;
    private final HashMap<String, Integer> slots = new HashMap<>();
    private int curLabel = 0;
    private Boolean isInFunction = false;
    private HashMap<String, String> functionPointerMap = new HashMap<>();

    public CodeGenerator(TypeChecker typeChecker) {
        this.typeChecker = typeChecker;
        this.visited = typeChecker.visited;
        outputPath = "./codeGenOutput/";
        prepareOutputFolder();
    }

    private int slotOf(String var) {
        if (!slots.containsKey(var)) {
            slots.put(var, slots.size());
            return slots.size() - 1;
        }
        return slots.get(var);
    }

    public String getFreshLabel() {
        String fresh = "Label_" + curLabel;
        curLabel++;
        return fresh;
    }

    public String getType(Type element) {
        String type = "";
        switch (element) {
            case StringType stringType ->
                type += "Ljava/lang/String;";
            case IntType intType ->
                type += "Ljava/lang/Integer;";
            case FptrType fptrType ->
                type += "LFptr;";
            case ListType listType ->
                type += "Ljava/util/ArrayList;";
            case BoolType boolType ->
                type += "Ljava/lang/Boolean;";
            case null, default -> {
                type += "V";
            }
        }
        return type;
    }

    public String getReturnType(Type element) {

        String type = "";
        switch (element) {
            case StringType stringType ->
                type += "Ljava/lang/String;";
            case IntType intType ->
                type += "I";
            case FptrType fptrType ->
                type += "LFptr;";
            case ListType listType ->
                type += "Ljava/util/ArrayList;";
            case BoolType boolType ->
                type += "Z";
            case null, default -> {
                type += "V";
            }
        }
        return type;
    }

    private void prepareOutputFolder() {
        String jasminPath = "utilities/jarFiles/jasmin.jar";
        String listClassPath = "utilities/codeGenerationUtilityClasses/List.j";
        String fptrClassPath = "utilities/codeGenerationUtilityClasses/Fptr.j";
        try {
            File directory = new File(this.outputPath);
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    file.delete();
                }
            }
            directory.mkdir();
        } catch (SecurityException e) {

        }
        copyFile(jasminPath, this.outputPath + "jasmin.jar");
        copyFile(listClassPath, this.outputPath + "List.j");
        copyFile(fptrClassPath, this.outputPath + "Fptr.j");

        try {
            String path = outputPath + "Main.j";
            File file = new File(path);
            file.createNewFile();
            mainFile = new FileWriter(path);
        } catch (IOException e) {

        }
    }

    private void copyFile(String toBeCopied, String toBePasted) {
        try {
            File readingFile = new File(toBeCopied);
            File writingFile = new File(toBePasted);
            InputStream readingFileStream = new FileInputStream(readingFile);
            OutputStream writingFileStream = new FileOutputStream(writingFile);
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = readingFileStream.read(buffer)) > 0) {
                writingFileStream.write(buffer, 0, readLength);
            }
            readingFileStream.close();
            writingFileStream.close();
        } catch (IOException e) {

        }
    }

    private void addCommand(String command) {
        try {
            command = String.join("\n\t\t", command.split("\n"));
            if (command.startsWith("Label_")) {
                mainFile.write("\t" + command + "\n");
            } else if (command.startsWith(".")) {
                mainFile.write(command + "\n");
            } else {
                mainFile.write("\t\t" + command + "\n");
            }
            mainFile.flush();
        } catch (IOException e) {

        }
    }

    private void handleMainClass() {
        String commands = """
                .method public static main([Ljava/lang/String;)V
                .limit stack 128
                .limit locals 128
                new Main
                invokespecial Main/<init>()V
                return
                .end method
                """;
        addCommand(commands);
    }

    @Override
    public String visit(Program program) {
        String commands = """
                .class public Main
                .super java/lang/Object
                """;
        addCommand(commands);
        handleMainClass();

        for (String funcName : this.visited) {
            try {
                this.curFunction = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY + funcName);

                StringBuilder functionHead = new StringBuilder();
                Type returnType = curFunction.getReturnType();
                String returnTypeString = getReturnType(returnType);

                StringBuilder args = new StringBuilder("(");

                ArrayList<Type> argumentTypes = curFunction.getArgumentTypes();
                int size = curFunction.getArgumentTypes().size();
                for (int i = 0; i < size; i++) {
                    String paramType = getType(argumentTypes.get(i));
                    args.append(paramType);
                }
                args.append(")");

                functionHead.append(funcName).append(args).append(returnTypeString);
                curFunction.head = functionHead.toString();
            } catch (ItemNotFound ignored) {
            }
        }

        for (String funcName : this.visited) {
            try {
                this.curFunction = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY + funcName);
                this.curFunction.getFunctionDeclaration().accept(this);
            } catch (ItemNotFound ignored) {
            }
        }

        program.getMain().accept(this);
        return null;
    }

    @Override
    public String visit(FunctionDeclaration functionDeclaration) {

        String functionName = functionDeclaration.getFunctionName().getName();
        FunctionItem functionItem;
        try {
            functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY + functionName);
        } catch (ItemNotFound e) {
            return null;
        }

        SymbolTable.push(new SymbolTable());

        slots.clear();
        StringBuilder commands = new StringBuilder();
        String returnType = getType(functionItem.getReturnType());

        commands.append(".method public static ").append(functionItem.head).append("\n");
        commands.append(".limit stack 128\n");
        commands.append(".limit locals 128\n");

        int size = functionDeclaration.getArgs().size();
        for (int i = 0; i < size; i++) {
            Identifier param = functionDeclaration.getArgs().get(i).getName();
            int slot = slotOf(param.getName());

            Type paramType = functionItem.getArgumentTypes().get(i);
            VarItem argItem = new VarItem(param);
            argItem.setType(paramType);
            try {
                SymbolTable.top.put(argItem);
            } catch (ItemAlreadyExists ignored) {

            }
            commands.append("aload ").append(slot).append("\n");
            if (paramType instanceof IntType) {
                commands.append("invokevirtual java/lang/Integer/intValue()I\n");
                commands.append("istore ").append(slot).append("\n");
            } else if (paramType instanceof BoolType) {
                commands.append("invokevirtual java/lang/Boolean/booleanValue()Z\n");
                commands.append("istore ").append(slot).append("\n");
            } else {
                commands.append("astore ").append(slot).append("\n");
            }
        }

        isInFunction = true;
        for (Statement stmt : functionDeclaration.getBody()) {
            commands.append(stmt.accept(this));
        }

        if (returnType.equals("V")) {
            commands.append("return\n");
        } else if (returnType.equals("Ljava/lang/Integer;") || returnType.equals("Ljava/lang/Boolean;")) {
            commands.append("ireturn\n");
        } else {
            commands.append("areturn\n");
        }

        commands.append(".end method\n");
        addCommand(commands.toString());

        SymbolTable.pop();
        isInFunction = false;
        return null;
    }

    @Override
    public String visit(MainDeclaration mainDeclaration) {
        slots.clear();

        StringBuilder commands = new StringBuilder();
        commands.append(".method public <init>()V\n");
        commands.append(".limit stack 128\n");
        commands.append(".limit locals 128\n");
        commands.append("aload_0\n");
        commands.append("invokespecial java/lang/Object/<init>()V\n");
        for (var statement : mainDeclaration.getBody()) {
            commands.append(statement.accept(this));
        }
        commands.append("return\n");
        commands.append(".end method\n");

        addCommand(commands.toString());
        return null;
    }

    @Override
    public String visit(AccessExpression accessExpression) {
        StringBuilder commands = new StringBuilder();

        if (accessExpression.isFunctionCall()) {
            String functionName = ((Identifier) accessExpression.getAccessedExpression()).getName();
            FunctionItem functionItem;
            try {
                functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY + functionName);
            } catch (ItemNotFound e) {
                try {
                    functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY + functionPointerMap.get(functionName));
                } catch (ItemNotFound ex) {
                    return "";
                }
            }
            int wanted = functionItem.getFunctionDeclaration().getArgs().size();
            int given = accessExpression.getArguments().size();
            FunctionDeclaration functionDeclaration = functionItem.getFunctionDeclaration();
            for (int i = 0; i < wanted; i++) {
                if (i < given) {
                    Expression arg = accessExpression.getArguments().get(i);
                    commands.append(arg.accept(this));
                    Type argType = arg.accept(typeChecker);
                    if (argType instanceof IntType) {
                        commands.append("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n");
                    } else if (argType instanceof BoolType) {
                        commands.append("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n");
                    }
                    continue;
                }

                Expression defaultValue = functionDeclaration.getArgs().get(i).getDefaultVal();
                Type paramType = defaultValue.accept(typeChecker);
                if (paramType instanceof IntType) {
                    commands.append(defaultValue.accept(this)).append("\n");
                    commands.append("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n");
                } else if (paramType instanceof BoolType) {
                    commands.append((defaultValue.accept(this))).append("\n");
                    commands.append("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n");
                } else if (paramType instanceof StringType) {
                    commands.append(defaultValue.accept(this)).append("\n");
                }
            }

            commands.append("invokestatic Main/").append(functionItem.head).append('\n');
        } else {
            Expression indexExp = accessExpression.getDimentionalAccess().getFirst();
            Expression accessedExpr = accessExpression.getAccessedExpression();

            if (accessedExpr instanceof Identifier) {
                String varName = ((Identifier) accessedExpr).getName();
                int slot = slotOf(varName);
                commands.append("aload ").append(slot).append("\n");
            } else {
                commands.append(accessedExpr.accept(this)).append('\n');
            }

            commands.append(indexExp.accept(this)).append('\n');

            Type elementType = ((ListType) accessedExpr.accept(typeChecker)).getType();

            commands.append("invokevirtual java/util/ArrayList/get(I)Ljava/lang/Object;\n");

            if (elementType instanceof IntType) {
                commands.append("checkcast java/lang/Integer\n");
                commands.append("invokevirtual java/lang/Integer/intValue()I\n");
            } else if (elementType instanceof BoolType) {
                commands.append("checkcast java/lang/Boolean\n");
                commands.append("invokevirtual java/lang/Boolean/booleanValue()Z\n");
            } else if (elementType instanceof StringType) {
                commands.append("checkcast java/lang/String\n");
            } else {
                throw new UnsupportedOperationException("Unsupported element type: " + elementType);
            }

        }
        return commands.toString();
    }

    @Override
    public String visit(AssignStatement assignStatement) {
        assignStatement.accept(typeChecker);
        StringBuilder commands = new StringBuilder();

        Identifier assignedId = assignStatement.getAssignedId();
        Expression assignExpression = assignStatement.getAssignExpression();
        boolean isAccessList = assignStatement.isAccessList();
        Expression accessListExpression = assignStatement.getAccessListExpression();
        AssignOperator operator = assignStatement.getAssignOperator();

        if (isAccessList) {
            Type type = assignExpression.accept(typeChecker);

            String varName = assignedId.getName();
            int slot = slotOf(varName);

            commands.append("aload ").append(slot).append("\n");
            commands.append(accessListExpression.accept(this)).append('\n');

            if (operator != AssignOperator.ASSIGN) {
                commands.append("dup2\n");
                commands.append("invokevirtual java/util/ArrayList/get(I)Ljava/lang/Object;\n");
                commands.append("checkcast ");
                if (type instanceof IntType) {
                    commands.append("java/lang/Integer\n");
                    commands.append("invokevirtual java/lang/Integer/intValue()I\n");
                } else if (type instanceof BoolType) {
                    commands.append("java/lang/Boolean\n");
                    commands.append("invokevirtual java/lang/Boolean/booleanValue()Z\n");
                }
            }

            commands.append(assignExpression.accept(this)).append('\n');

            if (operator != AssignOperator.ASSIGN) {
                if (operator == AssignOperator.PLUS_ASSIGN) {
                    commands.append("iadd\n");
                } else if (operator == AssignOperator.MINUS_ASSIGN) {
                    commands.append("isub\n");
                } else if (operator == AssignOperator.MULT_ASSIGN) {
                    commands.append("imul\n");
                } else if (operator == AssignOperator.DIVIDE_ASSIGN) {
                    commands.append("idiv\n");
                } else if (operator == AssignOperator.MOD_ASSIGN) {
                    commands.append("irem\n");
                }
            }

            if (type instanceof IntType) {
                commands.append("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n");
            } else if (type instanceof BoolType) {
                commands.append("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n");
            }

            commands.append("invokevirtual java/util/ArrayList/set(ILjava/lang/Object;)Ljava/lang/Object;\n");
            commands.append("pop\n");

        } else {

            int slot = slotOf(assignedId.getName());
            Type assignedIdType = assignedId.accept(typeChecker);

            if (operator != AssignOperator.ASSIGN) {
                commands.append(assignExpression.accept(this)).append("\n");
                commands.append(assignedId.accept(this)).append("\n");

                if (operator == AssignOperator.PLUS_ASSIGN) {
                    commands.append("iadd\n");
                } else if (operator == AssignOperator.MINUS_ASSIGN) {
                    commands.append("isub\n");
                } else if (operator == AssignOperator.MULT_ASSIGN) {
                    commands.append("imul\n");
                } else if (operator == AssignOperator.DIVIDE_ASSIGN) {
                    commands.append("idiv\n");
                } else if (operator == AssignOperator.MOD_ASSIGN) {
                    commands.append("irem\n");
                }
            } else {
                commands.append(assignExpression.accept(this)).append("\n");
            }

            if (assignedIdType instanceof IntType || assignedIdType instanceof BoolType) {
                commands.append("istore ").append(slot).append("\n");
            } else if (assignedIdType instanceof FptrType ptr) {
                functionPointerMap.put(assignedId.getName(), ptr.getFunctionName());
            } else {
                commands.append("astore ").append(slot).append("\n");
            }
        }

        return commands.toString();
    }

    @Override
    public String visit(IfStatement ifStatement) {

        String elseLabel = getFreshLabel();
        String endLabel = getFreshLabel();
        StringBuilder commands = new StringBuilder();
        commands.append(ifStatement.getConditions().getFirst().accept(this));
        if (!ifStatement.getElseBody().isEmpty()) {
            commands.append("ifeq ").append(elseLabel).append("\n");

            for (Statement stmt : ifStatement.getThenBody()) {
                commands.append(stmt.accept(this));
            }

            commands.append("goto ").append(endLabel).append("\n");

            commands.append(elseLabel).append(":\n");

            for (Statement stmt : ifStatement.getElseBody()) {
                commands.append(stmt.accept(this));
            }

            commands.append(endLabel).append(":\n");
        } else {
            commands.append("ifeq ").append(elseLabel).append("\n");

            for (Statement stmt : ifStatement.getThenBody()) {
                commands.append(stmt.accept(this));
            }

            commands.append(elseLabel).append(":\n");
            commands.append(endLabel).append(":\n");

        }

        return commands.toString();
    }

    @Override
    public String visit(PutStatement putStatement) {
        StringBuilder commands = new StringBuilder();
        commands.append("getstatic java/lang/System/out Ljava/io/PrintStream;\n");
        commands.append(putStatement.getExpression().accept(this));
        Type exprType = putStatement.getExpression().accept(typeChecker);

        if (exprType instanceof IntType) {
            commands.append("invokevirtual java/io/PrintStream/println(I)V\n");
        } else if (exprType instanceof BoolType) {
            commands.append("invokevirtual java/io/PrintStream/println(Z)V\n");
        } else if (exprType instanceof StringType) {
            commands.append("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n");
        } else if (exprType instanceof ListType) {
            commands.append("invokevirtual java/lang/Object/toString()Ljava/lang/String;\n");
            commands.append("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n");
        }

        return commands.toString();
    }

    @Override
    public String visit(ReturnStatement returnStatement) {
        StringBuilder commands = new StringBuilder();

        if (returnStatement.hasRetExpression()) {
            Type retType = returnStatement.getReturnExp().accept(typeChecker);
            commands.append(returnStatement.getReturnExp().accept(this));
            if (retType instanceof IntType || retType instanceof BoolType) {
                commands.append("ireturn").append("\n");
            } else {
                commands.append("areturn").append("\n");
            }
            return commands.toString();
        }
        return "return\n";
    }

    @Override
    public String visit(ExpressionStatement expressionStatement) {
        return expressionStatement.getExpression().accept(this);
    }

    @Override
    public String visit(BinaryExpression binaryExpression) {
        StringBuilder commands = new StringBuilder();

        commands.append(binaryExpression.getFirstOperand().accept(this));
        commands.append(binaryExpression.getSecondOperand().accept(this));

        String trueLabel = getFreshLabel();
        String endLabel = getFreshLabel();

        switch (binaryExpression.getOperator()) {
            case BinaryOperator.PLUS:
                commands.append("iadd\n");
                break;
            case BinaryOperator.MINUS:
                commands.append("isub\n");
                break;
            case BinaryOperator.MULT:
                commands.append("imul\n");
                break;
            case BinaryOperator.DIVIDE:
                commands.append("idiv\n");
                break;
            case BinaryOperator.EQUAL:
                commands.append("if_icmpeq ").append(trueLabel).append("\n");
                commands.append("iconst_0\n");
                commands.append("goto ").append(endLabel).append("\n");
                commands.append(trueLabel).append(":\n");
                commands.append("iconst_1\n");
                commands.append(endLabel).append(":\n");
                break;
            case BinaryOperator.NOT_EQUAL:
                commands.append("if_icmpne ").append(trueLabel).append("\n");
                commands.append("iconst_0\n");
                commands.append("goto ").append(endLabel).append("\n");
                commands.append(trueLabel).append(":\n");
                commands.append("iconst_1\n");
                commands.append(endLabel).append(":\n");
                break;
            case BinaryOperator.GREATER_THAN:
                commands.append("if_icmpgt ").append(trueLabel).append("\n");
                commands.append("iconst_0\n");
                commands.append("goto ").append(endLabel).append("\n");
                commands.append(trueLabel).append(":\n");
                commands.append("iconst_1\n");
                commands.append(endLabel).append(":\n");
                break;
            case BinaryOperator.LESS_THAN:
                commands.append("if_icmplt ").append(trueLabel).append("\n");
                commands.append("iconst_0\n");
                commands.append("goto ").append(endLabel).append("\n");
                commands.append(trueLabel).append(":\n");
                commands.append("iconst_1\n");
                commands.append(endLabel).append(":\n");
                break;
            case BinaryOperator.LESS_EQUAL_THAN:
                commands.append("if_icmple ").append(trueLabel).append("\n");
                commands.append("iconst_0\n");
                commands.append("goto ").append(endLabel).append("\n");
                commands.append(trueLabel).append(":\n");
                commands.append("iconst_1\n");
                commands.append(endLabel).append(":\n");
                break;
            case BinaryOperator.GREATER_EQUAL_THAN:
                commands.append("if_icmpge ").append(trueLabel).append("\n");
                commands.append("iconst_0\n");
                commands.append("goto ").append(endLabel).append("\n");
                commands.append(trueLabel).append(":\n");
                commands.append("iconst_1\n");
                commands.append(endLabel).append(":\n");
                break;
            default:
                throw new UnsupportedOperationException("Unsupported binary operator: " + binaryExpression.getOperator());
        }

        return commands.toString();
    }

    @Override
    public String visit(UnaryExpression unaryExpression) {
        StringBuilder commands = new StringBuilder();
        commands.append(unaryExpression.getExpression().accept(this));
        switch (unaryExpression.getOperator()) {
            case NOT:
                commands.append("iconst_1\nixor\n");
                break;
            case MINUS:
                commands.append("ineg\n");
                break;
            case INC:
                if (unaryExpression.getExpression() instanceof Identifier) {
                    Identifier id = (Identifier) unaryExpression.getExpression();
                    int slot = slotOf(id.getName());
                    Type idType = id.accept(typeChecker);
                    if (idType instanceof IntType) {
                        commands.append("iinc ").append(slot).append(" 1\n");
                    }
                }
                break;
            case DEC:
                if (unaryExpression.getExpression() instanceof Identifier) {
                    Identifier id = (Identifier) unaryExpression.getExpression();
                    int slot = slotOf(id.getName());
                    Type idType = id.accept(typeChecker);
                    if (idType instanceof IntType) {
                        commands.append("iinc ").append(slot).append(" -1\n");
                    }
                }
                break;
        }
        return commands.toString();
    }

    @Override
    public String visit(Identifier identifier) {
        StringBuilder commands = new StringBuilder();
        int slot = slotOf(identifier.getName());
        Type idType;
        idType = identifier.accept(typeChecker);
        if (idType instanceof IntType || idType instanceof BoolType) {
            commands.append("iload ").append(slot).append("\n");
        } else {
            commands.append("aload ").append(slot).append("\n");
        }
        return commands.toString();
    }

    public String visit(LoopDoStatement loopDoStatement) {
        String startLabelLoop = getFreshLabel();
        String endLabelLoop = getFreshLabel();
        StringBuilder commands = new StringBuilder();
        commands.append(startLabelLoop).append(":\n");
        for (Statement stmtInLoop : loopDoStatement.getLoopBodyStmts()) {
            if (stmtInLoop instanceof IfStatement) {
                IfStatement ifStatement = (IfStatement) stmtInLoop;

                String elseLabel = getFreshLabel();
                String endLabel = getFreshLabel();
                commands.append(ifStatement.getConditions().getFirst().accept(this));
                if (!ifStatement.getElseBody().isEmpty()) {
                    commands.append("ifeq ").append(elseLabel).append("\n");

                    for (Statement stmt : ifStatement.getThenBody()) {
                        commands.append(stmt.accept(this));
                        if (stmt instanceof BreakStatement) {
                            commands.append(endLabelLoop).append("\n");
                        } else if (stmt instanceof NextStatement) {
                            commands.append(startLabelLoop).append("\n");
                        }
                    }

                    commands.append("goto ").append(endLabel).append("\n");

                    commands.append(elseLabel).append(":\n");

                    for (Statement stmt : ifStatement.getElseBody()) {
                        commands.append(stmt.accept(this));
                        if (stmt instanceof BreakStatement) {
                            commands.append(endLabelLoop).append("\n");
                        } else if (stmt instanceof NextStatement) {
                            commands.append(startLabelLoop).append("\n");
                        }
                    }

                    commands.append(endLabel).append(":\n");
                } else {
                    commands.append("ifeq ").append(elseLabel).append("\n");

                    for (Statement stmt : ifStatement.getThenBody()) {
                        commands.append(stmt.accept(this));
                        if (stmt instanceof BreakStatement) {
                            commands.append(endLabelLoop).append("\n");
                        } else if (stmt instanceof NextStatement) {
                            commands.append(startLabelLoop).append("\n");
                        }
                    }

                    commands.append(elseLabel).append(":\n");
                    commands.append(endLabel).append(":\n");

                }

            } else if (stmtInLoop instanceof BreakStatement) {
                commands.append(endLabelLoop).append("\n");
            } else if (stmtInLoop instanceof NextStatement) {
                commands.append(startLabelLoop).append("\n");
            } else {
                commands.append(stmtInLoop.accept(this));
            }
        }
        commands.append("goto ").append(startLabelLoop).append("\n");
        commands.append(endLabelLoop).append(":\n");
        return commands.toString();
    }

    @Override
    public String visit(BreakStatement breakStatement) {
        return "goto ";
    }

    @Override
    public String visit(NextStatement nextStatement) {
        return "goto ";
    }

    @Override
    public String visit(LenStatement lenStatement) {
        StringBuilder commands = new StringBuilder();
        Expression expr = lenStatement.getExpression();
        Type exprType = expr.accept(typeChecker);

        commands.append(expr.accept(this));

        if (exprType instanceof ListType) {

            commands.append("invokevirtual java/util/ArrayList/size()I\n");
        } else if (exprType instanceof StringType) {
            commands.append("invokevirtual java/lang/String/length()I\n");
        } else {
            throw new RuntimeException("Invalid type for LEN operation: " + exprType);
        }

        return commands.toString();
    }

    @Override
    public String visit(ChopStatement chopStatement) {
        StringBuilder commands = new StringBuilder();
        Expression expr = chopStatement.getChopExpression();
        Type exprType = expr.accept(typeChecker);

        commands.append(expr.accept(this));

        if (exprType instanceof StringType) {
            commands.append("dup\n")
                    .append("invokevirtual java/lang/String/length()I\n")
                    .append("iconst_1\n")
                    .append("isub\n")
                    .append("iconst_0\n")
                    .append("swap\n")
                    .append("invokevirtual java/lang/String/substring(II)Ljava/lang/String;\n");
        } else {
            throw new RuntimeException("Invalid type for CHOP operation: " + exprType);
        }

        return commands.toString();
    }

    @Override
    public String visit(FunctionPointer functionPointer) {
        return "";
    }

    @Override
    public String visit(ListValue listValue) {
        Type t = ((ListType) listValue.accept(typeChecker)).getType();
        StringBuilder commands = new StringBuilder();
        commands.append("new java/util/ArrayList\n");
        commands.append("dup\n");
        commands.append("invokespecial java/util/ArrayList/<init>()V\n");

        for (Expression element : listValue.getElements()) {
            commands.append("dup\n");
            commands.append(element.accept(this)).append("\n");
            if (t instanceof IntType) {
                commands.append("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;\n");
            } else if (t instanceof BoolType) {
                commands.append("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;\n");
            }
            commands.append("invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z\n");
            commands.append("pop\n");
        }

        return commands.toString();
    }

    @Override
    public String visit(IntValue intValue) {
        StringBuilder commands = new StringBuilder();
        commands.append("ldc ").append(intValue.getIntVal()).append("\n");

        return commands.toString();
    }

    @Override
    public String visit(BoolValue boolValue) {
        StringBuilder commands = new StringBuilder();

        int value = boolValue.getBool() ? 1 : 0;
        commands.append("ldc ").append(value).append("\n");

        return commands.toString();
    }

    @Override
    public String visit(StringValue stringValue) {
        StringBuilder commands = new StringBuilder();

        commands.append("ldc ").append(stringValue.getStr()).append("\n");
        return commands.toString();
    }

}
