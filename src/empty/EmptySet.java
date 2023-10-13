package empty;

import interfaces.SetExample;

import java.util.Comparator;

public class EmptySet<T> implements SetExample<T> {

    public EmptySet() {
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
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public boolean add(T e) {
        throw new RuntimeException("You can't add elements in empty set");
    }

    @Override
    public boolean remove(Object o) {
        throw new RuntimeException("You can't remove elements in empty set");
    }

    @Override
    public void clear() {
        throw new RuntimeException("You can't remove elements in empty set");
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public void sort(Comparator<? super T> c) {
        throw new RuntimeException("You can't sort elements in empty set");
    }
}