package com.example.demo.classes;

public class checkingAccount extends User {

    private double balance;
    private int accountNumber;

    public checkingAccount(String fullName, String email, String password, double balance) {
        super(fullName, email, password);
        this.balance = balance;
        this.accountNumber = generateAccountNumber();
    }

    public int generateAccountNumber() {
        int accountNumber = (int) Math.random() * 1000;
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    
    
}
