package writeonly;

import interfaces.SetExample;

import java.util.*;

public class WriteOnlySet<T> implements SetExample<T> {

    private Set<T> original;

    public WriteOnlySet(Set<T> set) {
        original = set;
    }

    @Override
    public int size() {
        return original.size();
    }

    @Override
    public boolean isEmpty() {
        return original.size() != 0;
    }

    @Override
    public boolean contains(Object o) {
        throw new RuntimeException("You can't read elements in writeonly set");
    }

    @Override
    public boolean add(T e) {
        return original.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return original.remove(o);
    }

    @Override
    public void clear() {
        original.clear();
    }

    @Override
    public Object[] toArray() {
        return original.toArray();
    }

    @Override
    public void sort(Comparator<? super T> c) {
        List<T> list = new ArrayList<>(original);
        list.sort(c);
        original = new HashSet<>(list); // ?
    }
}
