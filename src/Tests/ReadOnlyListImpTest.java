package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import readonly.ReadOnlyListImp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadOnlyListImpTest {

    @Test
    public void testReadOnlyListImp() {
        // Создаем оригинальный список
        List<String> originalList = new ArrayList<>(Arrays.asList("A", "B", "C"));
        ReadOnlyListImp<String> readOnlyList = new ReadOnlyListImp<>(originalList);

        // Проверка методов
        assertEquals(3, readOnlyList.size());
        assertFalse(readOnlyList.isEmpty());

        assertEquals("A", readOnlyList.get(0));
        assertEquals("B", readOnlyList.get(1));
        assertEquals("C", readOnlyList.get(2));

        assertEquals(1, readOnlyList.indexOf("B"));
        assertEquals(2, readOnlyList.lastIndexOf("C"));

        assertArrayEquals(new Object[]{"A", "B", "C"}, readOnlyList.toArray());

        // Попытка добавления элемента должна вызвать исключение
        try {
            readOnlyList.add("D");
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }

        // Попытка удаления элемента должна вызвать исключение
        try {
            readOnlyList.remove(0);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }

        // Попытка сортировки должна вызвать исключение
        try {
            readOnlyList.sort((a, b) -> a.compareTo(b));
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }
    }
}
