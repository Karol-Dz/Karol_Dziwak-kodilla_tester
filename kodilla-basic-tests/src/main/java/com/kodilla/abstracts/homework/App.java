package com.kodilla.abstracts.homework;

public class App {
    public static void main(String[] args) {

        Job developer = new Developer(12000, "Writing code, testing applications, troubleshooting errors.");
        Job teacher = new Teacher(5500, "Teaching students, preparing materials, checking work.");
        Job doctor = new Doctor(15000, "Diagnosing patients, prescribing medication, performing procedures.");

        Person adam = new Person("Adam", 28, developer);
        Person anna = new Person("Anna", 35, teacher);
        Person jan = new Person("Jan", 45, doctor);

        adam.showJobResponsibilities();
        System.out.println("--------------------------");
        anna.showJobResponsibilities();
        System.out.println("--------------------------");
        jan.showJobResponsibilities();
    }
}
