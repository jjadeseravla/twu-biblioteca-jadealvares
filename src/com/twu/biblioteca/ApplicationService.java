package com.twu.biblioteca;

public class ApplicationService {
    private static final String WELCOME_MESSAGE = "Welcome to Biblioteca! Your one-stop-shop for great book titles in Bangalore!";
    private Librarian librarian;

    public ApplicationService() {

    }

    public String getWelcomeMessage() {
        return WELCOME_MESSAGE;
    }

}
