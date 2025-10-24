package com.kodilla.inheritence;

public class Application {
    public static void main(String[] args) {
        Car car = new Car (4, 5);
        car.turnOnLights();   //po kropce użyć ctrl+spacja

        Convertible convertible = new Convertible(4, 2);
        convertible.turnOnLights();
        convertible.displayNumberOfSeats();
    }
}
