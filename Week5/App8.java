package DS.Week5;

// Stack Implementation
// Operations: Push, Pop, Check if empty, Check if full, peek
// There is POINTER !!!
// Bottom Up approach 
// LIFO: Last In First Out

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

    // public boolean isFull(){
    //     //if () -- try yourself!
    // }

    // when can we push items into Stack?
    // (1) when Stack is empty? YES!!
    // (2) when Stack is full? NO
    // (3) when Stack is notEmpty? YES!!
    // (4) when Stack is notFull? YES!!
    // ??? think about other situation 
    public void push(String str){

        if (top < maxSize){
            arr[top] = str;
        }
        else{
            System.out.println("Stack is full...");

        }
    }

    // pop() removes item fromt the Stack
    // Can remove item when Stack is full? YES
    // Can remove item when Stack is notFull? YES
    // Can remove item when Stack is empty? NO!
    public String pop(){
        if (!isEmpty()){
            String temp = peek();   // precaution step to always check what to remove (LIFO)
            arr[top-1] = null;      // delete the element to remove
            top--;

            return temp;

        }

    }


    // peek always look at the top of the Stack
    // what is the element/items at the top of the Stack?? it is whatever maxSize is, minus 1 (maxSize-1)    
    public String peek(){
        if (top>0){
            if (!isEmpty()){
                return arr[top -1];     // return element at top-1
            }
            else{
                return null;            // otherwise, Stack must be empty! no data to peek!
            }
            
        }

    }

    // create a method display to show elements of stack
    // you may use for loop to do this
    

}

public class App8{
    public static void main(String[] args) {
        
        Stack stack1 = new Stack(5);
        stack1.push("apple");
        stack1.push("banana");
        stack1.push("cherry");


        
    }
    
}

