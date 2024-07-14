.class public Main
		.super java/lang/Object
.method public static main([Ljava/lang/String;)V
		.limit stack 128
		.limit locals 128
		new Main
		invokespecial Main/<init>()V
		return
		.end method
.method public static start(Ljava/lang/Boolean;Ljava/lang/Integer;)V
		.limit stack 128
		.limit locals 128
		aload 0
		invokevirtual java/lang/Boolean/booleanValue()Z
		istore 0
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		istore 1
		iload 0
		iconst_1
		ixor
		ifeq Label_0
		iload 0
		ifeq Label_2
		getstatic java/lang/System/out Ljava/io/PrintStream;
		iload 1
		ldc 30
		idiv
		invokevirtual java/io/PrintStream/println(I)V
		goto Label_3
		Label_2:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		iload 1
		ldc 30
		imul
		invokevirtual java/io/PrintStream/println(I)V
		Label_3:
		Label_0:
		Label_1:
		invokestatic Main/itList()V
		return
		.end method
.method public static itList()V
		.limit stack 128
		.limit locals 128
		new java/util/ArrayList
		dup
		invokespecial java/util/ArrayList/<init>()V
		dup
		ldc "ata"
		
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		dup
		ldc "souri"
		
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		dup
		ldc "javad"
		
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		dup
		ldc "nemati"
		
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		dup
		ldc "darabi"
		
		invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z
		pop
		ldc 0
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokestatic Main/printRecursive(Ljava/util/ArrayList;Ljava/lang/Integer;)V
		return
		.end method
.method public static printRecursive(Ljava/util/ArrayList;Ljava/lang/Integer;)V
		.limit stack 128
		.limit locals 128
		aload 0
		astore 0
		aload 1
		invokevirtual java/lang/Integer/intValue()I
		istore 1
		iload 1
		ldc 5
		if_icmpeq Label_10
		iconst_0
		goto Label_11
		Label_10:
		iconst_1
		Label_11:
		ifeq Label_8
		return
		Label_8:
		Label_9:
		getstatic java/lang/System/out Ljava/io/PrintStream;
		aload 0
		iload 1
		
		invokevirtual java/util/ArrayList/get(I)Ljava/lang/Object;
		checkcast java/lang/String
		invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
		aload 0
		iload 1
		ldc 1
		iadd
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokestatic Main/printRecursive(Ljava/util/ArrayList;Ljava/lang/Integer;)V
		return
		.end method
.method public <init>()V
		.limit stack 128
		.limit locals 128
		aload_0
		invokespecial java/lang/Object/<init>()V
		ldc 1
		invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;
		ldc 300
		invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;
		invokestatic Main/start(Ljava/lang/Boolean;Ljava/lang/Integer;)V
		return
		.end method
