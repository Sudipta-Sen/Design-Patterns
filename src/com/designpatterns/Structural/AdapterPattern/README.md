#  Adapter Design Pattern
The Adapter design pattern allows the interface of an existing class to be used as another interface. It acts as a bridge between two incompatible interfaces, making them work together. This pattern involves a single class, known as the adapter, which is responsible for joining functionalities of independent or incompatible interfaces.

## Real World Example

We will take an example of payment systems in an e-commerce platform. The client code (online store) is built to handle a standard payment interface, but different payment gateways (e.g., PayPal, BHIM) have different interfaces. The Adapter helps integrate these diverse gateways into the system.

### Components

1. **Target Interface:** The interface expected by the client (e.g., PaymentProcessor)

2. **Adaptee:** Existing systems with incompatible interfaces (e.g., PayPalPayment, BHIMPayment).

3. **Adapter:** A class that adapts the Adaptee to the Target Interface. It implements the target interface and internally uses an instance of the adaptee to make it compatible with the target interface. We may also use multiple inheritace here but many language does not support multiple inheritance.

4. **Client Code:** The e-commerce platform that interacts with the PaymentProcessor.

## Cloning the Repository
Adapter Design pattern is under Design-Patterns repository. You can clone this repository using either SSH or HTTPS.

### SSH
`git clone git@github.com:Sudipta-Sen/Design-Patterns.git`

### HTTP
`git clone https://github.com/Sudipta-Sen/Design-Patterns.git`

## Compile the code

### Navigate to the designpatterns folder
`cd Design-Patterns/src/com/designpatterns`

### Compile the Code
To compile the Structural/AdapterPattern package, use the following command

`make structural_adapter`

### Run the Code
Execute the compiled code with:

`java -cp bin com.designpatterns.Structural.AdapterPattern.ECommercePlatform `

### Clean Up: 
To clean up the compiled classes and bin directory, use:

`make clean`