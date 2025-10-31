package com.kodilla.abstracts.homework;

public class Teacher extends Job {

    public Teacher(double salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void showResponsibilities() {
        System.out.println("Teacher responsibilities: " + getResponsibilities());
    }
    @Override
    public String toString () {
        return "teacher";
    }
}
