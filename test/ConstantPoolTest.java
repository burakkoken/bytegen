import org.codnect.bytegen.core.ClassItem;
import org.codnect.bytegen.core.ConstantPoolItem;
import org.codnect.bytegen.core.Utf8Item;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Burak Koken
 */
public class ConstantPoolTest {

    @Test
    public void testUtf8ConstantPoolItem(){
        Map<ConstantPoolItem, ConstantPoolItem> constantPoolItemMap = new HashMap<>();

        Utf8Item utf8Item1 = new Utf8Item("Hello World!");
        constantPoolItemMap.put(utf8Item1, utf8Item1);
        assertTrue(constantPoolItemMap.containsKey(new Utf8Item("Hello World!")));

        Utf8Item utf8Item2 = new Utf8Item("Hello Bytegen!");
        assertFalse(constantPoolItemMap.containsKey(utf8Item2));

        constantPoolItemMap.put(utf8Item2, utf8Item2);
        assertTrue(constantPoolItemMap.containsKey(utf8Item2));
    }

    @Test
    public void testClassConstantPoolItem(){
        Map<ConstantPoolItem, ConstantPoolItem> constantPoolItemMap = new HashMap<>();

        ClassItem classItem1 = new ClassItem("Main");
        constantPoolItemMap.put(classItem1, classItem1);
        assertTrue(constantPoolItemMap.containsKey(new ClassItem("Main")));

        ClassItem classItem2 = new ClassItem("Util");
        assertFalse(constantPoolItemMap.containsKey(classItem2));

        constantPoolItemMap.put(classItem2, classItem2);
        assertTrue(constantPoolItemMap.containsKey(classItem2));
    }

}
