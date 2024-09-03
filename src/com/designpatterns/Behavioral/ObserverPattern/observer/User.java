package com.designpatterns.Behavioral.ObserverPattern.observer;

import com.designpatterns.Behavioral.ObserverPattern.observable.ProductObservableInterface;

public class User {
    String email, name;

    public User(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }

    public void subscribeToEmail(ProductObservableInterface obj) {
        System.out.println("User "+this.name+" is subscribing for email alert for "+ obj.getProductName());
        obj.addObserver(new EmailAlert(this));
    }

    public void subscribeToNotification(ProductObservableInterface obj) {
        System.out.println("User "+this.name+" is subscribing for notification alert for " + obj.getProductName());
        obj.addObserver(new Notification(this));
    }
}