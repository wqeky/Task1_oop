package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import singleton.SingletonSet;

public class SingletonSetTest {

    @Test
    public void testSingletonSet() {
        String value = "TestValue";
        SingletonSet<String> singletonSet = new SingletonSet<>(value);

        // Проверка методов
        assertEquals(1, singletonSet.size());
        assertFalse(singletonSet.isEmpty());
        assertTrue(singletonSet.contains(value));

        // Попытка добавления элемента должна вызвать исключение
        try {
            singletonSet.add("NewValue");
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }

        // Попытка удаления элемента должна вызвать исключение
        try {
            singletonSet.remove("TestValue");
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }

        // Попытка очистки множества должна вызвать исключение
        try {
            singletonSet.clear();
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }

        // Проверка toArray
        Object[] array = singletonSet.toArray();
        assertEquals(1, array.length);
        assertEquals(value, array[0]);

        // Попытка сортировки должна вызвать исключение
        try {
            singletonSet.sort((a, b) -> a.compareTo(b));
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }
    }
}
