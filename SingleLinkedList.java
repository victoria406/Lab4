package org.csci.labs;

/**
 * @author : Adiesha
 * @created : 7/12/2022, Tuesday
 **/
public class SingleLinkedList<T> implements LinkedListInterface<T> {

    private Node<T> head = null; // head node of the list (or null if empty)
    private Node<T> tail = null; // last node of the list (or null if empty)
    private int size = 0; // number of nodes in the list

    static class Node<E> {
        private final E element;
        private Node<E> next;

        public Node(E e, Node<E> next) {
            element = e;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }


    public SingleLinkedList() {
    } // constructs an initially empty list

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public T first() {
        if (isEmpty()) {
            return null;
        }
        return head.getElement();
    }

    @Override
    public T last() {
        if (isEmpty()) {
            return null;
        }
        return tail.getElement();
    }

    @Override
    public void addFirst(T element) {
        head = new Node<>(element, this.head);
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    @Override
    public void addLast(T element) {
        Node<T> newest = new Node<>(element, null);
        if (isEmpty()) {
            head = newest;
        } else {
            tail.setNext(newest);
        }
        tail = newest;
        size++;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            return null;
        }
        T answer = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0) {
            tail = null;
        }
        return answer;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Singular LinkedList: ->\n");
        Node<T> temp = this.head;
        while (temp != null) {
            stringBuilder.append(temp.getElement().toString());
            stringBuilder.append("\n");
            temp = temp.getNext();
        }
        return stringBuilder.toString();
    }
}
