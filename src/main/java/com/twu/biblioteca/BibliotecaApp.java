
package com.twu.biblioteca;

        import com.twu.biblioteca.input.IUserInput;
        import com.twu.biblioteca.input.UserInputScanner;
        import com.twu.biblioteca.model.Book;
        import com.twu.biblioteca.model.Menu;
        import com.twu.biblioteca.model.Movie;

        import java.util.Scanner;

public class BibliotecaApp {

    public Book[] setupBooks() {
        Book book1 = new Book("The Count of MonteCristo", "Alexandre Dumas", 1800);
        Book book2 = new Book("The God Delusion", "Richard Dawkins", 1980);
        Book book3 = new Book("Sapians", "Yuval Herari", 2011);
        return new Book[]{book1, book2, book3};
    }

    public Movie[] setupMovies() {
        Movie movie1 = new Movie("Titanic", 1997, "director1");
        Movie movie2 = new Movie("Bohemium Rhapsody", 2019, "director2", "9");
        Movie movie3 = new Movie("Schindler's list", 1994, "Stephen Spielberg", "8");
        return new Movie[]{movie1, movie2, movie3};
    }


    public void run() {
        Book[] books = setupBooks();
        Movie[] movies = setupMovies();

        Scanner scanner = new Scanner(System.in);
        IUserInput input = new UserInputScanner(scanner);

        Instruction<Book> bookInstruction = new Instruction<Book>(books); //<> this is an instruction of books
        Instruction<Movie> movieInstruction = new Instruction<Movie>(movies);
        Librarian librarian = new Librarian(input, bookInstruction, movieInstruction);
        Menu menu = new Menu(input, librarian);
        System.out.println(menu.getWelcomeMessage());
        System.out.println(menu.showMenuOptions());
        menu.selector();
    }


}
