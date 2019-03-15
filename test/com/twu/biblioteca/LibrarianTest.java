package com.twu.biblioteca;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class LibrarianTest {

    @Test
    public void shouldListAllBooks() {
        Book book1 = new Book("testbook1");
        Book book2 = new Book("testbook2");
        Librarian librarian = new Librarian(new Book[] {book1, book2});
        assertArrayEquals(new Book[]{book1, book2}, librarian.getBooks());
    }
}
