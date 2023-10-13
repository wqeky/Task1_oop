package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import singleton.SingletonMap;

public class SingletonMapTest {

    @Test
    public void testSingletonMap() {
        String key = "TestKey";
        String value = "TestValue";
        SingletonMap<String, String> singletonMap = new SingletonMap<>(key, value);

        // Проверка методов
        assertEquals(1, singletonMap.size());
        assertFalse(singletonMap.isEmpty());
        assertTrue(singletonMap.containsKey(key));
        assertTrue(singletonMap.containsValue(value));
        assertEquals(value, singletonMap.get(key));

        // Попытка добавления элемента должна вызвать исключение
        try {
            singletonMap.put("NewKey", "NewValue");
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }

        // Попытка удаления элемента должна вызвать исключение
        try {
            singletonMap.remove(key);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }

        // Попытка очистки карты должна вызвать исключение
        try {
            singletonMap.clear();
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }

        // Попытка сортировки должна вызвать исключение
        try {
            singletonMap.sort();
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }
    }
}
