package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class CalculatorTestSuite {

    @Test
    void shouldPerformOperationsCorrectly() {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                "com.kodilla.spring.basic.spring_dependency_injection.homework"
        );

        Calculator bean = context.getBean(Calculator.class);

        double addResult = bean.add(5, 3);
        Assertions.assertEquals(8, addResult, 0.0001);

        double subResult = bean.subtract(10, 4);
        Assertions.assertEquals(6, subResult, 0.0001);

        double mulResult = bean.multiply(2, 7);
        Assertions.assertEquals(14, mulResult, 0.0001);

        double divResult = bean.divide(20, 5);
        Assertions.assertEquals(4, divResult, 0.0001);
    }
}
