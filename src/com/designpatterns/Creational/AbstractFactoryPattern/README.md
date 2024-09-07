# Factory Pattern and Abstract Factory Pattern
Both the Factory and Abstract Factory patterns are part of the **creational design** patterns family, and they help in managing object creation in a flexible and scalable way

## Factory Pattern
The **Factory Pattern** is used to create objects without specifying the exact class of object that will be created. It provides an interface for creating objects in a superclass, but it allows subclasses to alter the type of objects that will be created.

## Abstract Factory Pattern
The **Abstract Factory** Pattern is used when you need a super-factory to create other factories. It provides an interface for creating families of related or dependent objects without specifying their concrete classes.

### Features
    1. Multiple factories for creating related products
    2. Each factory can create a set of related objects.
    3. Adding new product families can be done by introducing new factories using Abstract Factory pattern whereas adding new products requires can be done via Factory pattern.

## Real World Example
This project demonstrates a Car Factory System that uses both the Factory and Abstract Factory design patterns to create different types of cars for different regions, each with specific regional specifications.

### Key Concepts

#### Factory Design Pattern:
- The Factory pattern is used here to create different car types (e.g., Sedan, BMW, Hatchback, Tesla).
- Instead of directly creating car objects, we use the factory to instantiate cars based on the region and type. This encapsulates the car creation logic.

#### Abstract Factory Design Pattern
- The Abstract Factory pattern is used to manage families of related car factories and their regional specifications.
- For instance, we have two concrete factories, *SouthIndianCarFactory* and *NorthIndianCarFactory*, that are responsible for creating cars with region-specific features.

### Structure of the Code

- **CarFactory:** An abstract factory interface that declares methods for creating cars and car specifications.

- **SouthIndianCarFactory and NorthIndianCarFactory:**  Concrete factories that create cars (e.g., Sedan, BMW, Hatchback, Tesla) and regional specifications (e.g., SouthIndianCarSpecification and NorthIndianCarSpecification).

- **Car & CarSpecification:** Abstract product interfaces for cars and their specifications.

- **Concrete Cars (Sedan, BMW, Hatchback, Tesla):** Specific car implementations created by the factories.

- **Concrete Specifications (SouthIndianCarSpecification, NorthIndianCarSpecification):** Region-specific car specifications.

## Cloning the Repository
Abstract factpry pattern is under Design-Patterns repository. You can clone this repository using either SSH or HTTPS.

### SSH
`git clone git@github.com:Sudipta-Sen/Design-Patterns.git`

### HTTP
`git clone https://github.com/Sudipta-Sen/Design-Patterns.git`

## Compile the code

### Navigate to the designpatterns folder
`cd Design-Patterns/src/com/designpatterns`

### Compile
To compile the Creational/AbstractFactoryPattern package, use the following command

`make creational_factory`

### Run the Code
Execute the compiled code with:

`java -cp bin com.designpatterns.Creational.AbstractFactoryPattern.main`

### Clean Up: 
To clean up the compiled classes and bin directory, use:

`make clean`