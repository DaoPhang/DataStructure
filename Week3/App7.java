package DS.Week3;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class App7 {

    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add("apple");
        a1.add("banana");
        a1.add("orange");

        a1.get(0);

        String fruit = (String)a1.get(0);
        System.out.println(fruit);

        for(int i = 0; i <3; i++){
            fruit = (String)a1.get(i);
            System.out.println(fruit);
        }

        ArrayList<String> l1 = new ArrayList<String>();
            l1.add("cat");
            l1.add("mouse");
            l1.add("bat");
            System.out.println(l1);
            for(String numbers : l1){
                System.out.println(numbers);
            }
            
            ArrayList<Integer>l2 = new ArrayList<Integer>();
            l2.add(1000);
            l2.add(10000000);
            System.out.println(l2);

            ArrayList<Double>l3 = new ArrayList<Double>();
    }

}
