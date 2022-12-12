package org.csci.labs;

/**
 * @author : Adiesha
 * @created : 7/22/2022, Friday
 **/
public class ArrayStackResizeDemo {
    public static void main(String[] args) {
        ArrayStack<Object> integerArrayStack = new ArrayStack<>(3);
        integerArrayStack.push(12);
        integerArrayStack.push(12);
        integerArrayStack.push(12);
        integerArrayStack.push(13);
        integerArrayStack.pop();
        integerArrayStack.pop();
    }
}
