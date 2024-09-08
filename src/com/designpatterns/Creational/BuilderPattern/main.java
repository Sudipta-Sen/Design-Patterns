package com.designpatterns.Creational.BuilderPattern;

import com.designpatterns.Creational.BuilderPattern.Builder.*;
import com.designpatterns.Creational.BuilderPattern.Director.*;
import com.designpatterns.Creational.BuilderPattern.Product.Student;

public class main {
    public static void main(String[] args) {
        //Object Creation using Director
        StudentBuilder engStudent = new EngineeringStudentBuilder()
            .setName("Sudipta")
            .setAge(28)
            .setMajor("Computer Science")
            .setCgpa(4.8)
            .setIntership(false);

        StudentDirector engineeringDirector = new StudentDirector(engStudent);
        Student student1 = engineeringDirector.constructEngineeringStudent();
        System.out.println(student1.toString());
    }
}
