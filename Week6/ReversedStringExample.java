package DS.Week6;

import java.util.Scanner;

public class ReversedStringExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int n = input.length();

        StackReverse stack = new StackReverse(n);

        for (int i = 0; i < n; i++) {
            char c = input.charAt(i);
            stack.push(String.valueOf(c));
        }

        System.out.print("Reversed string: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        System.out.println();
        
        sc.close();
    }
}

class StackReverse {
    int maxSize;
    int top;
    String arr[];

    public StackReverse(int n) {
        this.maxSize = n;
        arr = new String[maxSize];
        top = 0;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return top == maxSize;
    }

    public void push(String str) {
        if (top < maxSize) {
            arr[top] = str;
            top++;
        } else {
            System.out.println("Stack is full...");
        }
    }

    public String pop() {
        if (!isEmpty()) {
            String temp = peek();
            arr[top - 1] = null;
            top--;
            return temp;
        }
        return null;
    }

    public String peek() {
        if (isEmpty()) {
            return null;
        }
        return arr[top - 1];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Stack contents (top to bottom):");
        for (int i = maxSize - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}