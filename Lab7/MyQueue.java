package DS.Lab7;

public class MyQueue<T> {
    // Inner class for queue nodes
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;  // Points to the front (first) element
    private Node rear;   // Points to the rear (last) element
    private int size;    // Track the number of elements

    // Default constructor
    public MyQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    // Return whether or not the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Return the value of the first element in the queue
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return front.data;
    }

    // Add an element to the bottom of the queue
    public void enqueue(T element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // Remove element from the top of the queue
    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        T data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;  // Queue is now empty
        }
        size--;
        return data;
    }

    // Display all elements in the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node current = front;
        System.out.print("Queue: ");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
