package com.designpatterns.Structural.AdapterPattern.Adaptee;

public class BHIMPayment {
    public void makePayment(double amount) {
        System.out.println("Payment of Rs."+ amount + " done via BHIM");
    }
}