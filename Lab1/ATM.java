package DS.Lab1;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create 10 accounts with initial balance of $100
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100);
        }

        while (true) {
            System.out.print("Enter an id (0-9): ");
            int id = input.nextInt();

            // Validate ID
            while (id < 0 || id > 9) {
                System.out.print("Invalid ID. Please enter a correct ID (0-9): ");
                id = input.nextInt();
            }

            // Show main menu
            int choice = 0;
            do {
                System.out.println("\nMain menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                System.out.print("Enter a choice: ");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("The balance is $" + accounts[id].getBalance());
                        break;
                    case 2:
                        System.out.print("Enter an amount to withdraw: ");
                        double withdrawAmount = input.nextDouble();
                        accounts[id].withdraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.print("Enter an amount to deposit: ");
                        double depositAmount = input.nextDouble();
                        accounts[id].deposit(depositAmount);
                        break;
                    case 4:
                        System.out.println("Exiting account...");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } while (choice != 4);
        }
    }
}

