package DS.Lab3.q4;

import java.util.ArrayList;
import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.print("Enter ten integers: ");
        
        
        for(int i =0; i<10; i++){
            list.add(sc.nextInt());
        }

        System.out.print("Output: ");
        ArrayList<Integer>distinct = new ArrayList<>();
        for(int num : list){
            if(!distinct.contains(num)){
            distinct.add(num);
            }
        }

        for(int num : distinct){
            System.out.print(num + " ");
        }
    }
}
