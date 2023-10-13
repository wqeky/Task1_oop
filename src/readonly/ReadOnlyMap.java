package readonly;

import interfaces.MapExample;

import java.util.Map;

public class ReadOnlyMap<K, V> implements MapExample<K, V> {

    private final Map<K, V> original;

    public ReadOnlyMap(Map<K, V> map) {
        original = map;
    }

    @Override
    public int size() {
        return original.size();
    }

    @Override
    public boolean isEmpty() {
        return original.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return original.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return original.containsValue(value);
    }

    @Override
    public V get(Object key) {
        return original.get(key);
    }

    @Override
    public void put(K key, V value) {
        throw new RuntimeException("You can't add elements in readonly map");
    }

    @Override
    public void remove(Object key) {
        throw new RuntimeException("You can't remove elements in readonly map");
    }

    @Override
    public void clear() {
        throw new RuntimeException("You can't remove elements in readonly map");
    }

    @Override
    public void sort() {
        throw new RuntimeException("You can't sort elements in readonly map");
    }
}

