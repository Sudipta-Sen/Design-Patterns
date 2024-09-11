package com.designpatterns.Structural.FacadePattern;

import com.designpatterns.Structural.FacadePattern.Facade.BankingFacade;

public class client {
    private static void getLoan(BankingFacade bank, String accountNo, double amount) {
        System.out.println("\nApplying for loan for account number " + accountNo + " of amount " + amount);
        boolean status = bank.applyForLoan(accountNo, amount);
        if(!status) {
            System.out.println("Failed to get loan of amount " +  amount + " for account number " + accountNo );
        } else {
            System.out.println("Loan for account number "+ accountNo + " of amount " + amount + " has been processed successfully");
        }
    }
    public static void main(String[] args) {
        BankingFacade bank = new BankingFacade();

        String accountNo1 = bank.openAccount("Sudipta", 712);
        String accountNo2 = bank.openAccount("Shreya", 698);

        System.out.println("Account Number for Sudipta: "+accountNo1);
        System.out.println("Account Number for Shreya: "+accountNo2);

        System.out.println("\nDeposit 1000 for the account " + accountNo1);
        bank.deposit(accountNo1, 1000);
        getLoan(bank, accountNo1, 120000);
    
        System.out.println("\nDeposit 200 for the account " + accountNo1);
        bank.deposit(accountNo1, 200);
        getLoan(bank, accountNo1, 120000);

        System.out.println("\nDeposit 12000 for the account " + accountNo1);
        bank.deposit(accountNo2, 12000);

        getLoan(bank, accountNo2, 10000);

    }
}