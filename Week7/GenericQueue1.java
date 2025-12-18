public class GenericQueue1 {
    public static void main(String[] args) {
        Queue1<Integer> q1 = new Queue1<>(10);
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(10);
        q1.enqueue(40);
        q1.enqueue(50);
        q1.enqueue(60);
        q1.enqueue(70);
        q1.display();
        q1.dequeueAll();
        q1.display();
        System.out.println("Is the queue empty? " + q1.isEmpty());
    }
}

class Queue1<T>{
    private int head;
    private int tail;
    private int maxSize;
    private T[] arr;
    
    public Queue1() {
        this(10); // Default size of 10
    }

    @SuppressWarnings("unchecked")
    public Queue1(int size) {
        this.head = 0;
        this.tail = 0;
        this.maxSize = size;
        this.arr = (T[])new Object[maxSize];
    }

    public boolean isEmpty(){
        return tail == 0;
    }

    public boolean isFull(){
        return tail >= maxSize;
    }

    public void enqueue(T item){
        if(!isFull()){
            arr[tail] = item;
            tail++;
            System.out.println("Enqueue: " + item);
        }else{
            System.out.println("Queue is full...");
        }
    }

    public void enqueueMany (String multiStr){
        String[] tempStr = multiStr.split(", ");
        for(String str : tempStr){
            enqueue((T)str);
        }
    }

    public void pushMany(String multiStr){
        String[] tempStr = multiStr.split(", ");
        for(String str : tempStr){
            enqueue((T)str);
        }
    }

    public void dequeue(){
        if(!isEmpty()){
            T temp = arr[head];
            for(int i = 0; i<tail -1; i++){
                arr[i] = arr[i+1];
            }
            tail--;
            arr[tail] = null;
            System.out.println("Dequeue-ing: " + temp);
        }else{
            System.out.println("Queue is empty");
        }
    }

    public void dequeueAll(){
        /*if(!isEmpty()){
            System.out.println("There are " + tail + "items in the queue. Removing all...");
            while(!isEmpty()){
                dequeue();
            }
        }*/

        this.head= 0;
        this.tail= 0;
        for(int i = 0; i< maxSize; i++){
            arr[i]= null;
        }
        System.out.println("Removed all queue");
    }



    public void popAll(){
        if(!isEmpty()){
            System.out.println("There are " + tail + "items in the queue. Removing all...");
            while(!isEmpty()){
                dequeue();
            }
        }
    }

    public void display(){
        System.out.println("Displaying queue.......");
        for(int i =0 ; i<tail; i++){
            System.out.println(arr[i]);
        }
        if(isEmpty()){
            System.out.println("The queue is empty");
        }
    }
}
