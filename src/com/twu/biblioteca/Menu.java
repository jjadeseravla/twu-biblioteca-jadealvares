package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {
    private static final String WELCOME_MESSAGE = "Welcome to Biblioteca! Your one-stop-shop for great book titles in Bangalore! \n";
    private Librarian librarian;

    public Menu(Librarian librarian) {
        this.librarian = librarian;
    }

    public String getWelcomeMessage() {
        return WELCOME_MESSAGE;
    }

        public String showMenuOptions() {
            return "1. Display list of books: " +
                    "2. Exit Biblioteca";
    }

    public void chooseOption() {
        //int userChoice = new Scanner(System.in).nextInt();
        Scanner scanner = new Scanner(System.in);
        while(true) {
        int userChoice = Integer.parseInt(scanner.nextLine());
            switch(userChoice) {
                case 1:
                    librarian.listBooks();
                    showMenuOptions();
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("not choice, try again");
            }

        }
    }
}






