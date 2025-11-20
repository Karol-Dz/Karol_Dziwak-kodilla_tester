package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTestSuite {

    @Autowired
    private ShippingCenter shippingCenter;

    @Test
    void shouldReturnSuccessWhenWeightIsUnderLimit() {
        String result = shippingCenter.sendPackage("Warsaw", 25);
        assertEquals("Package delivered to: Warsaw", result);
    }

    @Test
    void shouldReturnFailWhenWeightIsOverLimit() {
        String result = shippingCenter.sendPackage("Krakow", 50);
        assertEquals("Package not delivered to: Krakow", result);
    }
}