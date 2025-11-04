package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolMap = new HashMap<>();
        Principal principal1 = new Principal("Anna", "Kowalska");
        Principal principal2 = new Principal("Jan", "Nowak");
        Principal principal3 = new Principal("Ewa", "Wiśniewska");

        School school1 = new School("Primary School nr 1", 25, 27, 24, 26, 28);
        School school2 = new School("Primary School nr 5", 30, 29, 31, 28);
        School school3 = new School("Primary School nr 3", 32, 33, 31);

        schoolMap.put(principal1, school1);
        schoolMap.put(principal2, school2);
        schoolMap.put(principal3, school3);

        System.out.println("Directory of schools and principals:\n");

        for (Map.Entry<Principal, School> entry : schoolMap.entrySet()) {
            System.out.println("Principal: " + entry.getKey());
            System.out.println("School: " + entry.getValue().getName());
            System.out.println("Total number of students: " + entry.getValue().getTotalStudents());
            System.out.println("--------------------------------------");
        }
    }
}

