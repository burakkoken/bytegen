package org.codnect.bytegen.core;

/**
 * @author Burak Koken
 */
public class Utf8Item extends ConstantPoolItem {

    /**
     * The tag value of the Utf-8 constant pool item.
     */
    public static final int TAG_VALUE = 1;

    /**
     * The value of the Utf-8 constant pool item.
     */
    private String value;

    /**
     * Constructs a new Utf-8 constant pool item.
     */
    public Utf8Item(){

    }

    /**
     * Constructs a new Utf-8 constant pool item with the
     * given value.
     *
     * @param value
     */
    public Utf8Item(String value){
        this.value = value;
    }

    /**
     * Gets the value of Utf-8 constant pool item.
     *
     * @return the value of Utf-8 constant pool item
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the Utf-8 constant pool item.
     *
     * @param value the new value of the Utf-8 constant pool item
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the tag value of the Utf-8 constant pool item.
     *
     * @return the tag value of the Utf-8 constant pool item
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
        return TAG_VALUE + value.hashCode();
    }

    /**
     * Compares two Utf-8 constant pool item objects.
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
        if(!(obj instanceof Utf8Item)){
            return false;
        }

        Utf8Item utf8Item = (Utf8Item) obj;
        return utf8Item.getValue().equals(value);
    }

}
