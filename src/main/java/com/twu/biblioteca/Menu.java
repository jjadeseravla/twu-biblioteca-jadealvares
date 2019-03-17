package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {
    private static final String WELCOME_MESSAGE = "Welcome to Biblioteca! Your one-stop-shop for great book titles in Bangalore! \n";
    private Librarian librarian;
    private Scanner scanner;
    private int userChoice;

    public Menu(Librarian librarian) {
        this.librarian = librarian;
        //this.scanner = scanner;
        scanner = new Scanner(System.in);
    }

    public String getWelcomeMessage() {
        return WELCOME_MESSAGE;
    }

        public String showMenuOptions() {
            return  "0. Exit Biblioteca \n" +
                    "1. Display list of books: ";
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
                    showMenuOptions();
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






