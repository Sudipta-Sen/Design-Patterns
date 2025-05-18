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

    public void subscribe(ProductObservableInterface obj, Observer observer) {
        System.out.println("User "+this.name+" is subscribing for alert for "+ obj.getObservableName());
        obj.addObserver(observer);
    }
}