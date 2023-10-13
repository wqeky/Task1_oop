package singleton;

import interfaces.MapExample;

public class SingletonMap<K, V> implements MapExample<K, V> {

    private K key;
    private V value;

    public SingletonMap(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return key == this.key;
    }

    @Override
    public boolean containsValue(Object value) {
        return value == this.value;
    }

    @Override
    public V get(Object key) {
        return this.value;
    }

    @Override
    public void put(K key, V value) {
        throw new RuntimeException("You can't add elements in single map");
    }

    @Override
    public void remove(Object key) {
        throw new RuntimeException("You can't remove elements in single map");
    }

    @Override
    public void clear() {
        throw new RuntimeException("You can't remove elements in single map");
    }

    @Override
    public void sort() {
        throw new RuntimeException("You can't sort elements in single map");
    }
}