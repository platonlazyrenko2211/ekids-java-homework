package org.example.homework5.taskBooksLilbrary;

public class Book {
    String title;
    String author;
    int year;
    boolean isAvailable;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }
}
