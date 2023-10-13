package Tests;

import writeonly.WriteOnlyMap;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class WriteOnlyMapTest {

    private WriteOnlyMap<String, Integer> writeOnlyMap;

    @Before
    public void setUp() {
        Map<String, Integer> originalMap = new HashMap<>();
        writeOnlyMap = new WriteOnlyMap<>(originalMap);
    }

    @Test
    public void testSize() {
        assertEquals(0, writeOnlyMap.size());
        writeOnlyMap.put("one", 1);
        assertEquals(1, writeOnlyMap.size());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(writeOnlyMap.isEmpty());
        writeOnlyMap.put("one", 1);
        assertFalse(writeOnlyMap.isEmpty());
    }

    @Test
    public void testContainsKey() {
        assertFalse(writeOnlyMap.containsKey("one"));
        writeOnlyMap.put("one", 1);
        assertTrue(writeOnlyMap.containsKey("one"));
    }

    @Test
    public void testContainsValue() {
        assertFalse(writeOnlyMap.containsValue(1));
        writeOnlyMap.put("one", 1);
        assertTrue(writeOnlyMap.containsValue(1));
    }

    @Test
    public void testPut() {
        writeOnlyMap.put("one", 1);
        assertEquals(1, writeOnlyMap.size());
    }

    @Test
    public void testRemove() {
        writeOnlyMap.put("one", 1);
        writeOnlyMap.remove("one");
        assertFalse(writeOnlyMap.containsKey("one"));
    }

    @Test
    public void testClear() {
        writeOnlyMap.put("one", 1);
        writeOnlyMap.put("two", 2);
        writeOnlyMap.clear();
        assertEquals(0, writeOnlyMap.size());
        assertTrue(writeOnlyMap.isEmpty());
    }

    @Test
    public void testSort() {
        writeOnlyMap.put("two", 2);
        writeOnlyMap.put("one", 1);
        writeOnlyMap.sort();
        // Check that the keys are now sorted
        String[] keys = writeOnlyMap.original.keySet().toArray(new String[0]);
        assertArrayEquals(new String[] { "one", "two" }, keys);
    }
}
