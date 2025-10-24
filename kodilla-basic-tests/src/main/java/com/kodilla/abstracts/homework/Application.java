package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4, 5, 2.5);


        System.out.println("=== Circle ===");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        System.out.println("=== Rectangle ===");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());

        System.out.println("=== Triangle ===");
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculatePerimeter());
    }
}
