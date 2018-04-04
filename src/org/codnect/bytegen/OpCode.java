package org.codnect.bytegen;

/**
 * This class contains the values of the jvm instructions.
 *
 * @author Burak Koken
 */
public class OpCode {

    /* Load reference from array */
    public static final int AALOAD = 0x32;

    /* Store into refence array */
    public static final int AASTORE = 0x53;

    /* Push null */
    public static final int ACONST_NULL = 0x1;

    /* Load reference from local variable */
    public static final int ALOAD = 0x19;

    public static final int ALOAD_0 = 0x2A;

    public static final int ALOAD_1 = 0x2B;

    public static final int ALOAD_2 = 0x2C;

    public static final int ALOAD_3 = 0x2D;

    /* Create new array of refence */
    public static final int ANEWARRAY = 0xBD;

    /* Return reference from method */
    public static final int ARETURN = 0xB0;

    /* Get length of array */
    public static final int ARRAY_LENGTH = 0xBE;

    /* Store reference into local variable */
    public static final int ASTORE = 0x3A;

    public static final int ASTORE_0 = 0x4B;

    public static final int ASTORE_1 = 0x4C;

    public static final int ASTORE_2 = 0x4D;

    public static final int ASTORE_3 = 0x4E;

    /* Throw exception or error */
    public static final int ATHROW = 0xBF;

    /* Load int or boolean from array */
    public static final int BALOAD = 0x33;

    /* Store into int or boolean array */
    public static final int BASTORE = 0x54;

    /* Push int */
    public static final int BIPUSH = 0x10;

    /* Load char from array */
    public static final int CALOAD = 0x34;

    /* Store into char array */
    public static final int CASTORE = 0x55;

    /* Check whether object is of given type */
    public static final int CHECKCAST = 0xC0;

    /* Convert double to float */
    public static final int D2F = 0x90;

    /* Convert double to int */
    public static final int D2I = 0x8E;

    /* Convert double to long */
    public static final int D2L = 0x8F;

    /* Add double */
    public static final int DADD = 0x63;

    /* Load double from array */
    public static final int DALOAD = 0x31;

    /* Store into double array */
    public static final int DASTORE = 0x52;

    /* Compare double */
    public static final int DCMPG = 0x98;

    public static final int DCMPL = 0x97;

    /* Push double */
    public static final int DCONST_0 = 0xE;

    public static final int DCONST_1 = 0xF;

    /* Divide double */
    public static final int DDIV = 0x6F;

    /* Load double from local variable */
    public static final int DLOAD = 0x18;

    public static final int DLOAD_0 = 0x26;

    public static final int DLOAD_1 = 0x27;

    public static final int DLOAD_2 = 0x28;

    public static final int DLOAD_3 = 0x29;

    /* Multiply double */
    public static final int DMUL = 0x6B;

    /* Negate double */
    public static final int DNEG = 0x77;

    /* Remainder double */
    public static final int DREM = 0x73;

    /* Return double from method */
    public static final int DRETURN = 0xAF;

    /* Store double into local variable */
    public static final int DSTORE = 0x39;

    public static final int DSTORE_0 = 0x47;

    public static final int DSTORE_1 = 0x48;

    public static final int DSTORE_2 = 0x49;

    public static final int DSTORE_3 = 0x4A;

    /* Subtract double */
    public static final int DSUB = 0x67;

    /* Duplicate the top operand stack value */
    public static final int DUP = 0x59;

    /* Duplicate the top operand stack value and insert two values down */
    public static final int DUP_X1 = 0x5A;

    /* Duplicate the top operand stack value and insert two or three values down */
    public static final int DUP_x2 = 0x5B;

    /* Duplicate the top one or two operand stack values */
    public static final int DUP2 = 0x5C;

    /* Duplicate the top one or two operand stack values and insert two or three values down */
    public static final int DUP2_X1 = 0x5D;

    /* Duplicate the top one or two operand stack values and insert two, three, or four values down */
    public static final int DUP2_X2 = 0x5E;

    /* Convert float to double */
    public static final int F2D = 0x8D;

    /* Convert float to int */
    public static final int F2I = 0x8B;

    /* Convert float to long */
    public static final int F2L = 0x8C;

    /* Add float */
    public static final int FADD = 0x62;

    /* Load float from array */
    public static final int FALOAD = 0x30;

    /* Store into float array */
    public static final int FASTORE = 0x51;

    /* Compare float */
    public static final int FCMPG = 0x96;

    public static final int FCMPL = 0x95;

    /* Push float */
    public static final int FCONST_0 = 0xB;

    public static final int FCONST_1 = 0xC;

