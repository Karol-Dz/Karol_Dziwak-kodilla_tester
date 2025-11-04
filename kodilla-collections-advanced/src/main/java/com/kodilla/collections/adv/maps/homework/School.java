package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Integer> studentsInClasses = new ArrayList<>();

    public School(String name, int... students) {
        this.name = name;
        for (int studentCount : students) {
            studentsInClasses.add(studentCount);
        }
    }

    public String getName() {
        return name;
    }

    public int getTotalStudents() {
        int sum = 0;
        for (int students : studentsInClasses) {
            sum += students;
        }
        return sum;
    }

    @Override
    public String toString() {
        return name + " (łączna liczba uczniów: " + getTotalStudents() + ")";
    }
}

