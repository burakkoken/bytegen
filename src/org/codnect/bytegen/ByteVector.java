package org.codnect.bytegen;

/**
 * ByteVector holds byte data. If necessary, it
 * is automatically enlarged.
 *
 * @author Burak Koken
 */
public class ByteVector {

    /**
     * The data of this byte vector.
     */
    private byte[] data;

    /**
     * The actual size of the byte data.
     */
    private int actualSize;

    /**
     * Constructs a new with a default initial size.
     */
    public ByteVector(){
        data = new byte[64];
    }

    /**
     * Constructs a new with the given initial size.
     *
     * @param initialSize the initial size of the byte vector
     */
    public ByteVector(int initialSize){
        data = new byte[initialSize];
    }

    /**
     * Puts a byte into byte vector. If necessary, the byte
     * vector is automatically enlarged.
     *
     * @param b a byte
     * @return this byte vector object
     */
    public ByteVector putByte(byte b){

        if(actualSize + 1 > data.length){
            enlarge(1);
        }
        data[actualSize++] = b;

        return this;
    }

    /**
     * Puts a short into byte vector. If necessary, the byte
     * vector is automatically enlarged.
     *
     * @param s a short
     * @return this byte vector object
     */
    public ByteVector putShort(short s){

        if(actualSize + 2 > data.length){
            enlarge(2);
        }
        data[actualSize++] = (byte) (s >>> 8);
        data[actualSize++] = (byte) s;

        return this;
    }

    /**
     * Puts an integer into byte vector. If necessary, the byte
     * vector is automatically enlarged.
     *
     * @param i a integer
     * @return this byte vector object
     */
    public ByteVector putInt(int i){

        if(actualSize + 4 > data.length){
            enlarge(4);
        }
        data[actualSize++] = (byte) (i >>> 24);
        data[actualSize++] = (byte) (i >>> 16);
        data[actualSize++] = (byte) (i >>> 8);
        data[actualSize++] = (byte) i;

        return this;
    }

    /**
     * Puts a long into byte vector. If necessary, the byte
     * vector is automatically enlarged.
     *
     * @param l a long
     * @return this byte vector object
     */
    public ByteVector putLong(long l){

        if(actualSize + 8 > data.length){
            enlarge(8);
        }

        int high = (int) (l >>> 32);
        data[actualSize++] = (byte) (high >>> 24);
        data[actualSize++] = (byte) (high >>> 16);
        data[actualSize++] = (byte) (high >>> 8);
        data[actualSize++] = (byte) (high);

        int low = (int) l;
        data[actualSize++] = (byte) (low >>> 24);
        data[actualSize++] = (byte) (low >>> 16);
        data[actualSize++] = (byte) (low >>> 8);
        data[actualSize++] = (byte) (low);

        return this;
    }

    /**
     * Puts an UTF-8 string into byte vector. If necessary, the byte
     * vector is automatically enlarged.
     *
     * @param s an UTF-8 String
     * @return this byte vector object
     */
    public ByteVector putUTF8(String s){

        byte[] strBytes = s.getBytes();
        if(actualSize + strBytes.length > data.length){
            enlarge(strBytes.length);
        }

        for(int index = 0; index < strBytes.length; index++){
            data[actualSize++] = strBytes[index];
        }

        return this;
    }

    /**
     * Puts a byte array into byte vector. If necessary, the byte
     * vector is automatically enlarged.
     *
     * @param bytes a byte array
     * @param startPosition start position that will be copied
     * @param length byte length that will be copied
     * @return this byte vector object
     */
    public ByteVector putByteArray(byte[] bytes, int startPosition, int length){

        if(actualSize + length > data.length){
            enlarge(length);
        }

        System.arraycopy(bytes, startPosition, data, actualSize, length);
        actualSize += length;

        return this;
    }

    /**
     * Enlarge this byte vector.
     *
     * @param size additional bytes size
     */
    private void enlarge(int size){
        byte[] newDataArray = new byte[actualSize + size];
        System.arraycopy(data, 0, newDataArray, 0, actualSize);
        data = newDataArray;
    }

}

