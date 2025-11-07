package DS.Lab2.q4;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class q4a {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter ten integers: ");

        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }

        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);

        System.out.print("Output: ");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}
