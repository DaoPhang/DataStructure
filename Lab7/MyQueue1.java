package DS.Lab7;

public class MyQueue1<T> {

    private int head;
    private int tail;
    private int maxSize;
    private T[] arr;

    public MyQueue1(){
    }

    @SuppressWarnings("unchecked")
    public MyQueue1(int size) {
        this.head = 0;
        this.tail = 0;
        this.maxSize = size;
        this.arr = (T[])new Object[maxSize];
    }

    public boolean isEmpty(){
        return tail ==0;
    }

    public boolean isFull(){
        return tail>= maxSize;
    }

    public T peek(){
        if(isEmpty()){
            return null;
        }
        return arr[head];
    }

    public void enqueue(T item){
        if (!isFull()){
            arr[tail] = item;
            tail++;
            System.out.println("Enqueue: " + item);
        }else{
            System.out.println("Queue is Full");
        }
    }

    public void dequeue(){
        if(!isEmpty()){
            T temp = arr[head];
            for(int i = 0; i<tail -1; i++){
                arr[i] = arr[i+1];
            }
            tail --;
            arr[tail] = null;
            System.out.println("Dequeue: " + temp);
        }else{
            System.out.println("Queue is empty..");
        }
    }

    public void dequeueAll(){
        this.head = 0;
        this.tail = 0;
        for(int i =0; i<maxSize; i++){
            arr[i] = null;
        }
        System.out.println("All items has been dequeue");
    }

    public void display(){
        System.out.println("Displaying queue.....");
        for(int i =0; i<tail; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[]args){
        MyQueue1<Integer> q1 = new MyQueue1<>(5);
        q1.enqueue(5);
        q1.enqueue(10);
        q1.enqueue(15);
        q1.enqueue(20);
        q1.enqueue(25);
        q1.display();

        System.out.println("Peeking: " + q1.peek());
        q1.dequeue();
        q1.display();
    }
}