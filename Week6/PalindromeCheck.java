package DS.Week6;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a word: ");
            String word = sc.nextLine();

            CharStack stack = new CharStack(word.length());

            for(int i = 0; i < word.length(); i++){
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
}
