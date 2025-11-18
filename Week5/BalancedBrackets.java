package DS.Week5;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {

    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            // 1. If open bracket, PUSH it
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // 2. If closed bracket, process it
            else {
                // If stack is empty, we have a closed bracket without an open one -> Invalid
                if (stack.isEmpty()) return false;
                
                char top = stack.pop(); // Get the most recent open bracket
                
                // Check for mismatch
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }

        // 3. If stack is empty, everything was closed correctly.
        // If not empty, we have open brackets left over.
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));      // true
        System.out.println(isValid("([)]"));      // false (Order matters!)
        System.out.println(isValid("(("));        // false (Not closed)
    }
}