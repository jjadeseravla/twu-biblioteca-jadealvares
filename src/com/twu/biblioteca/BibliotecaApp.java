package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {

        ApplicationService service = new ApplicationService();
        System.out.println(service.getWelcomeMessage());
        //Book[] books = createBooks();
        Book book1 = new Book("The Count of MonteCristo");
        Book book2 = new Book("The God Delusion");
        Book book3 = new Book("Sapians");
        Librarian librarian = new Librarian(new Book [] {book1, book2, book3});
        librarian.listBooks();
    }

}
