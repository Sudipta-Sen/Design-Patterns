# Builder Design Pattern 

## Real world Example with Student Construction
This project demonstrates the **Builder Design Pattern** for constructing complex **Student** objects, which differ based on student type (e.g., Engineering, MBA). The **Student** class has a mix of mandatory and optional attributes, making the Builder pattern an ideal choice.

### Components of the Implementation:

1. **Product:**
    - **Student:** 
        - Represents the student object that we want to construct with mandatory and optional fields.
        - This is the final product built by the builders.
2. **Builder:**
    - **StudentBuilder:** 
        - Contains methods for setting both mandatory and optional fields. 
        - Different builders extend this abstract builder to handle specific student types, such as **MBAStudentBuilder** and **EngineeringStudentBuilder**.
3. **Concrete Builders:**
    - **MBAStudentBuilder:**
        - Handles the construction of MBA students with mandatory fields like **name**, **age**, **specialization**, and optional fields like **scholarship**, **internship**, and **sportsParticipation**.
    - **EngineeringStudentBuilder**
        - Manages the creation of engineering students with mandatory fields like **name**, **age**, **major**, **cgpa**, and optional fields like **scholarship**, **internship**, and **sportsParticipation**.
4. **Director:**
    - The Director classes like **MBAStudentDirector** and **EngineeringStudentDirector** ensure that students are constructed with all mandatory fields before building the Student object.
    - The Director ensures the integrity of student creation, throwing an exception if mandatory fields are missing.

## Why Use the Builder Pattern Instead of Constructor and Inheritance?
1. **Complex Object Construction:**
    - The **Student** object has numerous fields, some mandatory, some optional. Using a constructor would require a large number of parameters, leading to:
        - Difficulty in determining the order of parameters.
        - Hard-to-read code when calling the constructor.
        - Increased likelihood of mistakes like passing parameters in the wrong order.
    - **Builder Pattern** allows flexible and readable construction by breaking down object creation into steps, which can be chained or used selectively.

2. **Handling Optional Fields:**
    - With the **Builder Pattern**, optional fields can be set conditionally. Constructors, on the other hand, would require numerous overloaded versions or the use of null/default values to represent missing fields, making the design cumbersome.

3. **Customization of Builders:**
    - Different student types (e.g., MBA, Engineering) require different fields (e.g., **specialization** for MBA and **major** for Engineering). Using inheritance to create these variants would lead to class explosion and complex hierarchies.

    - The Builder pattern avoids this by allowing customization for each type of student while keeping common fields in the abstract builder.

4. **Code Maintainability:**
    - Adding new fields becomes easier in the Builder pattern. You simply extend the builder rather than modifying existing constructors or creating new child classes.

### Problems with Using Constructor:
- A constructor with a long list of parameters is difficult to manage.
- Maintaining overloaded constructors for optional parameters increases complexity.
- Developers may accidentally mix up parameters when creating objects.

### Problems with Using Inheritance:
- Inheritance leads to a rigid class hierarchy, especially when optional features or variations are required. For example:
    - Engineering and MBA students share some common fields, but if more variations of students are needed (e.g., Art Student), the class hierarchy becomes difficult to manage.
- Customizing fields specific to one student type(e.g., **specialization** for MBA and **major** for Engineering) would lead to multiple subclasses, creating a class explosion problem.

## Cloning the Repository
Builder pattern is under Design-Patterns repository. You can clone this repository using either SSH or HTTPS.

### SSH
`git clone git@github.com:Sudipta-Sen/Design-Patterns.git`

### HTTP
`git clone https://github.com/Sudipta-Sen/Design-Patterns.git`

## Compile the code

### Navigate to the designpatterns folder
`cd Design-Patterns/src/com/designpatterns`

### Compile
To compile the Creational/BuilderPattern package, use the following command

`make creational_builder`

### Run the Code
Execute the compiled code with:

`java -cp bin com.designpatterns.Creational.BuilderPattern.main`

### Clean Up: 
To clean up the compiled classes and bin directory, use:

`make clean`