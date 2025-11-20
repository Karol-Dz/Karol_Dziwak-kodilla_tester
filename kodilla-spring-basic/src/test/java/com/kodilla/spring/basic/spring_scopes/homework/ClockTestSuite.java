package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.kodilla.spring.basic.spring_scopes.homework.Clock;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

public class ClockTestSuite {

    @Test
    public void testPrototypeClockHasDifferentTimes() throws InterruptedException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_scopes.homework");

        Clock clock1 = context.getBean(Clock.class);
        Thread.sleep(10);
        Clock clock2 = context.getBean(Clock.class);

        LocalTime time1 = clock1.getTime();
        LocalTime time2 = clock2.getTime();

        System.out.println("Clock1: " + time1);
        System.out.println("Clock2: " + time2);

        assertNotEquals(time1, time2);

        context.close();
    }
}