
package com.twu.biblioteca;

        import java.util.Scanner;

public class BibliotecaApp {

    public Book[] setupBooks() {
        Book book1 = new Book("The Count of MonteCristo", "Alexandre Dumas", 1800);
        Book book2 = new Book("The God Delusion", "Richard Dawkins", 1980);
        Book book3 = new Book("Sapians", "Yuval Herari", 2011);
        return new Book[]{book1, book2, book3};
    }

    public Movie[] setupMovies() {
        Movie movie1 = new Movie("movie1", 1999, "director1");
        Movie movie2 = new Movie("movie2", 2010, "director2", 9);
        return new Movie[]{movie1, movie2};
    }


    public void run() {
        Book[] books = setupBooks();
        Movie[] movies = setupMovies();

        Scanner scanner = new Scanner(System.in);
        //UserInput scanner = new UserInput();

        Instruction<Book> bookInstruction = new Instruction<Book>(books); //<> this is an instruction of books
        Instruction<Movie> movieInstruction = new Instruction<Movie>(movies);
        Librarian librarian = new Librarian(scanner, bookInstruction, movieInstruction);
        Menu menu = new Menu(scanner, librarian);
        System.out.println(menu.getWelcomeMessage());
        System.out.println(menu.showMenuOptions());
        menu.selector();
    }


}
