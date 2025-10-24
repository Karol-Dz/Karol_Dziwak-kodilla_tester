package com.kodilla.inheritence.homework;

public class LinuxSystem extends OperatingSystem {

    public LinuxSystem(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        System.out.println("Starting Linux system (" + getReleaseYear() + ")...");
    }

    @Override
    public void turnOff() {
        System.out.println("Shutting down Linux...");
    }
}
