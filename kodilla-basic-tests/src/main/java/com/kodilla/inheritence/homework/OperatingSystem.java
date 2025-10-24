package com.kodilla.inheritence.homework;

public class OperatingSystem {
    private int releaseYear;

    public OperatingSystem(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void turnOn() {
        System.out.println("The operating system starts up...");
    }

    public void turnOff() {
        System.out.println("The operating system shuts down...");
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}
