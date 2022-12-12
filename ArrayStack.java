package org.csci.labs;

public class ArrayStack<E> implements Stack<E> {
    public static final int CAPACITY = 1000; // default array capacity
    private E[] data; // generic array used for storage
    private int t = -1; // index of the top element in stack

    public ArrayStack() {
        this(CAPACITY);
    } // constructs stack with default capacity

    public ArrayStack(int capacity) { // constructs stack with given capacity
        data = (E[]) new Object[capacity]; // safe cast; compiler may give warning
    }

    public int size() {
        return (t + 1);
    }

    public boolean isEmpty() {
        return (t == -1);
    }

    public void push(E e) throws IllegalStateException {
        if (size() == data.length) {
            System.out.println("Stack is full.. Resizing the array");
            resize(size() * 2);
        }

        data[++t] = e; // increment t before storing new item
    }

    public E top() {
        if (isEmpty()) return null;
        return data[t];
    }

    private void resize(int size) {
        // create a new array of |size| and copy the value from the old array
        // update the array reference to the new array
        E[] newArray;
        newArray=(E[]) new Object[size];//object is the superclass of all objects
        for (int i = 0; i < t; i++) {//or old array.length
            newArray[i] = data[i];
        }
        data=newArray;
    }

    public int getInternalArraySize() {
        return this.data.length;
    }

    public E pop() {
        if (isEmpty()) return null;
        E answer = data[t];
        data[t] = null; // dereference to help garbage collection
        t--;
        if (size() < this.data.length / 2) {
            resize(this.data.length / 2);
        }
        return answer;
    }
}