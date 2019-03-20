package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public Book[] setupBooks() {
        Book book1 = new Book("The Count of MonteCristo", "Alexandre Dumas", 1800);
        Book book2 = new Book("The God Delusion", "Richard Dawkins", 1980);
        Book book3 = new Book("Sapians", "Yuval Herari", 2011);
        return new Book[]{book1, book2, book3};
    }


    public void run() {
       Book[] books = setupBooks();

       Scanner scanner = new Scanner(System.in);

        Librarian librarian = new Librarian(books);
        Instruction instruction = new Instruction(scanner, books);
        Menu menu = new Menu(scanner, librarian, instruction);
        System.out.println(menu.getWelcomeMessage());
        System.out.println(menu.showMenuOptions());
        menu.selector();
    }


}
