package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.List;
import com.kodilla.stream.UsersRepository;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {

    @Test
    void shouldCalculateAveragePostsForUsersAboveOrEqual40() {
        // Given
        List<User> users = UsersRepository.getUsersList();
        ForumStats stats = new ForumStats();
        // When
        double average = stats.getAveragePostsForUsersAboveOrEqual40(users);
        // Then
        assertEquals(2.25, average);
    }

    @Test
    void shouldCalculateAveragePostsForUsersUnder40() {
        // Given
        List<User> users = UsersRepository.getUsersList();
        ForumStats stats = new ForumStats();
        // When
        double average = stats.getAveragePostsForUsersUnder40(users);
        // Then
        assertEquals(2382, average);
    }
}
