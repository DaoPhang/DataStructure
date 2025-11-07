package DS.Lab5;

public class PostFixEvaluation {
    public static int evaluatePostFix(String expression){
        MyStack stack = new MyStack();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if(ch == ' '){
                continue;
            }

            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            }

            else if (isOperator(ch)) {
                int num2 = stack.pop();
                int num1 = stack.pop();

                int result = applyOperator(num1, num2, ch);
                stack.push(result);
            }
        }
        return stack.pop();
    }

    public static boolean isOperator(char c){
        return c == '+' || c =='-'|| c == '*' || c=='/';
    }

    public static int applyOperator(int a, int b, char op){
        switch(op){
            case '+':
                return a + b;
            case'-':
                return a-b;
            case '*':
                return a * b;
            case '/':
                return a/b;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("12 + 3 += " + evaluatePostFix("12 +3+"));
        
        System.out.println("48 * 3 -= " + evaluatePostFix("48 * 3 -"));
        
        System.out.println("12 / 3 += " + evaluatePostFix("12 /3+"));
    }
}
