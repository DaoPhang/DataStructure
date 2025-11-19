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
}

public class PalindromeCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        Stack stack = new Stack(word.length());

        for(int i=0; i<word.length(); i++){
            stack.push(word.charAt(i));
        }

        String reversed = "";
        while(!stack.isEmpty()){
            reversed += stack.pop();
        }

        if(word.equals(reversed)){
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is NOT a palindrome.");
        }
    }
}
