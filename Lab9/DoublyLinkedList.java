package DS.Lab9;

public class DoublyLinkedList<T extends Comparable<T>> {
    
    private DoublyNode<T> head;
    private DoublyNode<T> tail;
    private int size;
    
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    

    public int getSize() {
        return size;
    }
    

    public void addFirst(T data) {
        DoublyNode<T> newNode = new DoublyNode<>(data);
        if (head == null) {
            // List is empty
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
        }
        size++;
    }
    

    public void addLast(T data) {
        DoublyNode<T> newNode = new DoublyNode<>(data);
        if (tail == null) {
            // List is empty
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
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
        } else {
            head.setPrevious(null);
        }
        size--;
        return data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[size=").append(size).append("]");
        
        DoublyNode<T> current = head;
        while (current != null) {
            sb.append(" >> ").append(current.getData());
            current = current.getNext();
        }
        
        current = tail;
        while (current != null) {
            sb.append(" << ").append(current.getData());
            current = current.getPrevious();
        }
        
        return sb.toString();
    }
    

    public boolean contains(T element) {
        DoublyNode<T> current = head;
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
    
    public static void main(String[] args) {
        DoublyLinkedList<String> dlist1 = new DoublyLinkedList<>();
        dlist1.addLast("wedges");
        dlist1.addLast("chips");
        dlist1.addLast("french fries");
        dlist1.addLast("mashed potatoes");
        System.out.println(dlist1.toString());
    }
}
