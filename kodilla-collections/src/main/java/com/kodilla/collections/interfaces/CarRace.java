package com.kodilla.collections.interfaces;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford();
        Opel opel = new Opel();
        Toyota toyota = new Toyota();

        doRace(ford);
        doRace(opel);
        doRace(toyota);
    }

    public static void doRace(Car car) {
        System.out.println("\nCar Race: " + car);

        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();

        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println("Finish speed: " + car.getSpeed() + " km/h");
    }
}
