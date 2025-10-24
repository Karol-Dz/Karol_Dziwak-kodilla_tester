package com.kodilla.abstracts.homework;

public class Developer extends Job {

    public Developer(double salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public void showResponsibilities() {
        System.out.println("Developer responsibilities: " + getResponsibilities());
    }
}
