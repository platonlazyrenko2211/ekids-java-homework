package org.example.homework5.taskBooksLilbrary;

public class Main {
    public static void main(String[] args) {

        Lilbrary library = new Lilbrary();

        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
        Book book3 = new Book("Harry Potter", "J.K. Rowling", 1997);
        Book book4 = new Book("Toreadors from Vasyukivka", "Vsevolod Nestayko", 1972);
        Book book5 = new Book("Dune", "Frank Herbert", 1965);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);

        library.borrowBook("Toreadors from Vasyukivka");

        System.out.println();

        library.listAvailableBooks();
    }
}
