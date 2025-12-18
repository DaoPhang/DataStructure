package DS.Week7;

public class GenericQueue<T> {
    public static void main(String[] args) {
        Queue<String> q1 = new Queue<>(10);
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

        // Using pushMany() and popAll() methods
        System.out.println("\n=== Testing pushMany() and popAll() ===");
        Queue<String> q2 = new Queue<>(10);
        q2.pushMany("Apple, Banana, Cherry, Date");
        q2.display();
        q2.popAll();
    }

    static class Queue<T> {
        // Declare variables/data for queue class
        private int head;  // The head pointer, handles dequeue
        private int tail;  // The tail pointer, similar to top in stack
        private int maxSize;
        private T[] arr;

        public Queue() {
        }

        // Constructor
        public Queue(int size) {
            this.head = 0;
            this.tail = 0;
            this.maxSize = size;
            this.arr = (T[]) new Object[maxSize];  // Generic array type
        }

        public boolean isEmpty() {
            return tail == 0;
        }

        public boolean isFull() {
            return tail >= maxSize;
        }

        public void enqueue(T item) {
            // FIFO rule, enqueue at tail, dequeue at head
            // Don't forget to move all elements to replace head

            if (!isFull()) {
                arr[tail] = item;
                tail++;
                System.out.println("Enqueue: " + item);
            } else {
                System.out.println("Queue is full...");
            }
        }

        public void enqueueMany(String multiStr) {
            String[] tempStr = multiStr.split(", ");  // Delimiter: comma + space
            for (String str : tempStr) {
                enqueue((T) str);  // Cast to generic type
            }
        }

        public void pushMany(String multiStr) {
            String[] tempStr = multiStr.split(", ");  // Delimiter: comma + space
            for (String str : tempStr) {
                enqueue((T) str);  // Cast to generic type
            }
        }

        public void dequeue() {
            if (!isEmpty()) {
                // FIFO rule, always dequeue at head
                // Must shift elements to the correct position
                T temp = arr[head];
                for (int i = 0; i < tail - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                // Take care of last element
                tail--;
                arr[tail] = null;
                System.out.println("Dequeue: " + temp);
            } else {
                System.out.println("Queue is empty...");
            }
        }

        public void dequeueAll() {
            if (!isEmpty()) {
                System.out.println("\nThere are " + tail + " items in the queue. Removing all.... ");
                while (!isEmpty()) {
                    dequeue();
                }
            }
        }

        public void popAll() {
            if (!isEmpty()) {
                System.out.println("\nThere are " + tail + " items in the queue. Removing all.... ");
                while (!isEmpty()) {
                    dequeue();
                }
            }
        }

        public void display() {
            System.out.println("Displaying queue..............");
            for (int i = 0; i < tail; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}