package com.designpatterns.Creational.BuilderPattern.Director;

import com.designpatterns.Creational.BuilderPattern.Builder.StudentBuilder;
import com.designpatterns.Creational.BuilderPattern.Product.Student;

public class StudentDirector {
    StudentBuilder studentBuilder;

    // Constructor to inject the builder
    public StudentDirector(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    // Build an Engineering Student with dynamic fields
    // public Student constructEngineeringStudent(String name, int age, String major, double gpa) {
    //     return studentBuilder
    //         // .setName(name)
    //         // .setAge(age)
    //         // .setMajor(major)
    //         // .setCgpa(gpa)
    //         // .setScholarship(true) // Or set these conditionally
    //         // .setInternship(true)  // Based on the logic
    //         // .setSportsParticipation(false)
    //         .build();
    // }

    // Build an MBA Student with dynamic fields
    // public Student constructMBAStudent(String name, int age, String specialization) {
    //     return studentBuilder
    //         // .setName(name)
    //         // .setAge(age)
    //         // .setSpecialazition(specialization)
    //         // .setScholarship(false) // Or set these conditionally
    //         // .setInternship(true)   // Based on the logic
    //         // .setSportsParticipation(true)
    //         .build();
    // }
    public Student constructEngineeringStudent() {
        return studentBuilder.build();
    }

    public Student constructMBAStudent() {
        return studentBuilder.build();
    }
}
