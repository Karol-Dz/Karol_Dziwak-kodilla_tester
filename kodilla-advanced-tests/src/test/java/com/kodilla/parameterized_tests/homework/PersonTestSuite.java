package com.kodilla.parameterized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTestSuite {
    @ParameterizedTest
    @MethodSource("com.kodilla.parameterized_tests.homework.PersonTestData#providePersonData")
    void shouldReturnCorrectBMICategory(Person person, String expectedCategory) {
        String actualCategory = person.getBMI();
        assertEquals(expectedCategory, actualCategory);
    }
}
