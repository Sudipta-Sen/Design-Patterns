package com.designpatterns.Structural.FacadePattern.Facade;

import com.designpatterns.Structural.FacadePattern.BankingSystem.*;
import com.designpatterns.Structural.FacadePattern.Subsystems.*;

public class BankingFacade {
    private AccountManagementSubsystem accountManagementSubsystem;
    private CreditScoreSubsystem creditScoreSubsystem;
    private LoanProcessingSubsystem loanProcessingSubsystem;
    private BankingSystem bankingSystem;

    public BankingFacade() {
        this.bankingSystem = new BankingSystem();
        this.loanProcessingSubsystem = new LoanProcessingSubsystem();
        this.creditScoreSubsystem = new CreditScoreSubsystem();
        this.accountManagementSubsystem = new AccountManagementSubsystem();
    }

    public String openAccount(String username, int creditScore) {
        return bankingSystem.openAccount(username, creditScore);
    }

    public boolean deposit(String accountNo, double amount) {
        if(!bankingSystem.deposit(accountNo, amount)) {
            System.out.println("Failed to deposit "+amount+" in the account "+accountNo);
            return false;
        }
        return true;
    }

    public boolean applyForLoan(String accountNo, double loanAmount) {
        BankAccount bankAccount = bankingSystem.getAccount(accountNo);
        if(bankAccount == null) {
            System.out.println("Account number: "+accountNo+" does not exists");
            return false;
        }

        if(!accountManagementSubsystem.hasSufficientBalanceForLoan(bankAccount, loanAmount)) {
            System.out.println("Account number: "+accountNo+" does not have sufficient balance for loan amount "+loanAmount);
            return false;
        }

        if(!creditScoreSubsystem.checkCreditScoreForLoan(bankAccount, loanAmount)) {
            System.out.println("Account number: "+accountNo+" has low credit score for loan ");
            return false;
        }

        loanProcessingSubsystem.processLoan(bankAccount, loanAmount);
        return true;
    }
}