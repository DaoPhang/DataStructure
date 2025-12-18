package DS.Week7;

public class LinkedQueueTest {
    public static void main(String[] args) {
        LinkedQueue<Double> prices = new LinkedQueue<>();
        prices.enqueue(19.99);
        prices.enqueue(5.50);
        prices.enqueue(120.00);
        
        prices.display();
        prices.dequeue();
        prices.dequeue();
        prices.display();
    }
}

class LinkedQueue<T> {
    // Internal Node class
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node head; // Points to the front (for dequeue)
    private Node tail; // Points to the back (for enqueue)
    private int size = 0;

    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(T item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println("Enqueued: " + item);
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        T data = head.data;
        head = head.next;
        if (head == null) { tail = null; } // Queue became empty
        size--;
        System.out.println("Dequeued: " + data);
    }

    public void display() {
        Node current = head;
        System.out.print("Linked Queue: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}