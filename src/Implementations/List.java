package Implementations;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public interface List {

    int size();

    boolean isEmpty();

    boolean contains(Object o);

    Iterator iterator();

    Object[] toArray();

    boolean add(Object o);

    boolean remove(Object o);

    boolean addAll(Collection c);

    boolean addAll(int index, Collection c);

    void clear();

    Object get(int index);

    Object set(int index, Object element);

    void add(int index, Object element);

    Object remove(int index);

    int indexOf(Object o);

    int lastIndexOf(Object o);

    ListIterator listIterator();

    ListIterator listIterator(int index);

    java.util.List subList(int fromIndex, int toIndex);

    boolean retainAll(Collection c);

    boolean removeAll(Collection c);

    boolean containsAll(Collection c);

    Object[] toArray(Object[] a);
}
