# Decorator Design Pattern

The Decorator Pattern is a structural design pattern that allows behavior to be added to an individual object, dynamically, without affecting the behavior of other objects from the same class. It involves a set of decorator classes that are used to wrap concrete components.

In simple terms, the Decorator Pattern is used to add functionality to an object at runtime without changing the class of that object. This is accomplished by creating a set of decorator classes that are used to wrap concrete components.

## Real-Time Use Case: Pizza Ordering System

Let’s consider a pizza ordering system as an example to explain the Decorator Pattern.

### Problem Statement

Imagine building a system where customers can order pizzas. Each pizza can have a variety of toppings, and owner want to allow customers to add as many toppings as they want. The price of the pizza will increase based on the toppings added.

However, the challenge is that the designer don't want to create a new subclass for every possible combination of pizza and toppings, as that would lead to a massive explosion in the number of classes. Instead, try to find a more flexible design where toppings can be added dynamically.

### Solution

The Decorator Pattern provides solution to this problem. Instead of creating multiple subclasses for each combination, designer can create a basic Pizza interface and concrete classes that represent the base pizza. Then, create decorator classes for each topping that can be added to a pizza.

## Class Explosion and the Decorator Pattern

When we need to create different variations of an object, and each variation requires different combinations of features. Without the Decorator Pattern, we need to create a new subclass for every combination of features. As the number of features increases, the number of subclasses grows exponentially, leading to what is known as class explosion.

### Example: Pizza Ordering System Without Decorator Pattern
Let’s use a pizza example to illustrate the class explosion problem:

Suppose you have a pizza system with:

- 3 types of pizzas: Margherita, Pepperoni, and BBQChicken
- 3 types of toppings: Cheese, Olives, and Mushrooms

If you need to create a separate class for every combination of pizza and toppings, you would end up with total 9 combinations. 

We will see in code how decorator pattern solves this problem

## Has-a and Is-a Relationship

###  Is-a Relationship (Inheritance)

Here decorators extend the functionality of a base class. This creates an *is-a* relationship because the decorator class inherits from the base class. The decorator *is-a* type of the base class, meaning it can be treated like the object it's decorating.

The decorator *is-a* type of the base class because it inherits from it.

#### Example:
If we have a *Pizza* class, a *CheeseDecorator* would inherit from the *Pizza* class. This allows the *CheeseDecorator* to be used anywhere a *Pizza* is expected, establishing an *is-a* relationship

### Has-a Relationship (Composition)

The has-a relationship comes from the decorator class wrapping the original object. The decorator contains an instance of the base class and *delegates* some or all of its functionality to it. This establishes a *has-a* relationship because the decorator holds a reference to the object it is enhancing.

The decorator *has-a* base class because it holds a reference to the object it's enhancing.

#### Example:
The *CheeseDecorator* would have a reference to a *Pizza* object, indicating it *has-a Pizza*. It delegates core *Pizza* functionality to the object it contains and then adds extra features, such as additional toppings or behaviors.

## Cloning the Repository
Decorator Design pattern is under Design-Patterns repository. You can clone this repository using either SSH or HTTPS.

### SSH
`git clone git@github.com:Sudipta-Sen/Design-Patterns.git`

### HTTP
`git clone https://github.com/Sudipta-Sen/Design-Patterns.git`

## Compile the code

### Navigate to the designpatterns folder
`cd Design-Patterns/src/com/designpatterns`

### Compile the Code
To compile the Behavioral/strategy package, use the following command

`make structural_decorator`

### Run the Code
Execute the compiled code with:

`java -cp bin com.designpatterns.Structural.DecoratorPattern.main`

### Clean Up: 
To clean up the compiled classes and bin directory, use:

`make clean`
