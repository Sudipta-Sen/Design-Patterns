package com.designpatterns.Creational.BuilderPattern.Builder;

import com.designpatterns.Creational.BuilderPattern.Product.Student;

public class MBAStudentBuilder extends StudentBuilder {

    @Override
    public MBAStudentBuilder setName(String name) {
        this.name = name;
        return this;
    }
    @Override
    public MBAStudentBuilder setAge(int age) {
        this.age = age;
        return this;

    }

    @Override
    public MBAStudentBuilder setScholarship(boolean scholarship) {
        this.scholarship = scholarship;
        return this;

    }
    @Override
    public MBAStudentBuilder setIntership(boolean internship) {
        this.internship = internship;
        return this;

    }
    @Override
    public MBAStudentBuilder setSportsParticipation(boolean sportsParticipation) {
        this.sportsParticipation = sportsParticipation;
        return this;

    }

    @Override
    public Student build() {
        return new Student(this);
    }

    public MBAStudentBuilder setSpecialazition(String specialization) {
        this.specialization = specialization;
        return this;
    }
}