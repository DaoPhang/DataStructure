package DS.Lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // Keep categories in the order they first appear
        Map<String, MyQueue<String>> buckets = new LinkedHashMap<>();

        // Read the file and enqueue each value into its category queue
        try (Scanner fileScanner = new Scanner(new File("DS/Lab7/lab7q3.txt"))) {
            while (fileScanner.hasNext()) {
                String code = fileScanner.next();        // e.g. "P03"
                if (!fileScanner.hasNext()) {
                    break;                               // unmatched code at end
                }
                String value = fileScanner.next();       // e.g. "happy"
                buckets.computeIfAbsent(code, k -> new MyQueue<>()).enqueue(value);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not find lab7q3.txt: " + e.getMessage());
            return;
        }

        // Display each category with its elements (FIFO within each)
        for (Map.Entry<String, MyQueue<String>> entry : buckets.entrySet()) {
            String code = entry.getKey();
            MyQueue<String> queue = entry.getValue();
            System.out.print("Product " + code + ": \n");

            boolean first = true;
            while (!queue.isEmpty()) {
                if (!first) {
                    System.out.print(" -> ");
                }
                System.out.print(queue.dequeue());
                first = false;
            }
            System.out.println();
        }
    }
}
