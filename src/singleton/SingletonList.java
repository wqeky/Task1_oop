package singleton;

import interfaces.ListExample;

import java.util.Comparator;

public class SingletonList<T> implements ListExample<T> {

    private T value;

    public SingletonList(T value) {
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
    public T get(int index) {
        return value;
    }

    @Override
    public void add(T e) {
        throw new RuntimeException("You can't add elements in single list");
    }

    @Override
    public void remove(int index) {
        throw new RuntimeException("You can't remove elements in single list");
    }

    @Override
    public int indexOf(Object o) {
        if (value == o) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public int lastIndexOf(Object o) {
        if (value == o) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public void sort(Comparator<? super T> c) {
        throw new RuntimeException("You can't sort single list");
    }

    @Override
    public Object[] toArray() {
        return new Object[]{this.value};
    }

}