import org.codnect.bytegen.ByteVector;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Burak Koken
 */
public class ByteVectorTest {

    @Test
    public void testPutByte(){

        ByteVector byteVector = new ByteVector(5);

        byteVector.putByte((byte) 10);
        byteVector.putByte((byte) 11);
        byteVector.putByte((byte) 12);
        byteVector.putByte((byte) 14);
        byteVector.putByte((byte) 15);
        /* check actual size */
        assertEquals(5, byteVector.getActualSize());

        /* check enlarge */
        byteVector.putByte((byte) 16);
        assertEquals(6, byteVector.getActualSize());
        assertEquals(6, byteVector.getData().length);

    }

    @Test
    public void testPutShort(){

        ByteVector byteVector = new ByteVector(4);

        byteVector.putShort((short) 10);
        byteVector.putShort((short) 11);
        assertEquals(4, byteVector.getActualSize());

        /* check enlarge */
        byteVector.putShort((short) 0xABCD);
        assertEquals(6, byteVector.getActualSize());
        assertEquals(6, byteVector.getData().length);

    }

    @Test
    public void testPutInteger(){

        ByteVector byteVector = new ByteVector(8);

        byteVector.putInt(10);
        byteVector.putInt(20);
        assertEquals(8, byteVector.getActualSize());

        /* check enlarge */
        byteVector.putInt(30);
        assertEquals(12, byteVector.getActualSize());
        assertEquals(12, byteVector.getData().length);

    }

    @Test
    public void testPutLong(){

        ByteVector byteVector = new ByteVector(16);

        byteVector.putLong(10L);
        byteVector.putLong(20L);
        assertEquals(16, byteVector.getActualSize());

        /* check enlarge */
        byteVector.putLong(30L);
        assertEquals(24, byteVector.getActualSize());
        assertEquals(24, byteVector.getData().length);

    }

    @Test
    public void testPutUTF8(){

        ByteVector byteVector = new ByteVector(5);
        String s = "Vector";

        byteVector.putUTF8(s);
        assertEquals(s.getBytes().length, byteVector.getActualSize());
        int oldLength = s.getBytes().length;

        /* check enlarge */
        s = "Byte Vector UTF-8 Test";
        byteVector.putUTF8(s);
        assertEquals(oldLength + s.getBytes().length, byteVector.getActualSize());
        assertEquals(oldLength + s.getBytes().length, byteVector.getData().length);

    }

    @Test
    public void testPutArray(){

        ByteVector byteVector = new ByteVector(5);
        byte[] bytes = new byte[]{2, 5, 6, 7, 7, 9};

        /* check enlarge */
        byteVector.putByteArray(bytes, 0, bytes.length);
        assertEquals(bytes.length, byteVector.getActualSize());
        assertEquals(bytes.length, byteVector.getData().length);

    }

}
