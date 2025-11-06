package DS.Week4;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String input = "hello";
        Stack<Character> stack = new Stack<>();

        for(char c : input.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";
        while(!stack.isEmpty()) {
            reversed += stack.pop();
        }

        System.out.println("Reversed: " + reversed);
    }
}
