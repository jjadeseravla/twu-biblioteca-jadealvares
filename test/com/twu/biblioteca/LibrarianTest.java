package com.twu.biblioteca;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class LibrarianTest {

    @Test
    public void shouldListAllBooks() {
        Book book1 = new Book("testbook1", "testauthor1", 1999);
        Book book2 = new Book("testbook2", "testauthor2", 1993);
        Librarian librarian = new Librarian(new Book[] {book1, book2});
        assertArrayEquals(new Book[]{book1, book2}, librarian.getBooks());
    }

    @Test
    public void bookDetailsShouldBeDisplayed() {
        Book book1 = new Book("testbook1", "testauthor1", 1999);
        Librarian librarian = new Librarian(new Book[] {book1});
       assertEquals(librarian.getBooks()[0].getYear(), 1999);

    }
}
