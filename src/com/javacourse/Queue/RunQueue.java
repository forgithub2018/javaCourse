package com.javacourse.Queue;

public class RunQueue {
    public static void main(String[] args) {
        Queue queue = new ArrayQueue();

        ((ArrayQueue) queue).showSizes();
        queue.enqueue("A");
        ((ArrayQueue) queue).showSizes();
        ((ArrayQueue) queue).showQueue();

        queue.enqueue("b");
        ((ArrayQueue) queue).showSizes();
        ((ArrayQueue) queue).showQueue();
        queue.enqueue("c");
        ((ArrayQueue) queue).showSizes();
        ((ArrayQueue) queue).showQueue();
        queue.enqueue("d");
        ((ArrayQueue) queue).showSizes();
        ((ArrayQueue) queue).showQueue();
        queue.enqueue("e");
        ((ArrayQueue) queue).showSizes();
        ((ArrayQueue) queue).showQueue();
        queue.enqueue("f");
        ((ArrayQueue) queue).showSizes();
        ((ArrayQueue) queue).showQueue();

        Object o = queue.dequeue();
        ((ArrayQueue) queue).showQueue();

        queue.enqueue("e");
        ((ArrayQueue) queue).showQueue();

        System.out.println("Contains is: " + queue.contains("e"));

        System.out.println("Remove is: " + queue.remove("e"));
        ((ArrayQueue) queue).showQueue();


    }
}
