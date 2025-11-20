package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

public class CarFactoryTestSuite {

    @Test
    void shouldReturnCabrioInSummer() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(CarFactory.class);

        Car car = context.getBean(Car.class);

        String type = car.getCarType();

        assertTrue(
                type.equals("Cabrio") ||
                        type.equals("SUV") ||
                        type.equals("Sedan")
        );
    }

    @Test
    void headlightsShouldBeOnAtNight() {
        Car car = new Sedan() {
            @Override
            public boolean hasHeadlightsTurnedOn() {
                LocalTime now = LocalTime.of(21, 0);
                return now.isAfter(LocalTime.of(19,59)) || now.isBefore(LocalTime.of(6,0));
            }
        };

        assertTrue(car.hasHeadlightsTurnedOn());
    }

    @Test
    void headlightsShouldBeOffDuringDay() {
        Car car = new Sedan() {
            @Override
            public boolean hasHeadlightsTurnedOn() {
                LocalTime now = LocalTime.of(12, 0);
                return now.isAfter(LocalTime.of(19,59)) || now.isBefore(LocalTime.of(6,0));
            }
        };

        assertFalse(car.hasHeadlightsTurnedOn());
    }
}