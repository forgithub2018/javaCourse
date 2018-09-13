package com.javacourse;

import org.junit.Test;
import static org.junit.Assert.*;

import com.javacourse.Stack.Stack;
import com.javacourse.Stack.ArrayStack;

public class ArrayStackTest {
@Test
public void pushTest(){

    Stack stack = new ArrayStack();
    stack.push("A");

    Object expectedValue = "A";
    Object actualValue = ((ArrayStack) stack).array[0];
    assertEquals(expectedValue,actualValue);

}
}
