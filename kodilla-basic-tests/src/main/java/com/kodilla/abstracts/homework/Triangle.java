package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;
    private double height;

    public Triangle(double a, double b, double c, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (a * height) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
}
