# Proxy Design Pattern
The Proxy Design Pattern is a structural design pattern that provides a placeholder for another object to control access to it. It is often used in situations where it is necessary to limit or regulate access to the actual object

## Key points
- **Key Points:**
    - The proxy pattern allows for managing access to an object by wrapping it with another object. This can be useful for various purposes like lazy initialization, controlling access, logging, adding extra functionality or performing some task before and after calling the original method.
- **Components:**
    - **Subject Interface:** Defines the common interface for both the Real object and the Proxy.
    - **Real Subject:** The actual object that the proxy controls access to.
    - **Proxy:** The object that holds a reference to the Real Subject and controls access to it. It keeps a **Is-a** relationship with Real Subject.
- **Types of Proxy:**
    - **Virtual Proxy:** Used to instantiate expensive objects on demand, typically using lazy loading.
    - **Protection Proxy:** Controls access to the real object based on access rights or permissions.
    - **Remote Proxy:** Provides a local representation of an object located remotely (e.g., a service on a different server).
    - **Caching Proxy:** Adds caching capabilities to store the results of expensive operations and reuse them.
## Difference between proxy and facade design patten

| **Aspect**           | **Proxy Pattern**                                                                                        | **Facade Pattern**                                                                                         |
|----------------------|----------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------|
| **Purpose**          | Controls access to an object, adding a layer of security, caching, or laziness.                           | Simplifies interaction by providing a unified interface to complex subsystems.                               |
| **Focus**            |  Controlling access to a single object or resource.                                        | Providing a unified and easy-to-use interface                                      |
| **Structure**        | The proxy acts as a placeholder or intermediary for a specific object.                                    | The facade provides a simple interface to multiple subsystems.                                               |
| **Use Case**         | When you need to manage access, add functionality like caching, or perform additional actions before accessing an object. | When you need to hide the complexity of a system and provide a cleaner API for clients.                      |
| **Transparency**     | The client thinks it’s working directly with the real object (though it's working with the proxy).        | The client knows it's interacting with the facade to access complex systems.                                 |
| **Example**          | Virtual proxy for large images (load images lazily).                                                      | Simplified interface to a banking system with multiple subsystems (e.g., loan, account management).           |
| **Object Interaction**| Acts as a substitute or stand-in for another object.                                                     | Acts as a wrapper for complex subsystems.                                                                    |

## Cloning the Repository
Proxy Design pattern is under Design-Patterns repository. You can clone this repository using either SSH or HTTPS.

### SSH
`git clone git@github.com:Sudipta-Sen/Design-Patterns.git`

### HTTP
`git clone https://github.com/Sudipta-Sen/Design-Patterns.git`

## Compile the code

### Navigate to the designpatterns folder
`cd Design-Patterns/src/com/designpatterns`

### Compile the Code
To compile the Structural/ProxyPattern package, use the following command

`make structural_proxy`

### Run the Code
Execute the compiled code with:

`java -cp bin com.designpatterns.Structural.ProxyPattern.client`

### Clean Up: 
To clean up the compiled classes and bin directory, use:

`make clean`