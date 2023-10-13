package interfaces;

import java.util.Comparator;


public interface SetExample<T> {
    int size();

    boolean isEmpty();

    boolean contains(Object o);

    boolean add(T e);

    boolean remove(Object o);

    void clear();

    Object[] toArray();

    boolean equals(Object o);

    void sort(Comparator<? super T> c);

}
