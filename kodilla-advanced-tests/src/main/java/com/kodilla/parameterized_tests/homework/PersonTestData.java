package com.kodilla.parameterized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonTestData {

    public static Stream<Arguments> providePersonData() {
        return Stream.of(
                Arguments.of(new Person(1.75, 40), "Underweight"),
                Arguments.of(new Person(1.70, 45), "Very severely underweight"),
                Arguments.of(new Person(1.80, 60), "Normal (healthy weight)"),
                Arguments.of(new Person(1.65, 70), "Overweight"),
                Arguments.of(new Person(1.60, 95), "Obese Class II (Severely obese)"),
                Arguments.of(new Person(1.50, 120), "Obese Class V (Super Obese)")
        );
    }
}

