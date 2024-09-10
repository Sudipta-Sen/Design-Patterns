package com.designpatterns.Structural.AdapterPattern.Adaptee;

public class PayPalPayment {
    public void sendPayment(double amount) {
        System.out.println("Payment of Rs."+ amount + " done via paypal");
    }
}