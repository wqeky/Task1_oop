package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import readonly.ReadOnlySet;

import java.util.HashSet;
import java.util.Set;

public class ReadOnlySetTest {

    @Test
    public void testReadOnlySet() {
        // Создаем оригинальное множество
        Set<String> originalSet = new HashSet<>();
        originalSet.add("A");
        originalSet.add("B");
        originalSet.add("C");

        ReadOnlySet<String> readOnlySet = new ReadOnlySet<>(originalSet);

        // Проверка методов
        assertEquals(3, readOnlySet.size());
        assertFalse(readOnlySet.isEmpty());

        assertTrue(readOnlySet.contains("A"));
        assertFalse(readOnlySet.contains("D"));

        assertArrayEquals(new Object[]{"A", "B", "C"}, readOnlySet.toArray());

        // Попытка добавления элемента должна вызвать исключение
        try {
            readOnlySet.add("D");
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }

        // Попытка удаления элемента должна вызвать исключение
        try {
            readOnlySet.remove("A");
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }

        // Попытка очистки множества должна вызвать исключение
        try {
            readOnlySet.clear();
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }

        // Попытка сортировки должна вызвать исключение
        try {
            readOnlySet.sort((a, b) -> a.compareTo(b));
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }
    }
}
