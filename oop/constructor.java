package oop;

import java.time.LocalDateTime;

public class constructor {
    
    public static class BankAccount{
        private String name;
        private LocalDateTime opened;
        private double balance;

        public BankAccount() {
            this.name = "";
            this.opened = LocalDateTime.now();
            this.balance = 0.0d;
        }

        public BankAccount(String name, LocalDateTime opened, double balance) {
            this.name = name;
            this.opened = opened;
            this.balance = balance;
        }

        public BankAccount(BankAccount other) { // copy-constructor
            this.name = other.name;
            this.opened = LocalDateTime.now();
            this.balance = 0.0f;
        }   
        public BankAccount(String name) {
            this(name, LocalDateTime.now(), 0.0f); //chained-constructor
        }

        @Override
        public String toString(){
            return String.format("%s, %s, %f", this.name, this.opened.toString(), this.balance);
        }
    }

    //immutable class

    class Transaction{
        final BankAccount bankAccount;
        final LocalDateTime date;
        final double amount;

        public Transaction(BankAccount account, LocalDateTime date, double amount){
            this.bankAccount = account;
            this.date = date;
            this.amount = amount;
        }

    }
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println(account.toString());
    }
}
