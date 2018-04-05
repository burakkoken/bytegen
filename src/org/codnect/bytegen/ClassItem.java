package org.codnect.bytegen;

/**
 * @author Burak Koken
 */
public class ClassItem extends ConstantPoolItem{

    /**
     * The tag value of the Class constant pool item.
     */
    public static final int TAG_VALUE = 7;

    /**
     * The name of the class.
     */
    private String className;

    /**
     * The index value of the class name.
     */
    private int classNameIndex;

    /**
     * Constructs a new Class constant pool item.
     */
    public ClassItem(){

    }

    /**
     * Constructs a new Class constant pool item with the
     * given class name.
     *
     * @param className class name
     */
    public ClassItem(String className){
        this.className = className;
    }

    /**
     * Gets the class name of the class constant pool item.
     *
     * @return class name
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the class name of the class constant pool item.
     *
     * @param className class name
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * Gets the index value of the class name.
     *
     * @return the index value of the class name
     */
    public int getClassNameIndex() {
        return classNameIndex;
    }

    /**
     * Sets the index value of the class name.
     *
     * @param classNameIndex the index value of the class name
     */
    public void setClassNameIndex(int classNameIndex) {
        this.classNameIndex = classNameIndex;
    }

    /**
     * Gets the tag value of the Class constant pool item.
     *
     * @return the tag value of the Class constant pool item
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
        return TAG_VALUE + className.hashCode();
    }

    /**
     * Compares two Class constant pool item objects.
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
        if(!(obj instanceof ClassItem)){
            return false;
        }

        ClassItem classItem = (ClassItem) obj;
        return classItem.getClassName().equals(className);
    }

}
