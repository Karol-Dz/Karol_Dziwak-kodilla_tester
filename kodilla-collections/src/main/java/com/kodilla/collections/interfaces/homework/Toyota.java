package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car {
    private int speed;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += 40;

    }

    @Override
    public void decreaseSpeed() {
        speed -= 20;
        if (speed < 0) speed = 0;
    }
    @Override
    public String toString() {
        return "Toyota";
    }
}
