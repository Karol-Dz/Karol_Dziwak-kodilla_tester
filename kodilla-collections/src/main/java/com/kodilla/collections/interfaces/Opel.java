package com.kodilla.collections.interfaces;

public class Opel implements Car {
    private int speed;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 25;

    }

    @Override
    public void decreaseSpeed() {
        speed -= 10;
        if (speed < 0) speed = 0;
    }
    @Override
    public String toString() {
        return "Opel";
    }
}
