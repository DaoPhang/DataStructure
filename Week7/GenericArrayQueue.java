package DS.Week7;

public class GenericArrayQueue {
    public static void main(String[] args) {
        // Example with Integers
        GQueue<Integer> intQ = new GQueue<>(5);
        intQ.enqueue(10);
        intQ.enqueue(20);
        intQ.display();
        intQ.dequeue();
        intQ.display();

        // Example with Strings
        GQueue<String> strQ = new GQueue<>(5);
        strQ.enqueueMany("Apple, Banana, Cherry");
        intQ.display();
        strQ.display();
    }
}

class GQueue<T> {
    private int tail;
    private int maxSize;
    private T[] arr;

    @SuppressWarnings("unchecked")
    public GQueue(int size) {
        this.tail = 0;
        this.maxSize = size;
        // Creating a generic array via Object casting
        this.arr = (T[]) new Object[maxSize];
    }

    public boolean isEmpty() {
        return tail == 0;
    }

    public boolean isFull() {
        return tail >= maxSize;
    }

    public void enqueue(T item) {
        if (!isFull()) {
            arr[tail] = item;
            tail++;
            System.out.println("Enqueued: " + item);
        } else {
            System.out.println("Queue is full!");
        }
    }

    // Since T can be anything, we accept an array of T for 'Many'
    public void enqueueMany(String multiStr) {
        String[] tempStr = multiStr.split(", ");
        for (String s : tempStr) {
            // This assumes the queue is meant for Strings.
            // If T is Integer, you'd need a different parsing logic.
            enqueue((T) s);
        }
    }

    public void dequeue() {
        if (!isEmpty()) {
            T temp = arr[0];
            // Shifting logic from your original code
            for (int i = 0; i < tail - 1; i++) {
                arr[i] = arr[i + 1];
            }
            tail--;
            arr[tail] = null;
            System.out.println("Dequeued: " + temp);
        } else {
            System.out.println("Queue is empty!");
        }
    }

    public void display() {
        System.out.print("Queue: [ ");
        for (int i = 0; i < tail; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}