    public static final int FCONST_2 = 0xD;

    /* Divide float */
    public static final int FDIV = 0x6E;

    /* Load float from local variable */
    public static final int FLOAD = 0x17;

    public static final int FLOAD_0 = 0x22;

    public static final int FLOAD_1 = 0x23;

    public static final int FLOAD_2 = 0x24;

    public static final int FLOAD_3 = 0x25;

    /* Multiply float */
    public static final int FMUL = 0x6A;

    /* Negate float */
    public static final int FNEG = 0x76;

    /* Remainder float */
    public static final int FREM = 0x72;

    /* Return float from method */
    public static final int FRETURN = 0xAE;

    /* Store float into local variable */
    public static final int FSTORE = 0x38;

    public static final int FSTORE_0 = 0x43;

    public static final int FSTORE_1 = 0x44;

    public static final int FSTORE_2 = 0x45;

    public static final int FSTORE_3 = 0x46;

    /* Subtract float */
    public static final int FSUB = 0x66;

    /* Fetch field from object */
    public static final int GETFIELD = 0xB4;

    /* Get static field from class */
    public static final int GETSTATIC = 0xB4;

    /* Branch always */
    public static final int GOTO = 0xA7;

    /* Branch always (wide index) */
    public static final int GOTO_W = 0xC8;

    /* Convert int to byte */
    public static final int I2B = 0x91;

    /* Convert int to char */
    public static final int I2C = 0x92;

    /* Convert int to double */
    public static final int I2D = 0x87;

    /* Convert int to float */
    public static final int I2F = 0x86;

    /* Convert int to long */
    public static final int I2L = 0x85;

    /* Convert int to short */
    public static final int I2S = 0x93;

    /* Add int */
    public static final int IADD = 0x60;

    /* Load int from array */
    public static final int IALOAD = 0x2E;

    /* Boolean and int */
    public static final int IAND = 0x7E;

    /* Store into int array */
    public static final int IASOTRE = 0x4F;

    /* Push int constant */
    public static final int ICONST_M1 = 0x2;

    public static final int ICONST_0 = 0x3;

    public static final int ICONST_1 = 0x4;

    public static final int ICONST_2 = 0x5;

    public static final int ICONST_3 = 0x6;

    public static final int ICONST_4 = 0x7;

    public static final int ICONST_5 = 0x8;

    /* Divide int */
    public static final int IDIV = 0x6C;

    /* Branch if reference comparison succeeds */
    public static final int IF_ACMPEQ = 0xA5;

    public static final int IF_ACMPNE = 0xA6;

    /* Branch if int comparison succeeds */
    public static final int IF_ICMPEQ = 0x9F;

    public static final int IF_ICMPNE = 0xA0;

    public static final int IF_ICMPLT = 0xA1;

    public static final int IF_ICMPGE = 0xA2;

    public static final int IF_ICMPGT = 0xA3;

    public static final int IF_ICMPLE = 0xA4;

    /* Branch if int comparison with zero succeeds */
    public static final int IFEQ = 0x99;

    public static final int IFNE = 0x9A;

    public static final int IFLT = 0x9B;

    public static final int IFGE = 0x9C;

    public static final int IFGT = 0x9D;

    public static final int IFLE = 0x9E;

    /* Branch if reference not null */
    public static final int IFNONNULL = 0xC7;

    /* Branch if reference is null */
    public static final int IFNULL = 0xC6;

    /* Increment local variable by constant */
    public static final int IINC = 0x84;

    /* Load int from local variable */
    public static final int ILOAD = 0x15;

    public static final int ILOAD_0 = 0x1A;

    public static final int ILOAD_1 = 0x1B;

    public static final int ILOAD_2 = 0x1C;

    public static final int ILOAD_3 = 0x1D;

    /* Multiply int */
    public static final int IMUL = 0x68;

    /* Negate int */
    public static final int INEG = 0x74;

    /* Determine if object is of given type */
    public static final int INSTANCE_OF = 0xC1;

    /* Invoke dynamic method */
    public static final int INVOKEDYNAMIC = 0xBA;

    /* Invoke interface method */
    public static final int INVOKEINTERFACE = 0xB9;

    /* Invoke instance method; special handling for superclass, private, and instance initialization method invocations */
    public static final int INVOKESPECIAL = 0xB7;

    /* Invoke a class (static) method */
    public static final int INVOKESTATIC = 0xB8;

    /* Invoke instance method; dispatch based on class */
    public static final int INVOKEVIRTUAL = 0xB6;

    /* Boolean OR int */
    public static final int IOR = 0x80;

    /* Remainder int */
    public static final int IREM = 0x70;

