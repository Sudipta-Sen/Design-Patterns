package com.designpatterns.Structural.FacadePattern.BankingSystem;

public class BankAccount {
    private String username;
    private String AccountNo;
    private double balance;
    private int creditScore;

    public BankAccount(String username, String AccountNo, int creditScore) {
        this.username = username;
        this.AccountNo = AccountNo;
        this.creditScore = creditScore;
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public double getBalance() { return balance; }

    public String getUsername() { return username; }

    public String getAccountNo() { return AccountNo; }

    public int getCreditScore() { return creditScore; }
}