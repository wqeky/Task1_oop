package empty;

import interfaces.MapExample;

public class EmptyMap<K, V> implements MapExample<K, V> {

public EmptyMap() {

}

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public V get(Object key) {
        return null;
    }

    @Override
    public void put(Object key, Object value) {throw new RuntimeException("You can't add elements in empty map");

    }

    @Override
    public void remove(Object key) {throw new RuntimeException("You can't remove elements in empty map");
    }




    @Override
    public void clear() {throw new RuntimeException("You can't remove elements in empty map");
    }



    @Override
    public void sort() {throw new RuntimeException("You can't sort elements in empty map");

    }
}
