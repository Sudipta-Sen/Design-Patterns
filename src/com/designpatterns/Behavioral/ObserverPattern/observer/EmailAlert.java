package com.designpatterns.Behavioral.ObserverPattern.observer;

import com.designpatterns.Behavioral.ObserverPattern.observable.Product;

public class EmailAlert implements Observer {
    User user;
    public EmailAlert(User user) {
        this.user = user;
    }

    @Override
    public void update(Product product) {
        System.out.println("Send email to "+user.getEmail()+" to notify that "+product.getProductName()+" is now availble");
    }
}