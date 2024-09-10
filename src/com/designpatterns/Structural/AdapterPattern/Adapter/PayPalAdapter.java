package com.designpatterns.Structural.AdapterPattern.Adapter;

import com.designpatterns.Structural.AdapterPattern.Target.PaymentProcessor;
import com.designpatterns.Structural.AdapterPattern.Adaptee.PayPalPayment;

public class PayPalAdapter implements PaymentProcessor {
    PayPalPayment payPalPayment;

    public PayPalAdapter(PayPalPayment payPalPayment) {
        this.payPalPayment = payPalPayment;
    }
    
    @Override
    public void pay(double amount) {
        payPalPayment.sendPayment(amount);
    }
}