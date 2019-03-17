package com.twu.biblioteca;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckoutBook {

    private Scanner scanner;
    private Book[] books;

    public CheckoutBook(Book[] books) {
        this.books = books;
        ///this.scanner = scanner;
        scanner = new Scanner(System.in);
    }

    public String enterTitleOfBook() {
        System.out.println("Enter the title of the book you would like to checkout");
        //String bookTitle = titleOfBook();
        String bookTitle = scanner.nextLine();
        return bookTitle;
    }

//    public String titleOfBook() {
//        String bookTitle = scanner.nextLine();
//        checkOutBook(bookTitle);
//        return bookTitle;
//    }

    public void checkBookOut() {
        String bookTitle = enterTitleOfBook();
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getTitle().equals(bookTitle) && !books[i].isBookAvailable()) {
                System.out.println("You have already checked out this book");
                //break;
            } else if (books[i].getTitle().equals(bookTitle)) {
                books[i].setAvailable(false);
                System.out.println("you have checked out " + bookTitle);
                //break;
            } else {
                System.out.println("Please enter a valid book title");
            }
        }
    }
}
