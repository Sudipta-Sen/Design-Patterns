package com.designpatterns.Creational.BuilderPattern.Director;

import com.designpatterns.Creational.BuilderPattern.Builder.MBAStudentBuilder;
import com.designpatterns.Creational.BuilderPattern.Product.Student;

public class MBAStudentDirector implements StudentDirector {
    MBAStudentBuilder studentBuilder;

    public MBAStudentDirector(MBAStudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    @Override
    public Student constructStudent() throws IllegalArgumentException {
        if(studentBuilder.name == null) {
            throw new IllegalArgumentException("Student name can't be null");
        }
        if(studentBuilder.age == 0) {
            throw new IllegalArgumentException("Student "  + studentBuilder.name + " must have a age");
        }
        if(studentBuilder.specialization == null) {
            throw new IllegalArgumentException("MBA Student " + studentBuilder.name + " must have some specialization");
        }
        return studentBuilder.build();
    }
}