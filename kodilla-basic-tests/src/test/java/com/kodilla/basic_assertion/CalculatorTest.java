package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldCalcSumOfPositiveNumbers() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 20;
        int result = calculator.sum(a, b);
        assertEquals(30, result);
    }
    @Test
    void shouldCalcSumOfNegativeNumbers() {
        Calculator calculator = new Calculator();
        int a = -10;
        int b = 20;
        int result = calculator.sum(a, b);
        assertEquals(10, result);
    }
    @Test
    void shouldCalcSumOfZeroNumbers() {
        Calculator calculator = new Calculator();
        int a = 0;
        int b = 20;
        int result = calculator.sum(a, b);
        assertEquals(20, result);
    }

    @Test
    void ShouldCalcSubtractOfPositiveNumbers() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 5;
        int result = calculator.subtract(a, b);
        assertEquals(5, result);
    }
    @Test
    void ShouldCalcSubtractOfNegativeNumbers() {
        Calculator calculator = new Calculator();
        int a = -10;
        int b = 5;
        int result = calculator.subtract(a, b);
        assertEquals(-15, result);
    }
    @Test
    void ShouldCalcSubtractOfZeroNumbers() {
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 0;
        int result = calculator.subtract(a, b);
        assertEquals(10, result);
    }
    @Test
    void ShouldCalcSquarePostiveNumbers() {
        Calculator calculator = new Calculator();
        int a = 5;
        int result = calculator.square(a);
        assertEquals(25, result);
    }
    @Test
    void ShouldCalcSquareNegativeNumbers() {
        Calculator calculator = new Calculator();
        int a = -5;
        int result = calculator.square(a);
        assertEquals(25, result);
    }
    @Test
    void ShouldCalcSquareZeroNumbers() {
        Calculator calculator = new Calculator();
        int a = 0;
        int result = calculator.square(a);
        assertEquals(0, result);
    }
}