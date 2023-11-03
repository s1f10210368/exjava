package lecture6.ex1;

public class MyStack<E> {
    private int size;
    private int top;
    private E[] elements;

    @SuppressWarnings("unchecked")
    public MyStack(int size) {
        this.size = size;
        this.top = 0;
        this.elements = (E[]) new Object[size];
    }

    public void push(E item) {
        if (top < size) {
            elements[top] = item;
            top++;
        } else {
            System.out.println("Stack is full. Cannot push item.");
        }
    }

    public E pop() {
        if (top > 0) {
            top--;
            E item = elements[top];
            elements[top] = null; // Clear the reference
            return item;
        } else {
            System.out.println("Stack is empty. Cannot pop item.");
            return null;
        }
    }

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop()); // Output: 3
        System.out.println(stack.pop()); // Output: 2
        System.out.println(stack.pop()); // Output: 1
        System.out.println(stack.pop()); // Output: Stack is empty. Cannot pop item.
    }
}

