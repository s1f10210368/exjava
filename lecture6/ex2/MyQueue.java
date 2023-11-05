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
            elements[head] = null; 
            head = (head + 1) % size;
            return item;
        }
    }
}
