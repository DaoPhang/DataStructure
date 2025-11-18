package DS.Week5;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Create a Stack for Strings
        Stack<String> plates = new Stack<>();

        // 1. PUSH: Add items to the top
        plates.push("Plate 1");
        plates.push("Plate 2");
        plates.push("Plate 3");

        System.out.println("Current Stack: " + plates);

        // 2. PEEK: Look at the top item without removing it
        String topPlate = plates.peek();
        System.out.println("Top plate is: " + topPlate);

        // 3. POP: Remove the top item
        String removedPlate = plates.pop();
        System.out.println("Removed: " + removedPlate);
        
        System.out.println("Stack after pop: " + plates);
    }
}