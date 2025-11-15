package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WeatherNotificationService {

    private Map<Location, Set<Client>> subscriptions = new HashMap<>();

    // dodanie klienta do lokalizacji
    public void subscribe(Client client, Location location) {
        subscriptions.computeIfAbsent(location, loc -> new HashSet<>()).add(client);
    }

    // wycofanie subskrypcji z jednej lokalizacji
    public void unsubscribe(Client client, Location location) {
        Set<Client> clients = subscriptions.get(location);
        if (clients != null) {
            clients.remove(client);
            if (clients.isEmpty()) {
                subscriptions.remove(location);
            }
        }
    }

    // wycofanie subskrypcji ze wszystkich lokalizacji
    public void unsubscribeFromAll(Client client) {
        subscriptions.values().forEach(set -> set.remove(client));
        subscriptions.entrySet().removeIf(entry -> entry.getValue().isEmpty());
    }

    // wysyłka powiadomienia do wszystkich klientów w danej lokalizacji
    public void sendNotificationToLocation(Notification notification, Location location) {
        Set<Client> clients = subscriptions.get(location);
        if (clients != null) {
            clients.forEach(client -> client.receive(notification));
        }
    }

    // wysyłka powiadomienia do wszystkich klientów
    public void sendNotificationToAll(Notification notification) {
        subscriptions.values().forEach(set ->
                set.forEach(client -> client.receive(notification))
        );
    }

    // usunięcie lokalizacji
    public void removeLocation(Location location) {
        subscriptions.remove(location);
    }
}
