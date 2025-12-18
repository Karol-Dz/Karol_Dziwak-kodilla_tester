package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearTest {
    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {

        //given
        Year year = new Year(1600);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }

    @Test
    void shouldNotBeLeapYearIfDivisibleBy100ButNot400() {
        // Given
        Year year = new Year(1900);

        // When
        boolean isLeap = year.isLeap();

        // Then
        assertFalse(isLeap);
    }

    @Test
    void shouldBeLeapYearIfDivisibleBy4ButNot100() {
        // Given
        Year year = new Year(2020);

        // When
        boolean isLeap = year.isLeap();

        // Then
        assertTrue(isLeap);
    }

    @Test
    void shouldNotBeLeapYearIfNotDivisibleBy4() {
        // Given
        Year year = new Year(2019);

        // When
        boolean isLeap = year.isLeap();

        // Then
        assertFalse(isLeap);
    }
}