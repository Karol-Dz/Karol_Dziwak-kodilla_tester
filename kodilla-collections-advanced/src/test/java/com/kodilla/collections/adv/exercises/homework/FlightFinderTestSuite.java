package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTest {

    @Test
    void shouldFindFlightsFromGivenCity() {
        // Given
        FlightFinder finder = new FlightFinder();
        String departure = "Warsaw";

        // When
        List<Flight> flightsFromWarsaw = finder.findFlightsFrom(departure);

        // Then
        assertEquals(2, flightsFromWarsaw.size());
    }

    @Test
    void shouldFindFlightsToGivenCity() {
        // Given
        FlightFinder finder = new FlightFinder();
        String arrival = "Warsaw";

        // When
        List<Flight> flightsToWarsaw = finder.findFlightsTo(arrival);

        // Then
        assertEquals(1, flightsToWarsaw.size());
    }

    @Test
    void shouldReturnEmptyListWhenNoFlightsFromGivenCity() {
        // Given
        FlightFinder finder = new FlightFinder();
        String departure = "Madrid";

        // When
        List<Flight> result = finder.findFlightsFrom(departure);

        // Then
        assertTrue(result.isEmpty(), "Expected empty list for city with no departures");
    }

    @Test
    void shouldReturnEmptyListWhenNoFlightsToGivenCity() {
        // Given
        FlightFinder finder = new FlightFinder();
        String arrival = "Sydney";

        // When
        List<Flight> result = finder.findFlightsTo(arrival);

        // Then
        assertTrue(result.isEmpty(), "Expected empty list for city with no arrivals");
    }

    @Test
    void shouldBeCaseInsensitiveWhenFindingFlightsFrom() {
        // Given
        FlightFinder finder = new FlightFinder();
        String departure = "wArSaW";  // mixed case

        // When
        List<Flight> flights = finder.findFlightsFrom(departure);

        // Then
        assertEquals(2, flights.size());
        assertTrue(flights.contains(new Flight("Warsaw", "London")));
        assertTrue(flights.contains(new Flight("Warsaw", "Paris")));
    }
}
