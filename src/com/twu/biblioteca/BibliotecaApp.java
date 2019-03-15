package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {

        ApplicationService service = new ApplicationService();
        System.out.println(service.getWelcomeMessage());
    }
}
