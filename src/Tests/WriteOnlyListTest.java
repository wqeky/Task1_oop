package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import writeonly.WriteOnlyList;

import java.util.ArrayList;
import java.util.List;

public class WriteOnlyListTest {

    @Test
    public void testWriteOnlyList() {
        List<String> originalList = new ArrayList<>();
        originalList.add("A");
        originalList.add("B");
        originalList.add("C");

        WriteOnlyList<String> writeOnlyList = new WriteOnlyList<>(originalList);

        // Проверка методов
        assertEquals(3, writeOnlyList.size());
        assertFalse(writeOnlyList.isEmpty());

        // Попытка получения элемента должна вызвать исключение
        try {
            writeOnlyList.get(0);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            // Ожидаемое исключение
        }

        // Добавление элемента
        writeOnlyList.add("D");
        assertEquals(4, originalList.size());
        assertEquals("D", originalList.get(3));

        // Удаление элемента
        writeOnlyList.remove(1);
        assertEquals(3, originalList.size());
        assertEquals("A", originalList.get(0));
        assertEquals("C", originalList.get(1));

        // Проверка indexOf и lastIndexOf
        assertEquals(0, writeOnlyList.indexOf("A"));
        assertEquals(2, writeOnlyList.lastIndexOf("C"));

        // Сортировка
        writeOnlyList.sort((a, b) -> b.compareTo(a));
        assertEquals("C", originalList.get(0));
        assertEquals("A", originalList.get(1));
    }
}

