package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTestSuite {

    @Test
    void shouldReturnTeacherNameWhenTeacherIsPresent() {
        // Given
        Teacher teacher = new Teacher("Tomasz Nowak");
        Student student = new Student("Jan Kowalski", teacher);

        // When
        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());

        String teacherName = optionalTeacher
                .map(Teacher::getName)
                .orElse("<undefined>");

        // Then
        assertEquals("Tomasz Nowak", teacherName);
    }

    @Test
    void shouldReturnUndefinedWhenTeacherIsNull() {
        // Given
        Student student = new Student("Maria Nowak", null);

        // When
        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());

        String teacherName = optionalTeacher
                .map(Teacher::getName)
                .orElse("<undefined>");

        // Then
        assertEquals("<undefined>", teacherName);
    }
}