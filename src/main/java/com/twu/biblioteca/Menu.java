package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {
    private static final String WELCOME_MESSAGE = "Welcome to Biblioteca! Your one-stop-shop for great book titles in Bangalore! \n";
    private Librarian librarian;
    private Scanner scanner;
    private int userChoice;
    private CheckoutBook checkoutBook;

    public Menu(Librarian librarian, CheckoutBook checkoutBook) {
        this.librarian = librarian;
        this.checkoutBook = checkoutBook;
        //this.scanner = scanner;
        scanner = new Scanner(System.in);
    }

    public String getWelcomeMessage() {
        return WELCOME_MESSAGE;
    }

        public String showMenuOptions() {
            return  "0. Exit Biblioteca \n" +
                    "1. Display list of books: \n" +
                    "2. Checkout a book";
    }

        public int inputFromUser() {
            String line = scanner.nextLine();
            int userChoice = Integer.parseInt(line);
            return userChoice;
        }


        public boolean processCommand() {
            int userChoice = inputFromUser();
            switch(userChoice) {
                case 0:
                    System.exit(0);
                case 1:
                    librarian.listBooks();
                    break;
                case 2:
                    checkoutBook.checkBookOut();
                    break;
                default:
                    invalidMessage();

            }
            return false;
    }

    public void selector() {
        while(true) {
            boolean finish = processCommand();
            if(finish) break;
        }
    }

    public void invalidMessage() {
        System.out.println("Please select a valid option!");
    }
}






