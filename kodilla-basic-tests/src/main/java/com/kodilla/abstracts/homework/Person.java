package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void showJobResponsibilities() {
        System.out.println(firstName + " (" + age + " age) work as: " + job);
        job.showResponsibilities();
        System.out.println("Salary: " + job.getSalary() + " PLN");
    }
}
