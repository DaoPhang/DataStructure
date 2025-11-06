package DS.Lab2.question3;

import java.util.Scanner;
import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter five numbers. ");
        for(int i = 0; i<5; i++){
            int num = sc.nextInt();
            numbers.add(num);
        }

        int sum = 0;
        for(int num: numbers){
            sum += num;
        }

        System.out.println("Sum of all numbers: " + sum);
    }
}
