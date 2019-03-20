package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {
    private static final String WELCOME_MESSAGE = "Welcome to Biblioteca! Your one-stop-shop for great book titles in Bangalore! \n";
    private Librarian librarian;
    private Scanner scanner;
    private Instruction instruction;

    public Menu(Scanner scanner, Librarian librarian, Instruction instruction) {
        this.librarian = librarian;
        this.instruction = instruction;
        this.scanner = scanner;
    }

    public String getWelcomeMessage() {
        return WELCOME_MESSAGE;
    }

        public String showMenuOptions() {
            return  "0. Exit Biblioteca \n" +
                    "1. Display list of books: \n" +
                    "2. Checkout a book \n" +
                    "3. Return a book";
    }

        public int inputFromUser() {
        try {
            String line = scanner.nextLine();
            int userChoice = Integer.parseInt(line);
            return userChoice;
        }
           catch( NumberFormatException e) {
            return -1;
           }
        }


        public boolean processCommand() {
            int userChoice = inputFromUser();
            switch(userChoice) {
                case 0:
                    //System.exit(0);
                    return true;
                case 1:
                    librarian.listBooks();
                    break;
                case 2:
                    instruction.checkBookOut();
                    break;
                case 3:
                    instruction.returnABook();
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
        System.out.println("Please select another menu option");
    }
}






