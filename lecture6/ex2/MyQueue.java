package lecture6.ex2;

public class MyQueue<T> {
    private int size;
    private int tail;
    private int head;
    private Object[] elements;

    public MyQueue(int size) {
        this.size = size;
        this.tail = 0;
        this.head = 0;
        this.elements = new Object[size];
    }

    public void enqueue(T item) {
        if ((tail + 1) % size == head) {
            System.out.println("Queue is full. Cannot enqueue.");
        } else {
            elements[tail] = item;
            tail = (tail + 1) % size;
        }
    }

    public T dequeue() {
        if (head == tail) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        } else {
            T item = (T) elements[head];
            elements[head] = null; // Clear the reference
            head = (head + 1) % size;
            return item;
        }
    }

    public static void main(String[] args) {
        MyQueue<String> stringQueue = new MyQueue<>(5);
        stringQueue.enqueue("Apple");
        stringQueue.enqueue("Banana");
        stringQueue.enqueue("Orange");

        System.out.println(stringQueue.dequeue()); // Output: Apple
        System.out.println(stringQueue.dequeue()); // Output: Banana

        MyQueue<Integer> intQueue = new MyQueue<>(5);
        intQueue.enqueue(1);
        intQueue.enqueue(2);

        System.out.println(intQueue.dequeue()); // Output: 1
    }
}
