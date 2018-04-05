package org.codnect.bytegen;

/**
 * @author Burak Koken
 */
public abstract class ConstantPoolItem {

    /**
     * The index value of the constant pool item.
     */
    private int index;

    public ConstantPoolItem(){

    }

    /**
     * Gets the index value of the constant pool item.
     *
     * @return the index value of the constant pool item
     */
    public int getIndex() {
        return index;
    }

    /**
     * Sets the index value of the constant pool item.
     *
     * @param index the new index value of the constant pool item
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * Returns the tag value of the constant pool item.
     *
     * @return the tag value of the constant pool item
     */
    public abstract int getItemTagValue();

}
