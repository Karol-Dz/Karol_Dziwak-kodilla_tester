package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    private List<Order> orders = new ArrayList<>();

    void addOrder(Order order) {
        orders.add(order);
    }

    List<Order> searchForOrdersByDate(LocalDate from, LocalDate to) {
        return orders.stream()
                .filter(o -> o.getDate().isAfter(from))
                .filter(o -> o.getDate().isBefore(to))
                .collect(Collectors.toList());
    }

    List<Order> searchForOrdersByValue(double from, double to) {
        return orders.stream()
                .filter(o -> o.getValue() >= from)
                .filter(o -> o.getValue() <= to)
                .collect(Collectors.toList());
    }

    int getNumberOfOrders() {
        return orders.size();
    }

    double getTotalValue() {
        return orders.stream()
                .mapToDouble(Order::getValue)
                .sum();
    }
}
