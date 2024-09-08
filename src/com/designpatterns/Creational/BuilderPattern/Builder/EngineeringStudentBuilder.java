package com.designpatterns.Creational.BuilderPattern.Builder;

import com.designpatterns.Creational.BuilderPattern.Product.Student;

public class EngineeringStudentBuilder extends StudentBuilder {
    
    @Override
    public EngineeringStudentBuilder setName(String name) {
        this.name = name;
        return this;
    }
    @Override
    public EngineeringStudentBuilder setAge(int age) {
        this.age = age;
        return this;

    }

    @Override
    public EngineeringStudentBuilder setScholarship(boolean scholarship) {
        this.scholarship = scholarship;
        return this;

    }
    @Override
    public EngineeringStudentBuilder setIntership(boolean internship) {
        this.internship = internship;
        return this;

    }
    @Override
    public EngineeringStudentBuilder setSportsParticipation(boolean sportsParticipation) {
        this.sportsParticipation = sportsParticipation;
        return this;

    }

    @Override
    public Student build() {
        //Add engnieering subjects
        subjects.add("Mathematics");
        subjects.add("DSA");
        subjects.add("Computer Architecture");
        
        return new Student(this);
    }

    public EngineeringStudentBuilder setMajor(String major) {
        this.major = major;
        return this;
    }

    public EngineeringStudentBuilder setCgpa(double cgpa) {
        this.cgpa = cgpa;
        return this;
    }
}