package org.csci.labs;


/**
 * @author : Adiesha
 * @created : 7/19/2022, Tuesday
 **/
public class LinkedStack<E> implements Stack<E> {
    private final SingleLinkedList<E> list = new SingleLinkedList<>(); // an empty list

    public LinkedStack() {
    } // new stack relies on the initially empty list

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(E element) {
        list.addFirst(element);
    }

    public E top() {
        return list.first();
    }

    public E pop() {
        return list.removeFirst();
    }
}
