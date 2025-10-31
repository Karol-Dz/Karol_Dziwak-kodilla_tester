package com.kodilla.collections.interfaces;

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
}
