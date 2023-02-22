package Task8;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public interface List <E>{
    int size();
    boolean isEmpty();
    boolean contains(Object value);

    Iterator iterator();

    Object[] toArray();

    boolean add(E value);
    boolean add(int index, E value);
    boolean remove(Object value);
    boolean addAll(List<? extends E> value);

    boolean addAll(Collection c);

    boolean addAll(int index, Collection c);

    void clear();

    E get (int index);
    E remove (int index);
    E set (int index, E value);
    int indexOf (Object value);

    int lastIndexOf(Object o);

    ListIterator listIterator();

    ListIterator listIterator(int index);

    boolean retainAll(Collection c);

    boolean removeAll(Collection c);

    boolean containsAll(Collection c);
}
