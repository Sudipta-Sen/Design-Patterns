package com.designpatterns.Creational.BuilderPattern.Builder;

import com.designpatterns.Creational.BuilderPattern.Product.Student;

public abstract class StudentBuilder {

    public String name;
    public int age;

    public String major;
    public double cgpa;

    public boolean internship;
    public boolean sportsParticipation;
    public boolean scholarship;
    public String specialization;


    abstract StudentBuilder setName(String name);
    abstract StudentBuilder setAge(int age);

    abstract StudentBuilder setScholarship(boolean scholarship);
    abstract StudentBuilder setIntership(boolean internship);
    abstract StudentBuilder setSportsParticipation(boolean sportsParticipation);

    abstract public Student build();
}