package com.designpatterns.Creational.BuilderPattern;

import com.designpatterns.Creational.BuilderPattern.Builder.*;
import com.designpatterns.Creational.BuilderPattern.Director.*;
import com.designpatterns.Creational.BuilderPattern.Product.Student;

public class main {
    private static void createStudent(StudentDirector studentDirector) {
        try{
            Student student = studentDirector.constructStudent();
            System.out.println("\n"+student.toString());
        } catch (IllegalArgumentException e) {
            System.out.println("\n" + e.getMessage());
        }
    }
    public static void main(String[] args) {
        //Object Creation using Director
        EngineeringStudentBuilder engStudent1 = new EngineeringStudentBuilder()
            .setName("Sudipta")
            .setAge(28)
            .setMajor("Computer Science")
            .setCgpa(4.8)
            .setIntership(false);

        EngineeringStudentBuilder engStudent2 = new EngineeringStudentBuilder()
            .setName("Amit")
            .setAge(25)
            .setCgpa(7.9)
            .setIntership(true);

        EngineeringStudentBuilder engStudent3 = new EngineeringStudentBuilder()
            .setName("Gourab")
            .setAge(25)
            .setMajor("Civil Enginnering")
            .setCgpa(7.9)
            .setIntership(true)
            .setSportsParticipation(true);

        StudentDirector dir1 = new EngineeringStudentDirector(engStudent1);
        StudentDirector dir2 = new EngineeringStudentDirector(engStudent2);
        StudentDirector dir3 = new EngineeringStudentDirector(engStudent3);
        createStudent(dir1);
        createStudent(dir2);
        createStudent(dir3);
        
        MBAStudentBuilder mbaStudent1 = new MBAStudentBuilder()
            .setName("Amaresh")
            .setAge(32)
            .setSpecialazition("Marketing")
            .setScholarship(true);
        StudentDirector dir4 = new MBAStudentDirector(mbaStudent1);
        MBAStudentBuilder mbaStudent2 = new MBAStudentBuilder()
            .setName("Ishan")
            .setAge(30)
            .setScholarship(true);
        StudentDirector dir5 = new MBAStudentDirector(mbaStudent2);

        createStudent(dir4);
        createStudent(dir5);
    }
}
