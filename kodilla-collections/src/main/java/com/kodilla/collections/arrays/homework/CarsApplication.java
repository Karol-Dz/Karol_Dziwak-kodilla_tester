package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {
    private static final Random random = new Random();

    public static void main(String[] args) {

        int carsCount = random.nextInt(15) + 1;

        Car[] cars = new Car[carsCount];
        for (int n = 0; n < carsCount; n++) {
            cars[n] = drawCar();
        }

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }

    private static Car drawCar() {

        int drawnType = random.nextInt(3);

        int randomSpeedIncrease = random.nextInt(100);

        Car car;

        switch (drawnType) {
            case 0:
                car = new Ford();
                break;
            case 1:
                car = new Toyota();
                break;
            default:
                car = new Opel();
                break;
        }
        for (int i = 0; i < randomSpeedIncrease / 10; i++) {
            car.increaseSpeed();
        }
        return car;
    }
}