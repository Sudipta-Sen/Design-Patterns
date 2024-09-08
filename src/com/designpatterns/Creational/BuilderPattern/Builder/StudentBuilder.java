package com.designpatterns.Creational.BuilderPattern.Builder;

import com.designpatterns.Creational.BuilderPattern.Product.Student;
import java.util.*;

public abstract class StudentBuilder {

    // Mandatory fields
    public String name;
    public int age=0;
    public List<String> subjects = new ArrayList<>(); 

    // Fields specific to EngineeringStudent
    public String major;
    public double cgpa=-1.0;

    // Fields specific to MBAStudent
    public String specialization;

    // Optional fields
    public boolean internship;
    public boolean sportsParticipation;
    public boolean scholarship;

    abstract StudentBuilder setName(String name);
    abstract StudentBuilder setAge(int age);

    abstract StudentBuilder setScholarship(boolean scholarship);
    abstract StudentBuilder setIntership(boolean internship);
    abstract StudentBuilder setSportsParticipation(boolean sportsParticipation);

    abstract public Student build();
}