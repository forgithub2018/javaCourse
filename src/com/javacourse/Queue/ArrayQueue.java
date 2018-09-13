package com.javacourse.Queue;

import java.lang.reflect.Array;

public class ArrayQueue implements Queue {
    Object[] array;
    int sizeQueue = 0;
    int sizeArray = 5;

    // [A, B, C, null, null] -> dequeue return A
    // [B, C, null, null, null]

    public ArrayQueue() {
        //int initialCapacity = 1;
        array = new Object[sizeArray];
    }

    @Override
    public void enqueue(Object value) {
        sizeQueue++;
        if (sizeQueue > sizeArray) {
            sizeArray = (int) (sizeArray * 1.5);
            Object[] newArray = new Object[sizeArray];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[sizeQueue - 1] = value;
    }

    @Override
    public Object dequeue() {
        if (sizeArray == 0) {
            return null;
        }
        Object result = array[0];
        for (int i = 0; i < sizeQueue; i++) {
            array[i] = array[i + 1];
        }
        sizeQueue--;
        return result;
    }

    @Override
    public Object peek() {
        return array[0];
    }

    @Override
    public int size() {
        return sizeQueue;
    }

    @Override
    public boolean remove(Object value) {
        boolean flag = false;
        int newSizeQueue = 0;
        for (int i = 0; i < sizeQueue; i++) {
            if (value.toString().equals(array[i].toString())) {
                array[i] = null;
                flag = true;
                newSizeQueue++;
            }
        }
        sizeQueue = newSizeQueue == 0 ? sizeQueue : sizeQueue - newSizeQueue;
        rearrange();
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

    public void showQueue() {
        System.out.println("Queue consist:");
        for (Object arrayValue : array
        ) {
            System.out.print(arrayValue + " ");
        }
        System.out.println();
    }

    public void showSizes() {
        System.out.println("Array size: " + sizeArray + " Queue size: " + sizeQueue);
    }

    void rearrange() {
        Object[] newArray = new Object[sizeArray];
        int index = 0;
        for (int i = 0; i < sizeArray; i++) {
            if (array[i] != null) {
                newArray[index] = array[i];
                index++;
            }
        }
        array = newArray;
    }

}