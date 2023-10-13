package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import singleton.SingletonList;

public class SingletonListTest {

    @Test
    public void testSingletonList() {
        String value = "TestValue";
        SingletonList<String> singletonList = new SingletonList<>(value);

        // Проверка методов
        assertEquals(1, singletonList.size());
        assertFalse(singletonList.isEmpty());
        assertEquals(value, singletonList.get(0));

        // Попытка добавления элемента должна вызвать исключение
        try {
            singletonList.add("NewValue");
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }

        // Попытка удаления элемента должна вызвать исключение
        try {
            singletonList.remove(0);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }

        // Проверка indexOf и lastIndexOf
        assertEquals(0, singletonList.indexOf(value));
        assertEquals(0, singletonList.lastIndexOf(value));
        assertEquals(-1, singletonList.indexOf("AnotherValue"));

        // Попытка сортировки должна вызвать исключение
        try {
            singletonList.sort((a, b) -> a.compareTo(b));
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }

        // Проверка toArray
        Object[] array = singletonList.toArray();
        assertEquals(1, array.length);
        assertEquals(value, array[0]);
    }
}
