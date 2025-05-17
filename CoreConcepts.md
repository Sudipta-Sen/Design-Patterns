# Design Pattern Core Concepts

## Table of Contents
1. [SOLID Design Principles](#solid-design-principles-in-java)

## SOLID Design Principles

1. **S – Single Responsibility Principle (SRP)**

    **Definition:** A class should have only one reason to change, i.e., only one responsibility.
    ```java
    class InvoicePrinter {
        void print(Invoice invoice) { ... }
    }

    class InvoiceSaver {
        void saveToDatabase(Invoice invoice) { ... }
    }
    ```
    - Each class should do one thing and do it well.
2. **O – Open/Closed Principle (OCP)**

    **Definition:** Software entities (classes, modules, functions) should be open for extension but closed for modification.
    ```java
    interface Shape {
        double area();
    }

    class Circle implements Shape {
        double radius;
        public double area() { return Math.PI * radius * radius; }
    }

    class Rectangle implements Shape {
        double length, width;
        public double area() { return length * width; }
    }
    ```
    - We should be able to extend a class's behavior without modifying it.
    - A new shape can be added without changing the **existing classes**.

3. **L – Liskov Substitution Principle (LSP)**

    **Definition:** Subtypes must be substitutable for their base types without altering the correctness of the program. Subclass should extend the properties of parent class, not narrow it down.
    
    - Violation of LSP (Wrong Design)
        ```java
        class Bird {
            void fly() {
                System.out.println("Bird is flying");
            }
        }

        class Ostrich extends Bird {
            @Override
            void fly() {
                throw new UnsupportedOperationException("Ostrich can't fly"); ❌ Violation of LSP
            }
        }
        ```
        **Problem?**
        
        - If `Ostrich` is a `Bird`, we should be able to use it **anywhere** a `Bird` is expected. But calling `fly()` on an `Ostrich` throws an exception, breaking the behavior expected from the `Bird` class.
        
        - This violates LSP: **Subclasses should behave like their parent classes without breaking the program.**
    
    - **Corrected Version**
        ```java
        interface Bird {
            void makeSound();
        }

        interface FlyingBird extends Bird {
            void fly();
        }

        class Sparrow implements FlyingBird {
            public void makeSound() {
                System.out.println("Chirp chirp");
            }

            public void fly() {
                System.out.println("Sparrow is flying");
            }
        }

        class Ostrich implements Bird {
            public void makeSound() {
                System.out.println("Boom boom");
            }
        }
        ```
        - **Explanation:**

            - We split the `Bird` abstraction into two interfaces:

                - `Bird` → for general bird behavior
                - `FlyingBird` → for birds that can fly

            - Now `Ostrich` doesn't need to implement `fly()`, because it's not a `FlyingBird`.
            - This follows **LSP** — anywhere a `Bird` is expected, `Ostrich` can be used **without failure**

4. **I – Interface Segregation Principle (ISP)**

    **Definition:** No client should be forced to implement methods or depend on methods that it does not use.
    
    - Violation of ISP (Wrong Design)
        ```java
        interface Worker {
            void work();
            void eat();
        }

        class HumanWorker implements Worker {
            public void work() {
                System.out.println("Human working");
            }
            public void eat() {
                System.out.println("Human eating");
            }
        }

        class RobotWorker implements Worker {
            public void work() {
                System.out.println("Robot working");
            }
            public void eat() {
                // NOT APPLICABLE for Robot!
                throw new UnsupportedOperationException("Robot doesn't eat");
            }
        }
        ```
        **Problem:**
        - `RobotWorker` is **forced to implement** the `eat()` method even though it doesn't eat.
        - This breaks **ISP**, which says:
        `"Clients should not be forced to depend on methods they do not use."`
    
    - Correct Design (Follows ISP)
        ```java
        interface Workable {
            void work();
        }

        interface Eatable {
            void eat();
        }

        class HumanWorker implements Workable, Eatable {
            public void work() {
                System.out.println("Human working");
            }

            public void eat() {
                System.out.println("Human eating");
            }
        }

        class RobotWorker implements Workable {
            public void work() {
                System.out.println("Robot working");
            }
        }
        ```
        - `RobotWorker` **only implements what it needs:** `Workable`
        - `HumanWorker` can implement both.

5. **D – Dependency Inversion Principle (DIP)**

    **Definition:** High-level modules should not depend on low-level modules; both should depend on abstractions i.e. class should depend on interface rather than another class. 
    - Violation of DIP (Bad Design)
        ```java
        class LightBulb {
            public void turnOn() {
                System.out.println("LightBulb turned on");
            }

            public void turnOff() {
                System.out.println("LightBulb turned off");
            }
        }

        class Switch {
            private LightBulb bulb;

            public Switch(LightBulb bulb) {
                this.bulb = bulb;
            }

            public void operate(boolean on) {
                if (on) bulb.turnOn();
                else bulb.turnOff();
            }
        }
        ```
        - What’s wrong?
            - The `Switch` (high-level class) **directly depends** on the concrete `LightBulb` class (low-level class).
            - This tightly couples the `Switch` to the `LightBulb`. You cannot easily replace `LightBulb` with another implementation (e.g., `Fan`, `LED`, etc.).
    - Correct Design (Follows DIP)
        ```java
        // Abstraction
        interface Switchable {
            void turnOn();
            void turnOff();
        }

        // Low-level module
        class LightBulb implements Switchable {
            public void turnOn() {
                System.out.println("LightBulb turned on");
            }

            public void turnOff() {
                System.out.println("LightBulb turned off");
            }
        }

        // High-level module
        class Switch {
            private Switchable device;

            public Switch(Switchable device) {
                this.device = device;
            }

            public void operate(boolean on) {
                if (on) device.turnOn();
                else device.turnOff();
            }
        }
        ```
        - Why this is better?
            - Now `Switch` depends on the `Switchable` interface (abstraction), not a specific class.
            - This makes the system more **flexible** and **extensible**:
                - You can plug in any device that implements `Switchable` — `Fan`, `Heater`, `AC`, etc.