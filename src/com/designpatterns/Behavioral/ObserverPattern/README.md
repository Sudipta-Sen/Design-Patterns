# Observable Pattern

## Overview
The **Observable pattern** is a behavioral design pattern that establishes a one-to-many relationship between objects, allowing an object (known as the **Observable**) to notify multiple **Observers** of any changes in its state. This pattern is particularly useful when a change in one object requires changes in other objects, but the exact nature of those changes isn't known until runtime.

## Real-Life Example: Amazon "Notify Me" Feature

In Amazon, when a product is out of stock, users have the option to click the "Notify Me" button. Once clicked, the user subscribes to notifications for when the product becomes available again. When the product is back in stock, all subscribed users (Observers) are notified either via email, SMS, or app notifications.

### Key Components

**1. Observable:** In our example, the Observable is the Amazon product.
**2. Observer:** In our example, the Observer is the user who has subscribed to notifications.

### Pattern Explanation

#### Observable (Product):
1. There can be many Observers for a single Observable object.
2. Whenever the state of the Observable object changes (e.g., the product comes back in stock), it notifies all its Observers.

#### Observer (User):
1. Observers are interested in the state change of the Observable object.
2. When notified, each Observer can take the necessary action (e.g., receive an email, SMS, or app notification)
Real life example of observable pattern -- 

In amazon when there is a product which is out of stock and many people wants that as soon as it becomes in stock then they click 'Notify Me' button.
Then when the product becomes availble all the people that subscribe get notified either by email or by sms or by app notification. This 'Notify Me'
is implemented via observable pattern.

### Observable Interface
The Observable interface typically includes the following methods:

1. **add(ObserverInterface observer):** Registers or adds a new Observer.
2. **remove(ObserverInterface observer):** Removes an existing Observer.
3. **notify():** Notifies all registered Observers of a state change. This method maintains a list of all Observers.
4. **setData(Object data):** Any state change in the Observable will be made via this method. This method internally calls notify() to inform Observers of the state change.
5. **getData():** Retrieves the current state data from the Observable.

### Observer Interface
Every Observer object must implement an **update()** method, which will be called by the Observable's **notify()** method. This method allows the Observer to take specific actions when notified of a change.

However, the Observer only knows that something has changed but doesn't know what has changed. To retrieve specific data, the Observer typically holds a reference to the Observable (via constructor injection) and can call the **getData()** method on the Observable.

### Relationship Between Observable and Observer
1) The relationship between Observable and Observer is a "has-a" relationship.
2) Multiple Observers can be associated with a single Observable.

## Cloning the Repository
Observer Design pattern is under Design-Patterns repository. You can clone this repository using either SSH or HTTPS.

### SSH
`git clone git@github.com:Sudipta-Sen/Design-Patterns.git`

### HTTP
`git clone https://github.com/Sudipta-Sen/Design-Patterns.git`

## Compile the code

### Navigate to the designpatterns folder
`cd Design-Patterns/src/com/designpatterns`

### Compile the Code
To compile the Behavioral/ObserverPattern package, use the following command

`make behavioral_observer`

### Run the Code
Execute the compiled code with:

`java -cp bin com.designpatterns.Behavioral.ObserverPattern.main`

### Clean Up: 
To clean up the compiled classes and bin directory, use:

`make clean`