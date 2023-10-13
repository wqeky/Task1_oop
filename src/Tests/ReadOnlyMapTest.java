package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import readonly.ReadOnlyMap;

import java.util.HashMap;
import java.util.Map;

public class ReadOnlyMapTest {

    @Test
    public void testReadOnlyMap() {
        // Создаем оригинальную карту
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("One", 1);
        originalMap.put("Two", 2);
        originalMap.put("Three", 3);

        ReadOnlyMap<String, Integer> readOnlyMap = new ReadOnlyMap<>(originalMap);

        // Проверка методов
        assertEquals(3, readOnlyMap.size());
        assertFalse(readOnlyMap.isEmpty());

        assertTrue(readOnlyMap.containsKey("One"));
        assertTrue(readOnlyMap.containsValue(2));
        assertEquals(Integer.valueOf(1), readOnlyMap.get("One"));
        assertNull(readOnlyMap.get("Four"));

        // Попытка добавления элемента должна вызвать исключение
        try {
            readOnlyMap.put("Four", 4);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }

        // Попытка удаления элемента должна вызвать исключение
        try {
            readOnlyMap.remove("One");
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }

        // Попытка очистки карты должна вызвать исключение
        try {
            readOnlyMap.clear();
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }

        // Попытка сортировки должна вызвать исключение
        try {
            readOnlyMap.sort();
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }
    }
}
