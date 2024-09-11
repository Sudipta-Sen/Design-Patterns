package com.designpatterns.Structural.FacadePattern.Subsystems;

import com.designpatterns.Structural.FacadePattern.BankingSystem.BankAccount;

public class AccountManagementSubsystem {
    public boolean hasSufficientBalanceForLoan(BankAccount account, double amount) {
        System.out.println("Checking if account number: " + account.getAccountNo() + " has sufficient balance.");
        return account.getBalance() >= amount*0.01;
    }
}