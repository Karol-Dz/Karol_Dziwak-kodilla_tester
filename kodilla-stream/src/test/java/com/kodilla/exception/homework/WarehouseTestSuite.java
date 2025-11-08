package com.kodilla.exception.homework;

import com.kodilla.exception.AirportNotFoundException;
import com.kodilla.exception.AirportRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {
    @Test
    void shouldThrowExceptionWhenOrderDoesNotExist() {
    // given
    Warehouse warehouse = new Warehouse();
    // when
    // then
    assertThrows(OrderDoesntExistException .class, () ->warehouse.getOrder("999"));
    }
}
