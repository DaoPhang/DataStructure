package DS.Practice;

public class LinkedList2 {
    Node1 head;

    public void insertAtHead(int data){
        Node1 newNode1 = new Node1(data);

        newNode1.setNextNode1(this.head);
        this.head = newNode1;
    }

    public void deleteFromHead(){
        this.head = this.head.getNextNode1();
    }

    public int length(){
        int length = 0;
        Node1 current = this.head;
        while(current != null){
            length++;
            current = current.getNextNode1();
        }
        return length;
    }

    public Node1 find(int data){
        Node1 current = this.head;
        while(current != null){
            if(current.getData() == data){
                System.out.println("Found a match....");
                return current;
            }
            current = current.getNextNode1();
        }
        return null;
    }

    @Override
    public String toString(){
        String result = "{";
        Node1 current = this.head;
        while(current != null){
            result += current.toString() + ", ";
            current = current.getNextNode1();
        }

        result += "}";
        return result;
    }

    public static void main(String[] args){
        LinkedList2 ll2 = new LinkedList2();

        ll2.insertAtHead(10);
        ll2.insertAtHead(20);
        ll2.insertAtHead(30);
        ll2.insertAtHead(40);
        ll2.insertAtHead(50);

        System.out.println(ll2);
        System.out.println("Node Counter: " + ll2.length());
        
        ll2.deleteFromHead();
        System.out.println(ll2);
        System.out.println("Node Counter: " + ll2.length());

        System.out.println(ll2.find(30));
        System.out.println(ll2.find(1000));
    }
}
