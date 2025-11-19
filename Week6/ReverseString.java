package DS.Week6;

import java.util.Scanner;

class Stack {
    int maxSize;
    int top;
    char arr[];

    Stack(int size){
        maxSize = size;
        top = -1;
        arr = new char[maxSize];
    }

    boolean isEmpty() { return top == -1; }
    boolean isFull() { return top == maxSize - 1; }

    void push(char c){
        if(!isFull()){
            arr[++top] = c;
        }
    }

    char pop(){
        return (isEmpty()) ? '\0' : arr[top--];
    }

    char peek() {
        return (isEmpty()) ? '\0' : arr[top];
    }
}

public class ReverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        Stack stack = new Stack(input.length());

        for(int i=0; i<input.length(); i++){
            stack.push(input.charAt(i));
        }

        System.out.print("Reversed: ");
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        sc.close();
    }
}
