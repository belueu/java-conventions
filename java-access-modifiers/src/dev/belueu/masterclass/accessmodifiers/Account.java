package dev.belueu.masterclass.accessmodifiers;

import java.util.ArrayList;

public class Account {
    private String accountName;
    private double balance;
    private ArrayList<Double> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. Balance is now: " + this.balance);
        } else {
            System.out.println("Cannot deposit negative sums");
        }
    }

    public void withdraw(double amount) {
        double withdrawAmount = -amount;
        if (withdrawAmount < 0) {
            this.transactions.add(withdrawAmount);
            this.balance += withdrawAmount;
            System.out.println(amount + " withdrawn. Balance is now: " + this.balance);
        } else {
            System.out.println("Cannot withdraw negative sums");
        }
    }

    public void calculateBalance() {
        this.balance = 0;
        for (double amount : this.transactions) {
            this.balance += amount;
        }
        System.out.println("Calculated Balance is: " + this.balance);
    }
}
