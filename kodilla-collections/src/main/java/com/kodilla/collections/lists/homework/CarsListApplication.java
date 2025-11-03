package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.arrays.homework.CarUtils;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {


        List<Car> cars = new ArrayList<>();

        cars.add(new Ford());
        cars.add(new Opel());
        cars.add(new Toyota());


        System.out.println("=== Car list ===");
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }


        cars.remove(2);


        Car fordToRemove = new Ford();
        cars.remove(fordToRemove);

        System.out.println("\n=== List after deletions ===");
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        System.out.println("\nCurrent collection size: " + cars.size());
    }
}