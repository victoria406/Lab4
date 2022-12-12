package org.csci.labs;

/**
 * @author : Adiesha
 * @created : 7/12/2022, Tuesday
 **/
public interface LinkedListInterface<T> {

    int size();

    boolean isEmpty();

    T first();

    T last();

    void addFirst(T element);

    void addLast(T element);

    T removeFirst();
}
