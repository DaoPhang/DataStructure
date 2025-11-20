package DS.Week5;


// Stack Implementation
// Operations: Push, Pop, Check if empty, Check if full, peek
// There is POINTER !!!
// Bottom Up approach
// LIFO: Last In First Out
//Generic stack implementation
//data processing vs positioning
//generic always affect data processing
//Few Types od generics in JAVA
/* <T> mostly using T in this course!
<E>
<?>
<> this symbol is known as wrapper */

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

    // checking if stack is empty
    // (1) if push() has never been executed, the stack should be empty and the top pointer should never moved
    // (2) if pop() executed for all elements inside Stack, the Stack should be empty

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
    // when can we push items into Stack?
    // (1) when Stack is empty? YES!!
    // (2) when Stack is full? NO
    // (3) when Stack is notEmpty? YES!!
    // (4) when Stack is notFull? YES!!
    // ??? think about other situation 
    public void push(String str){

        if (top < maxSize){
            arr[top] = str;
            top++;
        }
        else{
            System.out.println("Stack is full...");

        }
    }

    // pop() removes item front the Stack
    // Can remove item when Stack is full? YES
    // Can remove item when Stack is notFull? YES
    // Can remove item when Stack is empty? NO!
    public String pop(){
        if (!isEmpty()){
            String temp = peek();
            arr[top-1] = null;
            top--;
            return temp;
        }
        return null;
    }


    // peek always look at the top of the Stack
    // what is the element/items at the top of the Stack?? it is whatever maxSize is, minus 1 (maxSize-1)
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

public class App8{
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

