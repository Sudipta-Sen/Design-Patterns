package com.designpatterns.Structural.FacadePattern.Subsystems;

import com.designpatterns.Structural.FacadePattern.BankingSystem.BankAccount;

public class CreditScoreSubsystem {
    public boolean checkCreditScoreForLoan(BankAccount account, double amount) {
        System.out.println("Fetching credit score for account number: " + account.getAccountNo());
        return account.getCreditScore() >= 700;
    }
}