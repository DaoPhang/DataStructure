package DS.Week6;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            CharStack stack = new CharStack(input.length());

            for(int i = 0; i < input.length(); i++){
                stack.push(input.charAt(i));
            }

            System.out.print("Reversed: ");
            while(!stack.isEmpty()){
                System.out.print(stack.pop());
            }
        }
    }
}
