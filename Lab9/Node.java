package DS.Lab9;

public class Node<T extends Comparable<T>> implements Comparable<Node<T>> {

    private T data;
    
    private Node<T> next;
    
    public Node(T data) {
        this.data = data;
        this.next = null;
    }
    
    public T getData() {
        return data;
    }
    
    public void setData(T data) {
        this.data = data;
    }
    
    public Node<T> getNext() {
        return next;
    }
    
    public void setNext(Node<T> next) {
        this.next = next;
    }
    
    @Override
    public int compareTo(Node<T> other) {
        if (this.data == null && other.data == null) {
            return 0;
        }
        if (this.data == null) {
            return -1;
        }
        if (other.data == null) {
            return 1;
        }
        return this.data.compareTo(other.data);
    }
}
