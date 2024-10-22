# FunctionCraft-Compiler

# Compiler Project

This repository contains the source code for a compiler developed as part of a compiler course. The project is divided into four main phases:

1. Lexical Analysis
2. Name Analysis
3. Type Analysis
4. Code Generation

## Project Overview

This project implements a compiler that translates a custom programming language into Jasmin bytecodes. The project is divided into four phases, each focusing on a specific aspect of the compilation process.

### Phase 1: Lexical Analysis

**Description:**

In this phase, the compiler reads the source code and converts it into a stream of tokens. This process is known as lexical analysis or scanning. The lexer (lexical analyzer) uses a grammar specification to identify the different tokens in the source code, such as keywords, identifiers, operators, and literals.

**Key Components:**

- **Lexer Specification:** Defines the grammar rules for tokenizing the source code.
- **Lexer Implementation:** The code that reads the source code and produces tokens based on the grammar.

### Phase 2: Name Analysis

**Description:**

During name analysis, the compiler checks for proper declaration and usage of variables and functions. This phase ensures that all identifiers are declared before they are used and that they follow the scope rules of the language. It involves building a symbol table to keep track of declared identifiers and their associated information.

**Key Components:**

- **Symbol Table:** A data structure that stores information about identifiers.
- **Name Analyzer:** The code that traverses the abstract syntax tree (AST) to perform name resolution and scope checking.

### Phase 3: Type Analysis

**Description:**

The type analysis phase involves checking the types of expressions and ensuring type compatibility. This phase verifies that operations are performed on compatible types and that function calls have the correct arguments. Type checking helps to catch type errors and enforce type safety in the code.

**Key Components:**

- **Type Checker:** The code that performs type inference and type checking on the AST.
- **Type Rules:** The rules that define type compatibility and type inference for the language constructs.

### Phase 4: Code Generation

**Description:**

In the final phase, the compiler generates Jasmin bytecode from the intermediate representation of the source code. This bytecode can be executed on the Java Virtual Machine (JVM). The code generation phase translates the high-level constructs of the programming language into low-level bytecode instructions.

**Key Components:**

- **Code Generator:** The code that traverses the AST and generates corresponding Jasmin bytecode instructions.
- **Bytecode Writer:** The component that writes the generated bytecode to a file.
