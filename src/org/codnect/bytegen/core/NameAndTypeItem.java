package org.codnect.bytegen.core;

/**
 * @author Burak Koken
 */
public class NameAndTypeItem extends ConstantPoolItem {

    /**
     * The tag value of the NameAndType constant pool item.
     */
    public static final int TAG_VALUE = 12;

    /**
     * The name of the method.
     */
    private String methodName;

    /**
     * The signature of the method.
     */
    private String methodSignature;

    /**
     * The index value of the method name.
     */
    private int methodNameIndex;

    /**
     * The index value of the method signature.
     */
    private int methodSignatureIndex;

    /**
     * Constructs a new NameAndType constant pool item.
     */
    public NameAndTypeItem(){

    }

    /**
     * Constructs a new NameAndType constant pool item with
     * given method name and signature.
     *
     * @param methodName
     * @param methodSignature
     */
    public NameAndTypeItem(String methodName, String methodSignature){
        this.methodName = methodName;
        this.methodSignature = methodSignature;
    }

    /**
     * Gets the name of the method.
     *
     * @return the name of the method
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * Sets the name of the method.
     *
     * @param methodName the name of the method
     */
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    /**
     * Gets the signature of the method.
     *
     * @return the signature of the method.
     */
    public String getMethodSignature() {
        return methodSignature;
    }

    /**
     * Sets the signature of the method.
     *
     * @param methodSignature the signature of the method.
     */
    public void setMethodSignature(String methodSignature) {
        this.methodSignature = methodSignature;
    }

    /**
     * Gets the index value of the method name.
     *
     * @return  the index value of the method name
     */
    public int getMethodNameIndex() {
        return methodNameIndex;
    }

    /**
     * Sets the index value of the method name.
     *
     * @param methodNameIndex the index value of the method name
     */
    public void setMethodNameIndex(int methodNameIndex) {
        this.methodNameIndex = methodNameIndex;
    }

    /**
     * Gets the index value of the method signature.
     *
     * @return the index value of the method signature
     */
    public int getMethodSignatureIndex() {
        return methodSignatureIndex;
    }

    /**
     * Sets the index value of the method signature.
     *
     * @param methodSignatureIndex the index value of the method signature
     */
    public void setMethodSignatureIndex(int methodSignatureIndex) {
        this.methodSignatureIndex = methodSignatureIndex;
    }

    /**
     * Gets the tag value of the NameAndType constant pool item.
     *
     * @return the tag value of the NameAndType constant pool item
     */
    @Override
    public int getItemTagValue() {
        return TAG_VALUE;
    }

    /**
     * Returns a hash code value for the object.
     *
     * @return a hash code value for this object.
     */
    @Override
    public int hashCode() {
        return TAG_VALUE + methodName.hashCode() + methodSignature.hashCode();
    }

    /**
     * Compares two NameAndType constant pool item objects.
     *
     * @param obj another object
     * @return if two object are same, it returns "true".
     *         otherwise it return "false" value.
     */
    @Override
    public boolean equals(Object obj) {

        /* null check */
        if(obj == null){
            return false;
        }

        /* self check */
        if(obj == this){
            return true;
        }

        /* type check */
        if(!(obj instanceof NameAndTypeItem)){
            return false;
        }

        NameAndTypeItem nameAndTypeItem = (NameAndTypeItem) obj;
        return nameAndTypeItem.getMethodName().equals(methodName)
                && nameAndTypeItem.getMethodSignature().equals(methodSignature);
    }

}
