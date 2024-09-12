# Facade Design Pattern
The Facade Design Pattern simplifies interactions with complex systems by providing a unified and easier-to-use interface. Instead of dealing with multiple, often complicated subsystems, a client can interact with just one class (the facade), which internally manages those subsystems.

#### Key Points:
- Facade hides the complexities of the system.
- It simplifies the interface, making it easier for the client to interact with multiple subsystems.
- The subsystems can still be accessed directly, but the facade provides a convenient shortcut for common operations.

## Real-World Example: Banking System

### Scenario:
- The bank has various services such as Account Management, Loan Processing, and Credit Score Checking.

- A customer wants to apply for a loan, and the bank system needs to check the customer's account balance, check the credit score and at last process the loan if every criteria passes

We will use the Facade Pattern to create a BankingFacade class that simplifies interaction with these subsystems.

### Components of the Code:
#### Subsystems
1. **AccountManagementSubsystem**: Handles customer accounts.
2. **LoanProcessingSubsystem**: Manages loan applications.
3. **CreditScoreSubsystem**: Manages credit score checking.

#### Facade Class:
- **BankingFacade:** Simplifies the process of applying for a loan by interacting with the different subsystems internally.

#### Client:
**client:** Calls the facade method applyForLoan without needing to worry about the underlying subsystems.

## Cloning the Repository
Facade Design pattern is under Design-Patterns repository. You can clone this repository using either SSH or HTTPS.

### SSH
`git clone git@github.com:Sudipta-Sen/Design-Patterns.git`

### HTTP
`git clone https://github.com/Sudipta-Sen/Design-Patterns.git`

## Compile the code

### Navigate to the designpatterns folder
`cd Design-Patterns/src/com/designpatterns`

### Compile the Code
To compile the Structural/FacadePattern package, use the following command

`make structural_facade`

### Run the Code
Execute the compiled code with:

`java -cp bin com.designpatterns.Structural.FacadePattern.client`

### Clean Up: 
To clean up the compiled classes and bin directory, use:

`make clean`