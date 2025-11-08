package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println("Chemsit Group: " + chemistGroupUsernames);

        List<User> olderUsers = getUserOlderThan(46);
        System.out.println("Users older than 46: " + olderUsers);

        List<User> activeUsers = getUserPostedMoreThan(100);
        System.out.println("Users posted more than 100 post: " + activeUsers);

    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }
    public static List<User> getUserOlderThan(int age) {
        List<User> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() >= age)
                .collect(Collectors.toList());

        return usernames;
    }
    public static List<User> getUserPostedMoreThan(int numberOfPost) {
        List<User> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() >= numberOfPost)
                .collect(Collectors.toList());

        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}
