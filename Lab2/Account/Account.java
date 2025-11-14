package DS.Lab2.Account;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0.1; // percentage, e.g. 1.5 means 1.5%
    private Date dateCreated;

    // New: keeps history of all transactions
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public Account() {
        dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12 / 100;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    // Expose history via toString only as required by the exercise

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
            return;
        }
        balance -= amount;
        transactions.add(new Transaction('w', amount, balance,
                "RM" + amount + " is successfully withdrawn."));
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('d', amount, balance,
                "RM" + amount + " is successfully deposited."));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id).append('\n');
        sb.append("Balance: ").append(balance).append('\n');
        sb.append("Annual Interest Rate: ").append(annualInterestRate).append('\n');
        sb.append("Date Created: ").append(dateCreated).append('\n');
        sb.append('\n');
        sb.append("Transaction History:\n\n");
        for (Transaction t : transactions) {
            sb.append(t.toString()).append('\n');
        }
        return sb.toString();
    }

    // Transaction class definition
    private static class Transaction {
        private char type; // 'w' for withdraw, 'd' for deposit
        private double amount;
        private double balance;
        private String description;

        public Transaction(char type, double amount, double balance, String description) {
            this.type = type;
            this.amount = amount;
            this.balance = balance;
            this.description = description;
        }

        @Override
        public String toString() {
            String typeStr = (type == 'w' || type == 'W') ? "Withdrawal" : "Deposit";
            return "Type of transaction: " + typeStr + "\n" +
                    "Transaction amount: " + amount + "\n" +
                    "Balance: " + balance + "\n" +
                    "Description: " + description + "\n";
        }
    }
}
