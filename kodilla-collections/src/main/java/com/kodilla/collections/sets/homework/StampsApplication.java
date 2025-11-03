package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Polska 2020", 2.5, 3.0, true));
        stamps.add(new Stamp("Polska 2021", 2.5, 3.0, false));
        stamps.add(new Stamp("Polska 2020", 2.5, 3.0, true));
        stamps.add(new Stamp("USA 2019", 3.0, 4.0, false));

        System.out.println("Number of stamps in the collection: " + stamps.size());
        System.out.println("Contents of the collection:");

        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}


