# Design Pattern Core Concepts

## Table of Contents
1. [SOLID Design Principles](#solid-design-principles-in-java)
2. [Username Lookup: Data Structure Comparison](#username-lookup-data-structure-comparison)
    > a. [How big tech combines data structures for efficient username lookup](#how-big-tech-combines-data-structures-for-efficient-username-lookup)
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

## Username Lookup: Data Structure Comparison

| Data Structure    | How It Works for Username Lookup   | Pros   | Cons   | Typical Use Case Fit     |
| ----------------- | ----------------------------- | -------------- | ----- | ---------------------- |
| **Redis HashMap** | Stores usernames as keys, with associated values (e.g., user ID, profile info). Lookup is **O(1)** average time complexity.                                                               | - Very fast for exact matches.<br>- Simple to implement.<br>- Built into Redis for in-memory speed.<br>- Can store metadata along with username.                 | - Requires full username for lookup (no prefix search).<br>- Memory usage proportional to number of entries.<br>- Slower if dataset exceeds RAM and swaps to disk. <br>- No prefix search, autocompletion, range queries. | Best for **exact username matches** when you have plenty of RAM and want fast retrieval. |
| **Trie**          | Each character is a node, and paths from root form usernames. Lookup complexity is **O(L)** where *L* = length of username.    | - Supports **prefix searches** (e.g., auto-complete, “users starting with A”).<br>- No hashing needed.<br>- Efficient when many usernames share common prefixes. | - Can be memory-heavy for sparse datasets(datasets with less share common prefixes) .<br>- Slower than hash for exact matches.<br>- Requires careful implementation to handle Unicode/variable length.      | Best when you need **autocomplete or prefix-based** username search.                     |
| **B+ Tree**       | Balanced tree structure with sorted keys (usernames). Lookup is **O(log N)**, supports range queries.                                                                                     | - Good for **range lookups** and ordered results.<br>- Disk-friendly (nodes align with block size).<br>- Used in databases and indexes.                          | - Slower than hash for exact matches.<br>- More complex to maintain than a HashMap.<br>- Needs rebalancing on inserts/deletes.                                     | Best when you want **sorted usernames** and efficient range queries.                     |
| **Bloom Filter**  | Probabilistic bit array with multiple hash functions. Can tell if username **possibly exists** or **definitely does not exist**. Lookup is **O(K)** where *K* = number of hash functions. | - Very memory-efficient.<br>- Extremely fast lookups.<br>- Good as a **pre-check** before expensive DB lookup.                                                   | - False positives possible (can say a username exists when it doesn’t).<br>- No storage of actual values.<br>- No removal unless using a counting bloom filter.    | Best as a **first filter** for existence checks to avoid hitting slower storage.         |

let’s make this username lookup comparison table more concrete with both time complexity and a space estimate for 1 million usernames, each 10 characters long.

| Data Structure  | Search Time Complexity | Space Usage for 1M usernames (10 chars) | Notes on Space Calculation   |
| ----------------- | ---------- | -------------------- | --------------------------------- |
| **Redis HashMap** | **O(1)** average, **O(N)** worst-case (hash collisions) | **\~30–40 MB**      | 10 MB for raw strings (10 chars × 1M) + \~20–30 MB for Redis object + hash overhead.      |
| **Trie**     | **O(L)** where L=10 (≈ O(10))     | **\~40–60 MB**                            | Each char is a node (\~16–24 bytes). Shared prefixes save memory, but sparse tries still have high overhead per pointer. |
| **B+ Tree**       | **O(log N)** ≈ O(log₂ 1M) = \~20 steps    | **\~35–45 MB**      | 10 MB for raw strings + \~25–35 MB for tree nodes, pointers, and balancing.      |
| **Bloom Filter**  | **O(K)** where K = # of hash functions (e.g., 4–8)      | **\~1.2 MB** (for 1% false positive rate) | Stores only a bit array, no actual usernames. Cannot retrieve usernames, only checks existence.  |

### How Big Tech Combines Data Structures for Efficient Username Lookup

Tech giants like Google, Meta, and Amazon must check billions of usernames within milliseconds every day. To accomplish this at scale, they don’t rely on a single data structure or system. Instead, they layer and combine multiple tools—each optimized for specific strengths—to achieve blazing speed, scalability, and reliability at a global level.

#### The Multi-Layered Approach

In this scenario, a new user attempts to create an account with a preferred username that must be unique. When the user enters the username, the system checks its availability—if it already exists, the user is prompted to try a different one; if it does not exist, the system confirms it can be used.

![](Pictures/username_lookup-1.png)

1. Load Balancing – Global & Local Routing

    - **Global Load Balancers** (like AWS Route 53) route user requests to the nearest data center using DNS or anycast techniques.

    - **Local Load Balancers** (like NGINX, AWS ELB) then distribute traffic among backend servers within each data center for high concurrency and efficient resource utilization

2. Bloom Filters: The First Line of Defense
    - Backend server keeps an in-memory Bloom filter—a very fast, tiny structure that tells if a username is definitely not taken, or maybe taken (with a small false positive rate).
    - If the Bloom filter rejects the username (i.e. username not present in DB). the user gets an instant `“available”` reply. If not, the request moves on.
    - **Benefit:** Blocks unnecessary database/cache queries for “definitely not present” cases at low memory cost. For example, storing 1B usernames with 1% false positives uses about 1.2GB RAM
3. Redis Hashmap (or In-Memory Cache) – Fast Exact Lookup
    - The next layer is a fast cache (usually a **Redis hashmap** or similar), which holds recent lookups and hot usernames for exact match searches.
    - If the username is found here (cache hit), the user gets an instant answer — `username already taken`. In case of **cache miss** the request moves on.
4. Trie (Prefix Tree): Autocomplete and Suggestions
    - For features like **autocomplete** (“suggested usernames”) or prefix search (usernames starting with “alex…”), a **Trie** structure (or compressed variant) is consulted.
    - Tries enable real-time suggestions and quick discovery of alternative names by sharing common prefixes, saving space when there are many similar usernames.
5. Database with B+ Tree Index: The Authoritative Username Store
    - The system queries the global, distributed user database (e.g., Cassandra, Google Spanner) for a **final, authoritative answer.**
    - Usernames are indexed using B+ Trees (or similar), enabling fast exact and ordered lookups at massive scale.

#### Real-World Layering Example
1. A user submits a new username.
2. Global load balancer directs to the nearest data center.
3. Backend process checks the Bloom filter (in-memory, updated regularly).
    - If *definitely not* present: reply "available."
    - If *maybe present:* go to the next step.
4. **Redis cache** (hashmap): checks for an exact match among recent or popular names.
    - If found: reply "taken."
    - If not: proceed.
5. **Trie:** used for autocomplete or to suggest similar usernames if the original is taken.
6. **Database with B+ Tree index:** final lookup for authoritative existence.
7. **Response is returned** via load balancers.