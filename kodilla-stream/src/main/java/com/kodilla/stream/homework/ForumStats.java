package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {

    public double getAveragePostsForUsersAboveOrEqual40(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0);
    }


    public double getAveragePostsForUsersUnder40(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0);
    }


    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsersList();

        ForumStats stats = new ForumStats();

        double averageAbove40 = stats.getAveragePostsForUsersAboveOrEqual40(users);
        double averageUnder40 = stats.getAveragePostsForUsersUnder40(users);

        System.out.println("Średnia liczba postów dla użytkowników >= 40: " + averageAbove40);
        System.out.println("Średnia liczba postów dla użytkowników < 40: " + averageUnder40);
    }
}