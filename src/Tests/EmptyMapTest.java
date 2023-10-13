package Tests;


import static org.junit.jupiter.api.Assertions.*;

import empty.EmptyMap;
import interfaces.MapExample;

import org.junit.jupiter.api.Test;

public class EmptyMapTest {

    @Test
    public void testEmptyMap() {
        MapExample<String, Integer> emptyMap = new EmptyMap<>();

        // Проверка методов
        assertEquals(0, emptyMap.size());
        assertTrue(emptyMap.isEmpty());
        assertNull(emptyMap.get("Key"));

        // Проверка методов, связанных с ключами
        assertFalse(emptyMap.containsKey("Key"));
        assertFalse(emptyMap.containsValue(42));

        // Попытка добавления элемента должна вызвать исключение
        try {
            emptyMap.put("Key", 42);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }

        // Попытка удаления элемента должна вызвать исключение
        try {
            emptyMap.remove("Key");
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }

        // Попытка очистки карты должна вызвать исключение
        try {
            emptyMap.clear();
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }

        // Попытка сортировки должна вызвать исключение
        try {
            emptyMap.sort();
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }
    }
}
