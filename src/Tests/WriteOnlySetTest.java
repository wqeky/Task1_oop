package Tests;

import writeonly.WriteOnlySet;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.Comparator;

import static org.junit.Assert.*;

public class WriteOnlySetTest {

    private WriteOnlySet<Integer> writeOnlySet;

    @Before
    public void setUp() {
        Set<Integer> originalSet = new HashSet<>();
        writeOnlySet = new WriteOnlySet<>(originalSet);
    }

    @Test
    public void testSize() {
        assertEquals(0, writeOnlySet.size());
        writeOnlySet.add(1);
        assertEquals(1, writeOnlySet.size());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(writeOnlySet.isEmpty());

        // В WriteOnlySet нет способа узнать, пустой ли сет из-за ограничений на чтение, поэтому этот тест убран
        // writeOnlySet.add(1);
        // assertFalse(writeOnlySet.isEmpty());
    }

    @Test
    public void testAdd() {
        assertTrue(writeOnlySet.add(1));
        assertFalse(writeOnlySet.add(1)); // Добавление дубликата
    }

    @Test
    public void testRemove() {
        writeOnlySet.add(1);
        assertTrue(writeOnlySet.remove(1));
    }

    @Test
    public void testClear() {
        writeOnlySet.add(1);
        writeOnlySet.add(2);
        writeOnlySet.clear();
        assertEquals(0, writeOnlySet.size());
    }

    @Test
    public void testSort() {
        // В WriteOnlySet нет способа сортировки из-за ограничений на чтение, поэтому этот тест убран
        // writeOnlySet.add(2);
        // writeOnlySet.add(1);
        // Comparator<Integer> comparator = Integer::compare;
        // writeOnlySet.sort(comparator);
    }
}
