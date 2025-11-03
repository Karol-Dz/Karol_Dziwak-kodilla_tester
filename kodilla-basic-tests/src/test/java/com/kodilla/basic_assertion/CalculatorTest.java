package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldCalcSumOfPositiveNumbers() {
        // given
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 20;
        // when
        int result = calculator.sum(a, b);
        // then
        assertEquals(30, result);
    }
    @Test
    void shouldCalcSumOfNegativeNumbers() {
        // given
        Calculator calculator = new Calculator();
        int a = -10;
        int b = 20;
        // when
        int result = calculator.sum(a, b);
        // then
        assertEquals(10, result);
    }
    @Test
    void shouldCalcSumOfZeroNumbers() {
        // given
        Calculator calculator = new Calculator();
        int a = 0;
        int b = 20;
        // when
        int result = calculator.sum(a, b);
        // then
        assertEquals(20, result);
    }

    @Test
    void ShouldCalcSubtractOfPositiveNumbers() {
        // given
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 5;
        // when
        int result = calculator.subtract(a, b);
        // then
        assertEquals(5, result);
    }
    @Test
    void ShouldCalcSubtractOfNegativeNumbers() {
        // given
        Calculator calculator = new Calculator();
        int a = -10;
        int b = 5;
        // when
        int result = calculator.subtract(a, b);
        // then
        assertEquals(-15, result);
    }
    @Test
    void ShouldCalcSubtractOfZeroNumbers() {
        // given
        Calculator calculator = new Calculator();
        int a = 10;
        int b = 0;
        // when
        int result = calculator.subtract(a, b);
        // then
        assertEquals(10, result);
    }
    @Test
    void ShouldCalcSquarePostiveNumbers() {
        // given
        Calculator calculator = new Calculator();
        int a = 5;
        // when
        int result = calculator.square(a);
        // then
        assertEquals(25, result);
    }
    @Test
    void ShouldCalcSquareNegativeNumbers() {
        // given
        Calculator calculator = new Calculator();
        int a = -5;
        // when
        int result = calculator.square(a);
        // then
        assertEquals(25, result);
    }
    @Test
    void ShouldCalcSquareZeroNumbers() {
        // given
        Calculator calculator = new Calculator();
        int a = 0;
        // when
        int result = calculator.square(a);
        // then
        assertEquals(0, result);
    }
}