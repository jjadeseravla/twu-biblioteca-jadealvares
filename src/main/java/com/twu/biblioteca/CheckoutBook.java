package com.twu.biblioteca;

        import java.util.HashMap;
        import java.util.Map;
        import java.util.Scanner;

public class CheckoutBook {

    final String NEWLINE = System.getProperty("line.separator");
    private final Scanner scanner;
    private Book[] books;
    private final Map<String, Book> bookByTitle;

    public CheckoutBook(Book[] books) {
        scanner = new Scanner(System.in);
        bookByTitle = new HashMap<String, Book>(); //map with the string title and book object
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            bookByTitle.put(book.getTitle(), book); // put books into hash map
        }
    }

    public String enterTitleOfBook() {
        System.out.println("Enter the title of the book you would like to checkout");
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

    public void bookNotAvailable() {
        System.out.println("Sorry, that book is not available" + NEWLINE +
                            "Please select option 2 and choose a book we have available");
    }

    public void bookAlreadyCheckedOut() {
        System.out.println("you have already checked this book out"+ NEWLINE +
                            "Please select option 2 and choose a book we have available");
    }

    public void successfulCheckout(String bookTitle) {
        System.out.println("you have checked out " + bookTitle + NEWLINE +
                "Thank you, enjoy the book!" + NEWLINE +
                "Please select another menu option");
    }
}


