package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        Book book1 = new Book("The Count of MonteCristo", "Alexandre Dumas", 1800);
        Book book2 = new Book("The God Delusion", "Richard Dawkins", 1980);
        Book book3 = new Book("Sapians", "Yuval Herari", 2011);
        Librarian librarian = new Librarian(new Book [] {book1, book2, book3});
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(librarian);
        System.out.println(menu.getWelcomeMessage());
        System.out.println(menu.showMenuOptions());
        menu.selector();
    }

}
