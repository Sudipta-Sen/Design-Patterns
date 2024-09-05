package com.designpatterns.Structural.DecoratorPattern;

import com.designpatterns.Structural.DecoratorPattern.BasePizzas.*;
import com.designpatterns.Structural.DecoratorPattern.Toppings.*;

public class main {
    public static void main(String[] args) {
        BasePizza margherita = new Margherita();
        BasePizza margherita_tp = new Cheese(margherita);
        margherita_tp = new Olives(margherita_tp);

        BasePizza pepperoni = new Pepperoni();
        BasePizza pepperoni_tp = new Mushrooms(pepperoni);
        pepperoni_tp = new Mushrooms(pepperoni_tp);
        pepperoni_tp = new Cheese(pepperoni_tp);

        BasePizza bbq = new BBQChicken();
        BasePizza bbq_tp = new Cheese(bbq);
        bbq_tp = new Cheese(bbq_tp);
        bbq_tp = new Cheese(bbq_tp);

        System.out.println("First Pizza: ");
        System.out.println("Description: "+margherita_tp.getName());
        System.out.println("Cost: "+margherita_tp.getCost());

        System.out.println("Second Pizza: ");
        System.out.println("Description: "+pepperoni_tp.getName());
        System.out.println("Cost: "+pepperoni_tp.getCost());

        System.out.println("Second Pizza: ");
        System.out.println("Description: "+bbq_tp.getName());
        System.out.println("Cost: "+bbq_tp.getCost());


    }
}