package DS.Week8;

public class LinkedList<T> {
    // Inner class for linked list nodes
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;  // Points to the first element
    private int size;   // Track the number of elements

    // Default constructor
    public LinkedList() {
        head = null;
        size = 0;
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Get the size of the list
    public int size() {
        return size;
    }

    // Add an element to the front of the list
    public void addFirst(T data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Add an element to the end of the list
    public void addLast(T data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Remove the first element from the list
    public T removeFirst() {
        if (isEmpty()) {
            return null;
        }
        T data = head.data;
        head = head.next;
        size--;
        return data;
    }

    // Remove a specific element from the list
    public boolean remove(T data) {
        if (isEmpty()) {
            return false;
        }
        
        // If removing the first element
        if (head.data.equals(data)) {
            head = head.next;
            size--;
            return true;
        }
        
        // Search for the element to remove
        Node current = head;
        while (current.next != null) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Get the element at a specific index
    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    // Check if the list contains a specific element
    public boolean contains(T data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Display all elements in the list
    public void display() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        System.out.print("List: ");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    // Main method with examples
    public static void main(String[] args) {
        System.out.println("=== Linked List Example ===\n");
        
        // Create a new linked list
        LinkedList<Integer> list = new LinkedList<>();
        
        System.out.println("1. Creating an empty list:");
        System.out.println("Is empty? " + list.isEmpty());
        System.out.println("Size: " + list.size());
        
        System.out.println("\n2. Adding elements to the front:");
        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);
        list.display();
        System.out.println("Size: " + list.size());
        
        System.out.println("\n3. Adding elements to the end:");
        list.addLast(40);
        list.addLast(50);
        list.display();
        System.out.println("Size: " + list.size());
        
        System.out.println("\n4. Getting element at index 2:");
        System.out.println("Element at index 2: " + list.get(2));
        
        System.out.println("\n5. Checking if list contains 30:");
        System.out.println("Contains 30? " + list.contains(30));
        System.out.println("Contains 99? " + list.contains(99));
        
        System.out.println("\n6. Removing first element:");
        System.out.println("Removed: " + list.removeFirst());
        list.display();
        System.out.println("Size: " + list.size());
        
        System.out.println("\n7. Removing specific element (40):");
        System.out.println("Removed 40? " + list.remove(40));
        list.display();
        System.out.println("Size: " + list.size());
        
        System.out.println("\n8. Removing all elements:");
        while (!list.isEmpty()) {
            System.out.println("Removed: " + list.removeFirst());
            list.display();
        }
        
        System.out.println("\n9. Testing with String type:");
        LinkedList<String> stringList = new LinkedList<>();
        stringList.addLast("Hello");
        stringList.addLast("World");
        stringList.addFirst("Java");
        stringList.display();
        System.out.println("Contains 'World'? " + stringList.contains("World"));
    }
}
