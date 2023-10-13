package Tests;
import static org.junit.Assert.*;

import empty.EmptySet;
import interfaces.SetExample;
import org.junit.Test;

public class EmptySetTest {

    @Test
    public void testEmptySet() {
        SetExample<String> emptySet = new EmptySet<>();

        // Проверка методов
        assertEquals(0, emptySet.size());
        assertTrue(emptySet.isEmpty());
        assertFalse(emptySet.contains("Element"));

        // Попытка добавления элемента должна вызвать исключение
        try {
            emptySet.add("Element");
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }

        // Попытка удаления элемента должна вызвать исключение
        try {
            emptySet.remove("Element");
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }

        // Попытка очистки множества должна вызвать исключение
        try {
            emptySet.clear();
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }

        // Проверка toArray
        Object[] array = emptySet.toArray();
        assertEquals(0, array.length);

        // Попытка сортировки должна вызвать исключение
        try {
            emptySet.sort((a, b) -> a.compareTo(b));
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }
    }
}
