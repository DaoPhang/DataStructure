package DS.Week6;

class CharStack {
    private final int maxSize;
    private int top;
    private final char[] arr;

    CharStack(int size) {
        maxSize = size;
        top = -1;
        arr = new char[maxSize];
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == maxSize - 1;
    }

    void push(char c) {
        if (!isFull()) {
            arr[++top] = c;
        }
    }

    char pop() {
        return (isEmpty()) ? '\0' : arr[top--];
    }

    char peek() {
        return (isEmpty()) ? '\0' : arr[top];
    }
}

