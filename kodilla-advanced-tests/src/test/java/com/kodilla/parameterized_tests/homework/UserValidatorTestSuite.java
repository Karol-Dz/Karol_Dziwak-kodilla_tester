package com.kodilla.parameterized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"john", "Anna_123", "user.name", "Ala-Makota", "user123"})
    void shouldValidateCorrectUsernames(String username) {
        assertTrue(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"jo", "a@", "!!user", "ab", " "})
    void shouldInvalidateIncorrectUsernames(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"example@domain.com", "user.name@sub.domain.co",
            "user-name@domain.org", "user_name@domain.pl", "test123@domain.io"})
    void shouldValidateCorrectEmails(String email) {
        assertTrue(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"example@domain", "user@@domain.com", "@domain.com",
            "userdomain.com", "user@.com", ""})
    void shouldInvalidateIncorrectEmails(String email) {
        assertFalse(validator.validateEmail(email));
    }

    @ParameterizedTest
    @CsvSource({"null,false"})
    void shouldReturnFalseWhenEmailIsNull(String email, boolean expected) {
        assertFalse(validator.validateEmail(null));
    }
}
