package org.example.homework5.taskBooksLilbrary;

import java.util.ArrayList;

public class Lilbrary {

    private ArrayList<Book> books = new ArrayList<>();
    void addBook(Book book) {
        books.add(book);
    }
    Book findBookByTitle(String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }
    void borrowBook(String title) {
        Book book = findBookByTitle(title);

        if (book != null && book.isAvailable) {
            book.isAvailable = false;
            System.out.println("Ви взяли книгу: " + title);
        } else {
            System.out.println("Книгу не знайдено або вона вже зайнята");
        }
    }
    void returnBook(String title) {
        Book book = findBookByTitle(title);
        if (book != null) {
            book.isAvailable = true;
            System.out.println("Книгу повернено: " + title);
        }
    }
    void listAvailableBooks() {
        System.out.println("Доступні книги:");

        for (Book b : books) {
            if (b.isAvailable) {
                System.out.println("- " + b.title + " (" + b.author + ")");
            }
        }
    }
}