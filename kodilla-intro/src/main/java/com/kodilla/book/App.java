package com.kodilla.book;

public class App {
    public static void main(String[] args) {
        Book book = Book.of( "Galaxy", "Isaac Asimov");

    System.out.println("Book : " + book.getTitle() + " by " + book.getAuthor());
    }
}
