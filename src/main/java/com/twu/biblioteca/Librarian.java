package com.twu.biblioteca;

import com.twu.biblioteca.input.IUserInput;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.Movie;

public class Librarian {
    private Instruction <Book> bookInstruction;
    private Instruction <Movie> movieInstruction;
    private IUserInput scanner;
    //private Scanner scanner;

    public Librarian(IUserInput scanner, Instruction<Book> bookInstruction, Instruction<Movie> movieInstruction) {
        //this.scanner = scanner;
        this.scanner = scanner;
        this.bookInstruction = bookInstruction;
        this.movieInstruction = movieInstruction;
    }

    public void listBooks() {
        Book [] books = bookInstruction.getItems();
        for (int i = 0; i < books.length; i++) {
            if (books[i].isBookAvailable()) {
                System.out.println(String.format("%s|", books[i].getTitle()) + books[i].getAuthor() + String.format("|%d", books[i].getYear()) + "\n");
            }
        }
    }

    public void listMovies() {
        Movie [] movies = movieInstruction.getItems();
        for (int i = 0; i < movies.length; i++) {
                System.out.println(String.format("%s|", movies[i].getName()) + String.format("%d|", movies[i].getYear()) + String.format("%s|", movies[i].getDirector()) + String.format("%d", movies[i].getRating()) + "\n");
        }
    }


    public void checkBookOut() {
        String title = enterTitleOfBook();
        bookInstruction.checkBookOut(title);
    }

    public void returnABook() {
        String title = enterTitleOfBook();
        bookInstruction.returnABook(title);
    }

    public String enterTitleOfBook() {
        System.out.println("Enter the title of the book");
        String bookTitle = scanner.nextLine();
        return bookTitle;
    }
}
