package com.kodilla.mockito.homework;

public class Location {
    private String name;

    public Location(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // nadpisanie equals i hashCode, potrzebne do użycia w HashMap/Set
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return name.equals(location.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
