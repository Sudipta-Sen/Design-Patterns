package com.designpatterns.Structural.FacadePattern.BankingSystem;

import java.util.HashMap;
import java.util.Map;

public class BankingSystem {
    private Map<String, BankAccount> accounts;
    private int accountCounter = 12563;

    public BankingSystem() {
        accounts = new HashMap<>();
    }

    public String openAccount(String username, int creditScore) {
        String accountNo = getAccountNo();
        BankAccount newAccount = new BankAccount(username, accountNo, creditScore);
        accounts.put(accountNo, newAccount);
        return accountNo;
    }

    public BankAccount getAccount(String accountNo) {
        if(accounts.containsKey(accountNo)) return accounts.get(accountNo);
        return null;
    }

    private String getAccountNo() {
        String number = String.valueOf(accountCounter);
        accountCounter = accountCounter + 119;
        return number;
    }

    public boolean deposit(String accountNo, double amount) {
        BankAccount account = getAccount(accountNo);
        if(accountNo == null) return false;
        account.deposit(amount);
        return true;
    }

}