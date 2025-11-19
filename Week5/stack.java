package DS.Week5;


class Stack{
    // declaring some Stack data or variables
    int maxSize;    // the max size of our stack
    int top;        // stack pointer 
    String arr[];   // declare an array of type String (so we can work with String data for our Stack)

    // Stack should also has its own Constructors
    public Stack (int n){
        this.maxSize = n;
        arr = new String[maxSize];  // here we create the array as Object of String with maxSize as the array size
        top = 0;                    // top is an pointer that is integer value arr[top] = arr[0]

    }


    public boolean isEmpty(){
        if (top == 0){
            return true;
        }
        else {
            return false;
        }

    }

    public boolean isFull() {
        return top == maxSize;
    }

    public void push(String str){

        if (top < maxSize){
            arr[top] = str;
            top++;
        }
        else{
            System.out.println("Stack is full...");

        }
    }

    public String pop(){
        if (!isEmpty()){
            String temp = peek();
            arr[top-1] = null;
            top--;
            return temp;
        }
        return null;
    }

    public String peek(){
        if (isEmpty()){
            return null;
        }
            return arr[top - 1];
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack contents (top to bottom):");
        for (int i = top - 1; i >= 0; i--){
            System.out.println(arr[i]);
        }
        
        System.out.println();

        for (int i = maxSize - 1; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
}

public class stack{
    public static void main(String[] args) {
        
        Stack stack1 = new Stack(5);
        stack1.push("apple");
        stack1.push("banana");
        stack1.push("cherry");
        stack1.push("blueberry");
        stack1.push("durian");

        stack1.display();
        System.out.println();
        
        System.out.println("Popped: " + stack1.pop());
        System.out.println("Popped: " + stack1.pop());
        System.out.println();

        stack1.display();
    }
    
}

