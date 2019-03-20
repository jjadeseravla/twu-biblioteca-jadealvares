package com.twu.biblioteca;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class LibrarianTest {

    private Book book1;
    private Book book2;
    private Librarian librarian;

    @Before
    public void setUp() {
        book1 = new Book("testbook1", "testauthor1", 1999);
        book2 = new Book("The God Delusion", "Richard Dawkins", 1980);
        Librarian librarian = new Librarian(new Book[] {book1, book2});
    }

    @Test
    public void shouldListAllBooks() {
        Book book2 = new Book("testbook2", "testauthor2", 1993);
        assertArrayEquals(new Book[]{book1, book2}, librarian.getBooks());
    }

    @Test
    public void bookDetailsShouldBeDisplayed() {
       assertEquals(librarian.getBooks()[0].getYear(), 1999);
    }

    @Test
    public void canListAllBooksInANiceManner() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        librarian.listBooks();
        assertEquals("testbook1|testauthor1|1999\n\n", outContent.toString());
    }
}
