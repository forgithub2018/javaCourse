
public class RunQueue {
    public static void main(String[] args) {
        Queue queue = new ArrayQueue();

        ((ArrayQueue) queue).showSizes();
        queue.enqueue("A");
        ((ArrayQueue) queue).showSizes();
        ((ArrayQueue) queue).showQueue();


    }
}
