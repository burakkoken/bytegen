package org.codnect.bytegen;

/**
 * This class contains the values of the access flags.
 *
 * @author Burak Koken
 */
public class AccessFlag {

    /* For class, field, method and nested class access */
    public static final int  ACC_PUBLIC = 0x0001;

    /* For field, method and nested class accesss */
    public static final int  ACC_PRIVATE = 0x0002;

    /* For field, method and nested class access */
    public static final int  ACC_PROTECTED = 0x0004;

    /* For field, method and nested class access */
    public static final int  ACC_STATIC = 0x0008;

    /* For class, field, method and nested class access */
    public static final int ACC_FINAL = 0x0010;

    /* For class */
    public static final int ACC_SUPER = 0x0020;

    /* For method */
    public static final int  ACC_SYNCHRONIZED = 0x0020;

    /* For field */
    public static final int  ACC_VOLATILE = 0x0040;

    /* For method */
    public static final int  ACC_BRIDGE = 0x0040;

    /* For field */
    public static final int  ACC_TRANSIENT = 0x0080;

    /* For method */
    public static final int  ACC_VARARGS = 0x0080;

    /* For method */
    public static final int  ACC_NATIVE = 0x0100;

    /* For class and nested class access */
    public static final int ACC_INTERFACE = 0x0200;

    /* For class, method and nested class access */
    public static final int ACC_ABSTRACT = 0x0400;

    /* For method */
    public static final int ACC_STRICT = 0x0800;

    /* For class, field, method and nested class access */
    public static final int ACC_SYNTHETIC = 0x1000;

    /* For class and nested class access */
    public static final int ACC_ANNOTATION = 0x2000;

    /* For class, field and nested class access */
    public static final int  ACC_ENUM = 0x4000;

}