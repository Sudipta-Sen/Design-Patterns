package com.designpatterns.Structural.FacadePattern.Subsystems;

import com.designpatterns.Structural.FacadePattern.BankingSystem.BankAccount;

public class LoanProcessingSubsystem {
    public void processLoan(BankAccount account, double loanAmount) {
        System.out.println("Processing loan application for account " + account.getAccountNo() + " for amount: " + loanAmount);

    }
}