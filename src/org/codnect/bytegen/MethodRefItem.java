package org.codnect.bytegen;

/**
 * @author Burak Koken
 */
public class MethodRefItem extends ConstantPoolItem {

    /**
     * The tag value of the MethodRef constant pool item.
     */
    public static final int TAG_VALUE = 10;

    /**
     * The name of the class.
     */
    private String className;

    /**
     * The name of the method.
     */
    private String methodName;

    /**
     * The signature of the method.
     */
    private String methodSignature;

    /**
     * The index value of the class.
     */
    private int classIndex;

    /**
     * The index value of the NameAndType.
     */
    private int nameAndTypeIndex;

    /**
     * Constructs a new MethodRef constant pool item.
     */
    public MethodRefItem(){

    }

    /**
     * Constructs a new MethodRef constant pool item with
     * given class name, method name and method signature.
     *
     * @param className
     * @param methodName
     * @param methodSignature
     */
    public MethodRefItem(String className, String methodName,  String methodSignature){
        this.className = className;
        this.methodName = methodName;
        this.methodSignature = methodSignature;
    }

    /**
     * Gets the name of the class.
     *
     * @return the name of the class
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the name of the class.
     *
     * @param className the name of the class
     */
    public void setClassName(String className) {
        this.className = className;
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
     * Gets the index value of the class.
     *
     * @return the index value of the class
     */
    public int getClassIndex() {
        return classIndex;
    }

    /**
     * Sets the index value of the class.
     *
     * @param classIndex the index value of the class
     */
    public void setClassIndex(int classIndex) {
        this.classIndex = classIndex;
    }

    /**
     * Gets the index value of the NameAndType.
     *
     * @return the index value of the NameAndType
     */
    public int getNameAndTypeIndex() {
        return nameAndTypeIndex;
    }

    /**
     * Sets the index value of the NameAndType.
     *
     * @param nameAndTypeIndex the index value of the NameAndType
     */
    public void setNameAndTypeIndex(int nameAndTypeIndex) {
        this.nameAndTypeIndex = nameAndTypeIndex;
    }

    /**
     * Gets the tag value of the MethodRef constant pool item.
     *
     * @return the tag value of the MethodRef constant pool item
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
        return TAG_VALUE + className.hashCode() + methodName.hashCode()
                + methodSignature.hashCode();
    }

    /**
     * Compares two MethodRef constant pool item objects.
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
        if(!(obj instanceof MethodRefItem)){
            return false;
        }

        MethodRefItem methodRefItem = (MethodRefItem) obj;
        return methodRefItem.getClassName().equals(className)
                && methodRefItem.getMethodName().equals(methodName)
                && methodRefItem.getMethodSignature().equals(methodSignature);
    }

}
