package com.designpatterns.Behavioral.ObserverPattern;

import com.designpatterns.Behavioral.ObserverPattern.observable.IPhone;
import com.designpatterns.Behavioral.ObserverPattern.observable.WashingMachine;
import com.designpatterns.Behavioral.ObserverPattern.observer.User;

public class main{
    public static void main(String[] args) {

        System.out.println("Add iphone with stocke size 0");
        IPhone iPhone = new IPhone(0);
        System.out.println("Add Washing machine with stocke size 0");
        WashingMachine washingMachine = new WashingMachine(0);

        User user1 = new User("sumit.gmail.com", "Sumit Singha");
        User user2 = new User("anant.outlook.com", "Anant Tiwari");
        User user3 = new User("sudisen.visa.com", "Sudipta Sen");

        user1.subscribeToEmail(iPhone);
        user2.subscribeToEmail(washingMachine);
        user3.subscribeToNotification(iPhone);

        System.out.println("\nAdd 5 new stocks of iphone");
        iPhone.setData(5);
        System.out.println("\nAdd 2 new stocks of washing machine");
        washingMachine.setData(2);

        System.out.println("\nAdd 1 new stocks of iphone");
        iPhone.setData(1);

        System.out.println("\nAll washing machine got sold out");
        washingMachine.setData(-2);

        System.out.println("\nAdd 10 new stocks of washing machine");
        washingMachine.setData(10);

    }
}