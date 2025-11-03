package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car kind: " + car.getClass().getSimpleName());
        System.out.println("Speed: " + car.getSpeed() + " km/h");
    }
}