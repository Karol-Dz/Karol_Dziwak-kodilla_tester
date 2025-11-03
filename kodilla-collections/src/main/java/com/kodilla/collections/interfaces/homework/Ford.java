package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    private int speed;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 30;

    }

    @Override
    public void decreaseSpeed() {
        speed -= 15;
        if (speed < 0) speed = 0;
    }
    @Override
    public String toString() {
        return "Ford";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ford)) return false;
        Ford ford = (Ford) o;
        return speed == ford.speed;
    }
    @Override
    public int hashCode() {
        return Integer.hashCode(speed);
    }
}
