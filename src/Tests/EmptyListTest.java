package Tests;

import static org.testng.AssertJUnit.*;

import empty.EmptyList;
import interfaces.ListExample;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmptyListTest {

    @Test
    public void testEmptyList() {
        ListExample<String> emptyList = new EmptyList<>();

        // Проверка методов
        assertEquals(0, emptyList.size());
        Assert.assertTrue(emptyList.isEmpty());
        assertNull(emptyList.get(0));

        // Попытка добавления элемента должна вызвать исключение
        try {
            emptyList.add("Element");
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }

        // Попытка удаления элемента должна вызвать исключение
        try {
            emptyList.remove(0);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }

        // Проверка indexOf и lastIndexOf
        assertEquals(0, emptyList.indexOf("Element"));
        assertEquals(0, emptyList.lastIndexOf("Element"));

        // Попытка сортировки должна вызвать исключение
        try {
            emptyList.sort((a, b) -> a.compareTo(b));
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }

        // Проверка toArray
        Object[] array = emptyList.toArray();
        assertEquals(0, array.length);
    }
}

