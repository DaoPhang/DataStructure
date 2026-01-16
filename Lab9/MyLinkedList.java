package DS.Lab9;

public class MyLinkedList<T extends Comparable<T>> {
    
    private Node<T> head;
    private Node<T> tail;
    private int size;
    
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public int getSize() {
        return size;
    }
    

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            // List is empty
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        size++;
    }
    
    public void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (tail == null) {
            // List is empty
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }
    
    public T removeFirst() {
        if (head == null) {
            return null;
        }
        T data = head.getData();
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        size--;
        return data;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[size=").append(size).append("]");
        
        Node<T> current = head;
        while (current != null) {
            sb.append(" >> ").append(current.getData());
            current = current.getNext();
        }
        
        return sb.toString();
    }

    public boolean contains(T element) {
        Node<T> current = head;
        while (current != null) {
            if (current.getData() != null && current.getData().equals(element)) {
                return true;
            } else if (current.getData() == null && element == null) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
    
    public void clear() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("The list is cleared.");
    }
    
    public MyLinkedList<T> combine(MyLinkedList<T> list1, MyLinkedList<T> list2) {
        MyLinkedList<T> result = new MyLinkedList<>();

        java.util.List<T> elements = new java.util.ArrayList<>();
        
        Node<T> current = list1.head;
        while (current != null) {
            elements.add(current.getData());
            current = current.getNext();
        }
        
        current = list2.head;
        while (current != null) {
            elements.add(current.getData());
            current = current.getNext();
        }
        
        elements.sort(null);

        for (T element : elements) {
            result.addLast(element);
        }
        
        return result;
    }
}
