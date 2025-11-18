package DS.Week5;

import java.util.ArrayDeque;
import java.util.Deque;

public class StringReverser {
    public static void main(String[] args) {
        String input = "HELLO";
        
        // Use Deque (ArrayDeque) instead of Stack
        Deque<Character> stack = new ArrayDeque<>();

        // 1. Push every letter onto the stack
        for (char letter : input.toCharArray()) {
            stack.push(letter);
        }
        
        // Stack is now: Top -> [O, L, L, E, H] <- Bottom

        System.out.print("Reversed: ");
        
        // 2. Pop them off one by one
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        // Output: OLLEH
    }
}