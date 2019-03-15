package com.twu.biblioteca;

public class Librarian {
    private Book[] books;

    public Librarian(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void listBooks() {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getTitle());
        }
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
