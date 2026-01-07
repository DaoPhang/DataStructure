package DS.Week8;

public class LL_TestFile {
    public static void main(String[] args) {
        
        LinkedList1 ll = new LinkedList1();

        ll.insertAtHead(10);
        ll.insertAtHead(20);
        ll.insertAtHead(30);
        ll.insertAtHead(40);
        ll.insertAtHead(50);
        ll.insertAtHead(60);

        System.out.println(ll);

        System.out.println("Node counter: " + ll.length());

        ll.deleteFromHead();
        System.out.println(ll);
        System.out.println("Node counter: " + ll.length());

        System.out.println(ll.find(20));
        System.out.println(ll.find(2000));
    }
}

class LinkedList1{
        Node head;

        public void insertAtHead(int data){
            //a) create a new node
            Node newNode = new Node(data);
            //b)point to head
            newNode.setNextNode(this.head);
            //c) head point to new node
            this.head = newNode;
        }

        public int length(){
            int length = 0;

            //a)point to the head
            //b)while not point to null, keep traversing
            //c)increment counter

            
            
        }

        public void deleteFromHead(){
            this.head = this.head.getNextNode();
        }

        public Node find(int data){

            Node current = this.head;
            while(current != null){
                if(current.getData() == data){
                    System.out.println("found a match...");
                    return current;
                }

                current= current.getNextNode();
            }
            return null;
        }

        @Override
        public String toString(){
            String result = "{";

            Node current = this.head;

            while (current != null){
                result += current.toString() + ", ";
                current = current.getNextNode();

            }
            result += "}";
            return result;
        }
}
