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
        return null;
    }

    @Override
    public Object peek() {
        return array[sizeQueue - 1];
    }

    @Override
    public int size() {
        return sizeQueue;
    }

    @Override
    public boolean remove(Object value) {
        return false;
    }

    @Override
    public boolean contains(Object value) {
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

}