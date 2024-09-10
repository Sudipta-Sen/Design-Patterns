package com.designpatterns.Structural.AdapterPattern;

import com.designpatterns.Structural.AdapterPattern.Adaptee.BHIMPayment;
import com.designpatterns.Structural.AdapterPattern.Adaptee.PayPalPayment;
import com.designpatterns.Structural.AdapterPattern.Adapter.BHIMAdapter;
import com.designpatterns.Structural.AdapterPattern.Adapter.PayPalAdapter;
import com.designpatterns.Structural.AdapterPattern.Target.PaymentProcessor;

public class ECommercePlatform {
    public static void main(String[] args) {
        //Use paypal for payment
        PaymentProcessor paypal = new PayPalAdapter(new PayPalPayment());
        paypal.pay(110.0);

        //Use bhim for payment
        PaymentProcessor bhim = new BHIMAdapter(new BHIMPayment());
        bhim.pay(210.7);
    }
}