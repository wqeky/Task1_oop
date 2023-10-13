package readonly;
import interfaces.ListExample;

import java.util.Comparator;
import java.util.List;


public class ReadOnlyListImp<T> implements ListExample<T> {

    private final List<T> original;

    public ReadOnlyListImp(List<T> list) {
        original = list;
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
    public T get(int index) {
        return original.get(index);
    }

    @Override
    public void remove(int index) {
        throw new RuntimeException("You can't remove elements in readonly list");
    }

    @Override
    public void add(Object e) {
        throw new RuntimeException("You can't add elements in readonly list");
    }

    @Override
    public int indexOf(Object o) {
        return original.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return original.lastIndexOf(o);
    }

    @Override
    public void sort(Comparator<? super T> c) {
        throw new RuntimeException("You can't sort elements in readonly list");
    }

    @Override
    public Object[] toArray() {
        return original.toArray();
    }

}

