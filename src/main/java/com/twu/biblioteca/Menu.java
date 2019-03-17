package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {
    private static final String WELCOME_MESSAGE = "Welcome to Biblioteca! Your one-stop-shop for great book titles in Bangalore! \n";
    private Librarian librarian;
    private Scanner scanner;
    //private MenuSelector menuSelector;
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
            return "1. Display list of books: \n" +
                    "2. Exit Biblioteca";
    }

        public int inputFromUser() {
            //Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            //int userChoice = Integer.parseInt(scanner.nextLine());
            int userChoice = Integer.parseInt(line);
            return userChoice;
        }


        public boolean processCommand() {
        //while(true) {
            int userChoice = inputFromUser();
            switch(userChoice) {
                case 0:
                    System.exit(0);
                case 1:
                    librarian.listBooks();
                    showMenuOptions();
                    break;
                default:
                    System.out.println("not choice, try again");

            }
            return false;
    }

    public void selector() {
        while(true) {
            boolean finish = processCommand();
            if(finish) break;
        }
    }
}






