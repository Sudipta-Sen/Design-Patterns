# Strategy Design Patterns

## Overview
This repository contains Java implementations of various design patterns. The primary focus is on demonstrating the Strategy Pattern, which is used to separate the dependency of the drive mechanism from the main class. This approach adheres to the Open-Closed Principle, allowing for dynamic injection of drive strategies based on client requirements.

## Strategy Pattern
In the Strategy Pattern example:

### Drive Strategy: 
The drive mechanism is encapsulated in different strategy classes implementing the DriveStrategy interface. This allows for easy extension of new drive methods without altering existing code.

### Vehicle:
The vehicle class can use any existing driving strategy or introduce a new one by extending the DriveStrategy interface. This modularity supports easy modifications and additions of new driving strategies. Changing drive strategy of a existing vehicle also includes chnages in that particular vehical child class.

## Cloning the Repository
Strategy Design pattern is under Design-Patterns repository. You can clone this repository using either SSH or HTTPS.

### SSH
`git clone git@github.com:Sudipta-Sen/Design-Patterns.git`

### HTTP
`git clone https://github.com/Sudipta-Sen/Design-Patterns.git`

## Compile the code

### Navigate to the ParkingLotDesign folder
`cd Design-Patterns/src/com/designpatterns`

### Compile the Code
To compile the Behavioral/strategy package, use the following command

`make behavioral_strategy`

### Run the Code
Execute the compiled code with:

`java -cp bin com.designpatterns.Behavioral.strategy.main`

### Clean Up: 
To clean up the compiled classes and bin directory, use:

`make clean`