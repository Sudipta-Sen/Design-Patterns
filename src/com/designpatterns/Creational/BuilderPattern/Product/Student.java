package com.designpatterns.Creational.BuilderPattern.Product;

import com.designpatterns.Creational.BuilderPattern.Builder.StudentBuilder;

public class Student {
    //Mandatory Fields
    private String name;
    private int age;

    //Fields Specific to Engineering Students
    private String major;
    private double cgpa;

    //Fields Specific to MBA Student
    private String specialization;

    //Optional fields
    private boolean scholarship;
    private boolean internship;
    private boolean sportsParticipation;

    public Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.name;
        this.age = studentBuilder.age;
        this.major = studentBuilder.major;
        this.cgpa = studentBuilder.cgpa;
        this.specialization = studentBuilder.specialization;
        this.scholarship = studentBuilder.scholarship;
        this.internship = studentBuilder.internship;
        this.sportsParticipation = studentBuilder.sportsParticipation;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age +
               ", major='" + major + "', CGPA=" + cgpa + 
               ", specialization='" + specialization + "'" +
               ", scholarship=" + scholarship +
               ", internship=" + internship +
               ", sportsParticipation=" + sportsParticipation + "}";
    }
}