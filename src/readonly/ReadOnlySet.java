package readonly;

import interfaces.SetExample;

import java.util.Comparator;
import java.util.Set;

public class ReadOnlySet<T> implements SetExample<T> {

    private final Set<T> original;

    public ReadOnlySet(Set<T> set) {
        original = set;
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
    public boolean contains(Object o) {
        return original.contains(o);
    }

    @Override
    public boolean add(T e) {
        throw new RuntimeException("You can't add elements in readonly set");
    }

    @Override
    public boolean remove(Object o) {
        throw new RuntimeException("You can't remove elements in readonly set");
    }

    @Override
    public void clear() {
        throw new RuntimeException("You can't remove elements in readonly set");
    }

    @Override
    public Object[] toArray() {
        return original.toArray();
    }

    @Override
    public void sort(Comparator<? super T> c) {
        throw new RuntimeException("You can't sort elements in readonly set");
    }

}