    /* Return int from method */
    public static final int IRETURN = 0xAC;

    /* Shift left int */
    public static final int ISHL = 0x78;

    /* Arithmetic shift right int */
    public static final int ISHR = 0x7A;

    /* Store int into local variable */
    public static final int ISTORE = 0x36;

    public static final int ISTORE_0 = 0x3B;

    public static final int ISTORE_1 = 0x3C;

    public static final int ISTORE_2 = 0x3D;

    public static final int ISTORE_3 = 0x3E;

    /* Subtract int */
    public static final int ISUB = 0x64;

    /* Logical shift right int */
    public static final int IUSHR = 0x7C;

    /* Boolean XOR int */
    public static final int IXOR = 0x82;

    /* Jump subroutine */
    public static final int JSR = 0xA8;

    /* Jump subroutine (wide index) */
    public static final int JSR_W = 0xC9;

    /* Convert long to double */
    public static final int L2D = 0x8A;

    /* Convert long to float */
    public static final int L2F = 0x89;

    /* Convert long to int */
    public static final int L2I = 0x88;

    /* Add long */
    public static final int LADD = 0x61;

    /* Load long from array */
    public static final int LALOAD = 0x2F;

    /* Boolean AND long */
    public static final int LAND = 0x7F;

    /* Store into long array */
    public static final int LASTORE = 0x50;

    /* Compare long */
    public static final int LCMP = 0x94;

    /* Push long constant */
    public static final int LCONST_0 = 0x9;

    public static final int LCONST_1 = 0xA;

    /* Push item from run-time constant pool */
    public static final int LDC = 0x12;

    /* Push item from run-time constant pool (wide index) */
    public static final int LDC_W = 0x13;

    /* Push long or double from run-time constant pool (wide index) */
    public static final int LDC2_W = 0x14;

    /* Divide long */
    public static final int LDIV = 0x6D;

    /* Load long from local variable */
    public static final int LLOAD = 0x16;

    public static final int LLOAD_0 = 0x1E;

    public static final int LLOAD_1 = 0x1F;

    public static final int LLOAD_2 = 0x20;

    public static final int LLOAD_3 = 0x21;

    /* Multiply long */
    public static final int LMUL = 0x69;

    /* Negate long */
    public static final int LNEG = 0x75;

    /* Access jump table by key match and jump */
    public static final int LOOKUPSWITCH = 0xAB;

    /* Boolean OR long */
    public static final int LOR = 0x81;

    /* Remainder long */
    public static final int LREM = 0x71;

    /* Return long from method */
    public static final int LRETURN = 0xAD;

    /* Shift left long */
    public static final int LSHL = 0x79;

    /* Arithmetic shift right long */
    public static final int LSHR = 0x7B;

    /* Store long into local variable */
    public static final int LSTORE = 0x37;

    public static final int LSTORE_0 = 0x3F;

    public static final int LSTORE_1 = 0x40;

    public static final int LSTORE_2 = 0x41;

    public static final int LSTORE_3 = 0x42;

    /* Subtract long */
    public static final int LSUB = 0x65;

    /* Logical shift right long */
    public static final int LUSHR = 0x7D;

    /* Boolean XOR long */
    public static final int LXOR = 0x83;

    /* Enter monitor for object */
    public static final int MONITORENTER = 0xC2;

    /* Exit monitor for object */
    public static final int MONITOREXIT = 0xC3;

    /* Create new multidimensional array */
    public static final int MULTIANEWARRAY = 0xC5;

    /* Create new object */
    public static final int NEW = 0xBB;

    /* Create new array */
    public static final int NEWARRAY = 0xBC;

    /* Do nothing */
    public static final int NOP = 0x0;

    /* Pop the top operand stack value */
    public static final int POP = 0x57;

    /* Pop the top one or two operand stack values */
    public static final int POP2 = 0x58;

    /* Set field in object */
    public static final int PUTFIELD = 0xB5;

    /* Set static field in class */
    public static final int PUTSTATIC = 0xB3;

    /* Return from subroutine */
    public static final int RET = 0xA9;

    /* Return void from method */
    public static final int RETURN = 0xB1;

    /* Load short from array */
    public static final int SALOAD = 0x35;

    /* Store into short array */
    public static final int SASTORE = 0x56;

    /* Push short */
    public static final int SIPUSH = 0x11;

    /* Swap the top two operand stack values */
    public static final int SWAP = 0x5F;

    /* Access jump table by index and jump */
    public static final int TABLESWITCH = 0xAA;

    /* Extend local variable index by additional bytes */
    public static final int WIDE = 0xC4;

}

