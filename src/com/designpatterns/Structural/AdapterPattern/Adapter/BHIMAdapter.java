package com.designpatterns.Structural.AdapterPattern.Adapter;

import com.designpatterns.Structural.AdapterPattern.Target.PaymentProcessor;
import com.designpatterns.Structural.AdapterPattern.Adaptee.BHIMPayment;

public class BHIMAdapter implements PaymentProcessor {
    BHIMPayment bhimPayment;

    public BHIMAdapter(BHIMPayment bhimPayment) {
        this.bhimPayment = bhimPayment;
    }
    
    @Override
    public void pay(double amount) {
        bhimPayment.makePayment(amount);
    }
}