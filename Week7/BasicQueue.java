package DS.Week7;

public class BasicQueue {
    public static void main(String[] args) {
        Queue q1 = new Queue(10);
        q1.enqueue("Adam");
        q1.enqueue("Adam");
        q1.enqueue("Adam");
        q1.enqueue("Adam");
        q1.display();
        q1.dequeue();
        q1.dequeue();
        q1.display();
        q1.enqueue("John");
        q1.enqueue("Jack");
        q1.display();
        q1.enqueueMany("1000, 2000, 3000, 4000, 5000, 6000");
        q1.display();
        q1.dequeueAll();

        System.out.println(q1.isFull());
    }
}

class Queue{
    
    //declare variables/data for queue class
    private int head; //the head pointer, handles dequeue
    private int tail; // the tail pointer, similar to top in stack
    private int maxSize;
    private String arr[];
    public Queue() {
    }

    //constructor
    public Queue(int size){
        this.head = 0;
        this.tail = 0;
        this.maxSize = size;
        this.arr = new String[maxSize]; //array type of String
    }

    public boolean isEmpty(){
        return tail ==0;
    }

    /*public boolean isEmpty(){
        if(tail ==0){
            return true;
        }else{
            return false;
        }
    }*/

    public boolean isFull(){
        return tail >= maxSize;
    }

    public void enqueue(String text){
        //FIFO rule, enqueue at tail, dequeue at head
        //Dont forget to move all elements to replace head

        if(!isFull()){
            arr[tail] = text;
            tail++;
            System.out.println("Enqueue: " + text);
        }else{
            System.out.println("Queue is full...");
        }
    }

    public void enqueueMany(String multiStr){
        String[] tempStr = multiStr.split(", "); //delimeter comma + space
        for (int i = 0; i < tempStr.length; i++){
            enqueue(tempStr[i]);
        }
    }
    public void dequeue(){
        if(!isEmpty()){
            //FIFO rule, always dequeue at head
            //mush shift elements to the correct position
            String temp = arr[head];
            for(int i = 0; i<tail-1; i++){
                arr[i] = arr[i+1];
            }
            //take care of last element
            tail--;
            arr[tail] = null;
            //decrease tail by one;
            System.out.println("Dequeue: " + temp);
        }else{
            System.out.println("Queue is empty...");
        }
    }

    public void dequeueAll(){
        if(!isEmpty()){
            System.out.println("\nThere are " + tail + " items in the queue. Removing all.... ");
            while(!isEmpty()){
                dequeue();
            }
        }
    }
    public void display(){
        System.out.println("Displaying queue..............");
        for(int i = 0; i < tail; i++){
            System.out.println(arr[i]);
        }
    }
}