package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    private Shop shop;
    private Order order1, order2, order3;

    @BeforeEach
    void setUp() {

        shop = new Shop();
        order1 = new Order(100.0, LocalDate.of(2024, 1, 10), "anna");
        order2 = new Order(250.0, LocalDate.of(2024, 3, 15), "jan");
        order3 = new Order(500.0, LocalDate.of(2024, 5, 20), "ola");

        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
    }

    @Test
    void shouldAddUniqueOrdersCorrectly() {
        // Given
        int expected = 3;

        // When
        int result = shop.getNumberOfOrders();

        // Then
        assertEquals(expected, result);
    }

    @Test
    void shouldSearchForOrdersByDate() {
        // Given
        LocalDate from = LocalDate.of(2024, 1, 1);
        LocalDate to = LocalDate.of(2024, 3, 30);

        // When
        List<Order> result = shop.searchForOrdersByDate(from, to);

        // Then
        assertEquals(2, result.size());
        assertTrue(result.contains(order1));
        assertTrue(result.contains(order2));
    }

    @Test
    void shouldReturnOrdersWithinValueRange() {
        // Given
        double min = 100.0;
        double max = 300.0;

        // When
        List<Order> result = shop.searchForOrdersByValue(min, max);

        // Then
        assertEquals(2, result.size());
    }

    @Test
    void shouldSumAllOrderValuesCorrectly() {
        // Given
        double expectedSum = 850.0;

        // When
        double result = shop.getTotalValue();

        // Then
        assertEquals(expectedSum, result, 0.001);
    }
}