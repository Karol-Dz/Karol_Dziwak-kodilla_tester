package com.kodilla.userloop;

public class Application {

    private String name;
    private double age;
    private double height;

    public Application(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void checkUserStatus() {
        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("com.kodilla.userloop.User is older than 30 and taller than 160cm");
            } else {
                System.out.println("com.kodilla.userloop.User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }

    public static void main(String[] args) {
        Application app = new Application("Adam", 40.5, 178);
        app.checkUserStatus();
        User[] users = {
                new User("Anna", 25),
                new User("Bartek", 30),
                new User("Celina", 22),
                new User("Darek", 35),
                new User("Ewa", 28)
        };
        double sum = 0;
        for (User u : users) {
            sum += u.getAge();
        }
        double average = sum / users.length;

        System.out.println("Average age: " + average);
        System.out.println("Users under average age:");

        for (User u : users) {
            if (u.getAge() < average) {
                System.out.println(u.getName());
            }
        }
    }
}

