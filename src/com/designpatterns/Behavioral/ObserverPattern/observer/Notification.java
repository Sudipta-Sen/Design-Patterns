package com.designpatterns.Behavioral.ObserverPattern.observer;

import com.designpatterns.Behavioral.ObserverPattern.observable.Product;

public class Notification implements Observer {
    User user;
    public Notification(User user) {
        this.user = user;
    }

    @Override
    public void update(Product product) {
        System.out.println("Hi, "+user.getName()+" new notification comes in. "+product.getProductName()+" is now availble");
    }
}