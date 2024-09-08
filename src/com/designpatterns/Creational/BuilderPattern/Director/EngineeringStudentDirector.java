package com.designpatterns.Creational.BuilderPattern.Director;

import com.designpatterns.Creational.BuilderPattern.Builder.EngineeringStudentBuilder;
import com.designpatterns.Creational.BuilderPattern.Product.Student;

public class EngineeringStudentDirector implements StudentDirector {
    EngineeringStudentBuilder studentBuilder;

    public EngineeringStudentDirector(EngineeringStudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    @Override
    public Student constructStudent() throws IllegalArgumentException {
        if(studentBuilder.name == null) {
            throw new IllegalArgumentException("Student must have a name");
        }
        if(studentBuilder.age == 0) {
            throw new IllegalArgumentException("Student "  + studentBuilder.name + " must have a age");
        }
        if(studentBuilder.major == null) {
            throw new IllegalArgumentException("Engineering Student " + studentBuilder.name + " must have major");
        }
        if(studentBuilder.cgpa == -1.0) {
            throw new IllegalArgumentException("Engineering Student " + studentBuilder.name + " must have cgpa");
        }
        return studentBuilder.build();
    }
}