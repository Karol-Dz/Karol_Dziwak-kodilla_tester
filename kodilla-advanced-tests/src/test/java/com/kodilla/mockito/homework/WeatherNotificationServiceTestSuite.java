package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherNotificationServiceTest {

    private WeatherNotificationService service;
    private Client client1;
    private Client client2;
    private Location warsaw;
    private Location krakow;
    private Notification notification;

    @BeforeEach
    void setup() {
        service = new WeatherNotificationService();
        client1 = Mockito.mock(Client.class);
        client2 = Mockito.mock(Client.class);
        warsaw = new Location("Warsaw");
        krakow = new Location("Krakow");
        notification = new Notification("Alert pogodowy");
    }

    @Test
    void subscribedClientShouldReceiveNotification() {
        service.subscribe(client1, warsaw);
        service.sendNotificationToLocation(notification, warsaw);

        Mockito.verify(client1).receive(notification);
    }

    @Test
    void notSubscribedClientShouldNotReceiveNotification() {
        service.sendNotificationToLocation(notification, warsaw);

        Mockito.verify(client1, Mockito.never()).receive(notification);
    }

    @Test
    void clientCanSubscribeToMultipleLocations() {
        service.subscribe(client1, warsaw);
        service.subscribe(client1, krakow);

        service.sendNotificationToLocation(notification, krakow);
        Mockito.verify(client1).receive(notification);
    }

    @Test
    void unsubscribeFromOneLocation() {
        service.subscribe(client1, warsaw);
        service.unsubscribe(client1, warsaw);

        service.sendNotificationToLocation(notification, warsaw);
        Mockito.verify(client1, Mockito.never()).receive(notification);
    }

    @Test
    void unsubscribeFromAllLocations() {
        service.subscribe(client1, warsaw);
        service.subscribe(client1, krakow);

        service.unsubscribeFromAll(client1);

        service.sendNotificationToLocation(notification, warsaw);
        service.sendNotificationToLocation(notification, krakow);
        Mockito.verify(client1, Mockito.never()).receive(notification);
    }

    @Test
    void sendNotificationToAllClients() {
        service.subscribe(client1, warsaw);
        service.subscribe(client2, krakow);

        service.sendNotificationToAll(notification);

        Mockito.verify(client1).receive(notification);
        Mockito.verify(client2).receive(notification);
    }

    @Test
    void removeLocationShouldPreventNotifications() {
        service.subscribe(client1, warsaw);
        service.removeLocation(warsaw);

        service.sendNotificationToLocation(notification, warsaw);
        Mockito.verify(client1, Mockito.never()).receive(notification);
    }
}