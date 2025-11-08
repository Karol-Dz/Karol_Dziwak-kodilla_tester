package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Tomasz Nowak");
        Teacher teacher2 = new Teacher("Anna Kowalska");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan Kowalski", teacher1));
        students.add(new Student("Maria Nowak", null));
        students.add(new Student("Piotr Wiśniewski", teacher2));
        students.add(new Student("Ewa Krawczyk", null));


        for (Student student : students) {

            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());

            String teacherName = optionalTeacher
                    .map(Teacher::getName)
                    .orElse("<undefined>");

            System.out.println("Student: " + student.getName() + ", teacher: " + teacherName);
        }
    }
}