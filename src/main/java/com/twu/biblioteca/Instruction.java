package com.twu.biblioteca;

        import java.util.HashMap;
        import java.util.Map;
        import java.util.Scanner;

public class Instruction {

    final String NEWLINE = System.getProperty("line.separator");
    private Book[] books;
    private final Map<String, Book> bookByTitle;
    private Scanner scanner;

    public Instruction(Scanner scanner, Book[] books) {
        this.scanner = scanner;
        bookByTitle = new HashMap<String, Book>(); //map with the string title and book object
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            bookByTitle.put(book.getTitle(), book); // put books into hash map
        }
    }

    public String enterTitleOfBook() {
        System.out.println("Enter the title of the book");
        String bookTitle = scanner.nextLine();
        return bookTitle;
    }

    public void checkBookOut() {
        String bookTitle = enterTitleOfBook();
        Book book = bookByTitle.get(bookTitle);
        if (book == null) {
            bookNotAvailable();
        } else if (!book.isBookAvailable()) {
            bookAlreadyCheckedOut();
        } else {
            book.setAvailable(false);
            successfulCheckout(bookTitle);
        }
    }

    public void returnABook() {
        String bookTitle = enterTitleOfBook();
        Book book = bookByTitle.get(bookTitle);
        if (book == null) {
            bookNotAvailable();
        } else if (book.isBookAvailable()) {
            bookNotCheckedOutToReturn(bookTitle);
        } else {
            book.setAvailable(true);
            successfulReturn(bookTitle);
        }
    }

    public void bookNotAvailable() {
        System.out.println("Sorry, that book is not available");
    }

    public void bookAlreadyCheckedOut() {
        System.out.println("you have already checked this book out"+ NEWLINE +
                            "Please select option 2 and choose a book we have available");
    }

    public void bookNotCheckedOutToReturn(String bookTitle) {
        System.out.println(bookTitle + " has not been checkedout to return");
    }

    public void successfulCheckout(String bookTitle) {
        System.out.println("you have checked out " + bookTitle + NEWLINE +
                "Thank you, enjoy the book!");
    }

    public void successfulReturn(String bookTitle) {
        System.out.println("Thank you, you have returned " + bookTitle);
    }
}


