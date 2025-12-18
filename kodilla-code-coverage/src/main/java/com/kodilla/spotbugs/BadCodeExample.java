package com.kodilla.spotbugs;

import java.util.Objects;

public class BadCodeExample {
    private String type;

    public String getType() {
        return type;
    }

    public static double getPi() {
        return Math.PI;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // te same obiekty
        if (o == null || getClass() != o.getClass()) return false; // null lub inna klasa

        BadCodeExample that = (BadCodeExample) o;

        return Objects.equals(type, that.type); // bezpieczne porównanie typu
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}