package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.stream.UsersManager.getUserOlderThan;
import static com.kodilla.stream.UsersManager.getUserPostedMoreThan;
import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTestSuite {

    @Test
    void shouldFilterChemistGroupUsernames() {
        // given
        List<User> users = UsersRepository.getUsersList();
        // when
        List<String> chemistUsernames = UsersManager.filterChemistGroupUsernames();
        //then
        assertEquals(2, chemistUsernames.size());
    }

    @Test
    void shouldFindUserOlderThan46() {
        // given
        List<User> users = UsersRepository.getUsersList();
        // when
        List<User> olderUsers = getUserOlderThan(46);
        // then
        assertEquals(3, olderUsers.size());
    }
    @Test
    void shouldFindUserPostedMoreThan100() {
        // given
        List<User> users = UsersRepository.getUsersList();
        // when
        List<User> activeUsers = getUserPostedMoreThan(100);
        // then
        assertEquals(2, activeUsers.size());
    }

}