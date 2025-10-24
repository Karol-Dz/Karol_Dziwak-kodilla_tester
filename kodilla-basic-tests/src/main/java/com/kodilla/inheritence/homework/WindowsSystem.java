package com.kodilla.inheritence.homework;

public class WindowsSystem extends OperatingSystem {

    public WindowsSystem(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Starting Windows system (" + getReleaseYear() + ")...");
    }

    @Override
    public void turnOff() {
        System.out.println("Shutting down Windows...");
    }
}
