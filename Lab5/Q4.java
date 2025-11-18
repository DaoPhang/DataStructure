package DS.Lab5;

import java.util.Stack;

public class Q4 {
    public static String toPostfix(String str){
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') continue;
            if (ch == '(') {
                continue;
            }

            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            }else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^') {
                stack.push(ch);
            }else if (ch == ')') {
                postfix.append(stack.pop());
            }
        }

        return postfix.toString();
    }

    public static void main(String[] args) {
        String str = "((((A-B)+((M^N)*(O+P)))-((Q/(R^S))*T))+Z)";
        System.out.println("Infix:  " + str);
        System.out.println("Postfix: " + toPostfix(str));
    }
}