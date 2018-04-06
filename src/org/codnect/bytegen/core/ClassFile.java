package org.codnect.bytegen.core;

import org.codnect.bytegen.util.ByteVector;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Burak Koken
 */
public class ClassFile {

    /**
     * The magic number for class file structure.
     */
    public static final int MAGIC_NUMBER = 0xCAFEBABE;

    /**
     *  The byte code data of this class.
     */
    private ByteVector byteVector;

    /**
     * The size of the constant pool items.
     */
    private int constantPoolSize;

    /**
     * The constant pool item map.
     */
    private Map<ConstantPoolItem, ConstantPoolItem> constantPoolItemMap;

    /**
     * Constructs a new ClassFile with given version, access flags,
     * this class, super class and interfaces.
     *
     * @param version version number
     * @param accessFlags access flags for this class
     * @param thisClass this class name
     * @param superClass super class name of this class
     * @param interfaces interfaces of this class
     */
    public ClassFile(int version,
                     int accessFlags,
                     String thisClass,
                     String superClass,
                     String[] interfaces){
        constantPoolItemMap = new HashMap<>();
        byteVector = new ByteVector();
        byteVector.putInt(MAGIC_NUMBER);
        byteVector.putShort((short) version);

        addClassItem(thisClass);
        addClassItem(superClass);

    }

    /**
     * Get the size of the constant pool items.
     *
     * @return the size of the constant pool items
     */
    public int getConstantPoolSize(){
        return constantPoolSize;
    }

    /**
     * Adds a new Utf8 constant pool item.
     *
     * @param str Utf-8 string value
     * @return the index value of the Utf8 constant pool item
     *         that is created.
     */
    public int addUtf8Item(String str){

        Utf8Item utf8Item = new Utf8Item(str);

        if(constantPoolItemMap.containsKey(utf8Item)){
            return constantPoolItemMap.get(utf8Item).getIndex();
        }


        utf8Item.setIndex(constantPoolSize + 1);
        constantPoolItemMap.put(utf8Item, utf8Item);
        constantPoolSize++;

        return utf8Item.getIndex();
    }

    /**
     * Adds a new Class constant pool item.
     *
     * @param className class name
     * @return the index value of the Class constant pool item
     *         that is created.
     */
    public int addClassItem(String className){

        ClassItem classItem = new ClassItem(className);

        if(constantPoolItemMap.containsKey(classItem)){
            return constantPoolItemMap.get(classItem).getIndex();
        }

        int classNameIndex = addUtf8Item(className);
        classItem.setClassNameIndex(classNameIndex);

        classItem.setIndex(constantPoolSize + 1);
        constantPoolItemMap.put(classItem, classItem);
        constantPoolSize++;

        return classItem.getIndex();
    }

    /**
     * Adds a new NameAndType constant pool item.
     *
     * @param methodName method name
     * @param methodSignature method signature
     * @return the index value of the NameAndType constant pool item
     *         that is created.
     */
    public int addNameAndTypeItem(String methodName, String methodSignature){

        NameAndTypeItem nameAndTypeItem = new NameAndTypeItem(methodName, methodSignature);

        if(constantPoolItemMap.containsKey(nameAndTypeItem)){
            return constantPoolItemMap.get(nameAndTypeItem).getIndex();
        }

        int methodNameIndex = addUtf8Item(methodName);
        nameAndTypeItem.setMethodNameIndex(methodNameIndex);

        int methodSignatureIndex = addUtf8Item(methodSignature);
        nameAndTypeItem.setMethodSignatureIndex(methodSignatureIndex);

        nameAndTypeItem.setIndex(constantPoolSize + 1);
        constantPoolItemMap.put(nameAndTypeItem, nameAndTypeItem);
        constantPoolSize++;

        return nameAndTypeItem.getIndex();
    }

    /**
     * Adds a new MethodRef constant pool item.
     *
     * @param className class name
     * @param methodName method name
     * @param methodSignature method signature
     * @return the index value of the MethodRef constant pool item
     *         that is created.
     */
    public int addMethodRefItem(String className, String methodName, String methodSignature){

        MethodRefItem methodRefItem = new MethodRefItem(className, methodName, methodSignature);

        if(constantPoolItemMap.containsKey(methodRefItem)){
            return constantPoolItemMap.get(methodRefItem).getIndex();
        }

        int classIndex = addClassItem(className);
        methodRefItem.setClassIndex(classIndex);

        int nameAndTypeIndex = addNameAndTypeItem(methodName, methodSignature);
        methodRefItem.setNameAndTypeIndex(nameAndTypeIndex);

        methodRefItem.setIndex(constantPoolSize + 1);
        constantPoolItemMap.put(methodRefItem, methodRefItem);
        constantPoolSize++;

        return methodRefItem.getIndex();
    }

}
