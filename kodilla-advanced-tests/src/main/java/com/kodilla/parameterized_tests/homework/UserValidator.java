package com.kodilla.parameterized_tests.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    public boolean validateUsername(String username) {
        return username.matches("^[a-zA-Z0-9._-]{3,}$");
    }
    public boolean validateEmail(String email) {
        if (null != email) {
            String regex = ("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$");

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }
        return false;
    }
}

