package com.kodilla.inheritence.homework;

public class Application {
    public static void main(String[] args) {
        OperatingSystem genericSystem = new OperatingSystem(2000);
        genericSystem.turnOn();
        genericSystem.turnOff();

        System.out.println("-----------------------");

        WindowsSystem windows = new WindowsSystem(2021);
        windows.turnOn();
        windows.turnOff();

        System.out.println("-----------------------");

        LinuxSystem linux = new LinuxSystem(2022);
        linux.turnOn();
        linux.turnOff();
    }
}
