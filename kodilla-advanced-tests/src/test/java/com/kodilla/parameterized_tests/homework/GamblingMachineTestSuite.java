package com.kodilla.parameterized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineCsvTest {

    private GamblingMachine machine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/validNumbers.csv", numLinesToSkip = 0)
    void shouldReturnResultInRangeForValidNumbers(String line) throws InvalidNumbersException {
        Set<Integer> numbers = parseCsvLineToSet(line);
        int result = machine.howManyWins(numbers);
        assertTrue(result >= 0 && result <= 6, "Wynik powinien być w zakresie 0–6");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/inValidNumbers.csv", numLinesToSkip = 0)
    void shouldThrowExceptionForInvalidNumbers(String line) {
        Set<Integer> numbers = parseCsvLineToSet(line);
        assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(numbers));
    }

    private Set<Integer> parseCsvLineToSet(String line) {
        return Arrays.stream(line.split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
    }
}
