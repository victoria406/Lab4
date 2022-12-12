package org.csci.labs;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author : Adiesha
 * @created : 7/22/2022, Friday
 **/
public class ArrayStackTest {

    ArrayStack<Integer> integerArrayStack;

    @Before
    public void setUp() throws Exception {
        integerArrayStack = new ArrayStack<>(3);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void push() {
        integerArrayStack.push(12);
        integerArrayStack.push(145);
        integerArrayStack.push(18);

        integerArrayStack.push(54);
        assertEquals(6, integerArrayStack.getInternalArraySize());

        integerArrayStack.pop();
        integerArrayStack.pop();
        assertEquals(3, integerArrayStack.getInternalArraySize());
    }

    @Test
    public void pop() {
        integerArrayStack.push(12);
        integerArrayStack.push(145);
        integerArrayStack.push(18);

        integerArrayStack.push(54);
        assertEquals(6, integerArrayStack.getInternalArraySize());

        integerArrayStack.pop();
        integerArrayStack.pop();
        assertEquals(3, integerArrayStack.getInternalArraySize());
    }
}