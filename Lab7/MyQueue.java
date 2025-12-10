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

    public static void main(String[] args) {
        System.out.println("=== Testing MyQueue with Integer ===");
        MyQueue<Integer> queue = new MyQueue<>();
        
        // Test isEmpty on empty queue
        System.out.println("\n1. Testing isEmpty() on empty queue:");
        System.out.println("Is queue empty? " + queue.isEmpty());
        
        // Test peek on empty queue
        System.out.println("\n2. Testing peek() on empty queue:");
        System.out.println("Peek: " + queue.peek());
        
        // Test display on empty queue
        System.out.println("\n3. Testing display() on empty queue:");
        queue.display();
        
        // Enqueue elements
        System.out.println("\n4. Enqueueing elements: 10, 20, 30, 40, 50");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        
        // Display queue
        System.out.println("\n5. Displaying queue after enqueue:");
        queue.display();
        
        // Test isEmpty on non-empty queue
        System.out.println("\n6. Testing isEmpty() on non-empty queue:");
        System.out.println("Is queue empty? " + queue.isEmpty());
        
        // Test peek
        System.out.println("\n7. Testing peek() - should return first element:");
        System.out.println("Peek: " + queue.peek());
        System.out.println("Queue after peek (should be unchanged):");
        queue.display();
        
        // Dequeue elements
        System.out.println("\n8. Dequeueing elements:");
        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();
        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();
        System.out.println("Dequeued: " + queue.dequeue());
        queue.display();
        
        // Test peek after some dequeues
        System.out.println("\n9. Testing peek() after some dequeues:");
        System.out.println("Peek: " + queue.peek());
        
        // Dequeue remaining elements
        System.out.println("\n10. Dequeueing remaining elements:");
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        
        // Test dequeue on empty queue
        System.out.println("\n11. Testing dequeue() on empty queue:");
        System.out.println("Dequeued: " + queue.dequeue());
        
        // Display empty queue
        System.out.println("\n12. Displaying empty queue:");
        queue.display();
        
        // Test with String type
        System.out.println("\n\n=== Testing MyQueue with String ===");
        MyQueue<String> stringQueue = new MyQueue<>();
        
        System.out.println("\nEnqueueing: Apple, Banana, Cherry");
        stringQueue.enqueue("Apple");
        stringQueue.enqueue("Banana");
        stringQueue.enqueue("Cherry");
        
        System.out.println("\nDisplaying string queue:");
        stringQueue.display();
        
        System.out.println("\nPeek: " + stringQueue.peek());
        
        System.out.println("\nDequeueing all:");
        while (!stringQueue.isEmpty()) {
            System.out.println("Dequeued: " + stringQueue.dequeue());
            stringQueue.display();
        }
    }
}
