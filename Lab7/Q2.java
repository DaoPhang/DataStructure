package DS.Lab7;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter transactions : ");
            String input = sc.nextLine();
            
            // Split the input by " | " to get individual transactions
            String[] transactions = input.split(" \\| ");
            
            // Create a queue to store transactions
            MyQueue<String> transactionQueue = new MyQueue<>();
            
            // Enqueue all transactions
            for (String transaction : transactions) {
                transactionQueue.enqueue(transaction.trim());
            }
            
            // Process and display transactions
            int balance = 1000; // Initial balance
            StringBuilder output = new StringBuilder();
            
            // Process each transaction and build output string
            while (!transactionQueue.isEmpty()) {
                String transaction = transactionQueue.dequeue();
                
                // Add to output string
                if (output.length() > 0) {
                    output.append(" --> ");
                }
                output.append(transaction);
                
                // Process transaction to update balance
                String[] parts = transaction.split(" ");
                if (parts.length == 2) {
                    String type = parts[0];
                    int amount = Integer.parseInt(parts[1]);
                    
                    if (type.equals("D")) {
                        balance += amount; // Deposit
                    } else if (type.equals("W")) {
                        balance -= amount; // Withdrawal
                    }
                }
            }
            
            // Display the result
            System.out.println(output.toString() + " --> Initial Balance: " + balance);

            sc.close();
        }
    }
}
