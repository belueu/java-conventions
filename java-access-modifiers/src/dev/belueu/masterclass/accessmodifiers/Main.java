package dev.belueu.masterclass.accessmodifiers;

public class Main {
    public static void main(String[] args) {
        Account crisAccount = new Account("Cristi");
        crisAccount.deposit(1000);
        crisAccount.withdraw(500);
        crisAccount.withdraw(-200);
        crisAccount.deposit(-20);
        crisAccount.calculateBalance();
//        crisAccount.balance = 5000;

        System.out.println("Balance on account is: " + crisAccount.getBalance());
//        crisAccount.transactions.add(4500.0);
        crisAccount.calculateBalance();
    }
}