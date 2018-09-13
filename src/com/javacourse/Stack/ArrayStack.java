package com.javacourse.Stack;

public class ArrayStack implements Stack {
    public Object[] array;
    int size = 0;

    public ArrayStack() {
        //int initialCapacity = 1;
        array = new Object[0];
    }

    @Override
    public void push(Object value) {
        size++;
        Object[] copyArray = array;
        array = new Object[size];
        for (int i = 0; i < copyArray.length; i++) {
            array[i] = copyArray[i];
        }
        array[size - 1] = value;
    }

    @Override
    public Object pop() {
        if (size == 0) {
            return null;
        }

        size--;
        Object[] copyArray = array;
        array = new Object[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = copyArray[i];
        }
        return copyArray[copyArray.length - 1];

    }

    @Override
    public Object peek() {
        return array[size - 1];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean remove(Object value) {
        //int newSize = size;
        int index = 0;
        boolean flag = false;
        Object[] newArray = new Object[size];
        for (int i = 0; i < array.length; i++) {
            if (value.toString().equals(array[i].toString())) {
                flag = true;
            } else {
                newArray[index] = array[i];
                index++;
            }
        }

        size = index;
        array = new Object[size];
        for (int i = 0; i < size; i++) {
            array[i] = newArray[i];
        }
        return flag;
    }

    @Override
    public boolean contains(Object value) {
        for (Object arrayValue : array) {
            if (value.toString().equals(arrayValue.toString())) {
                return true;
            }
        }
        return false;
    }

    public void showStack (){
        System.out.println("Stack consist:");
        for (Object arrayValue: array
        ) {
            System.out.println(arrayValue.toString());
        }
        System.out.println("========");
    }
}