package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.*;

public class CheckoutBookTest {

    private CheckoutBook checkoutBook;
    private Book[] books = new Book[1];
    private Librarian librarian;
    private Scanner scanner;
    private InputStream originalIn;

    @Before
    public void setUp() {
        librarian = mock(Librarian.class);
        scanner = mock(Scanner.class);
        originalIn = System.in;
    }

    @After
        public void tearDown() {
        System.setIn(originalIn);
    }

    public void mockInput(String inputData) {
        InputStream in = new ByteArrayInputStream(inputData.getBytes());
        System.setIn(in);
    }

    @Test
    public void shouldBeAbleToCheckOutABook() {
        mockInput("testTitle\n");
        Book book = new Book("testTitle", "testAuthor", 2009);
        CheckoutBook checkoutBook = new CheckoutBook(new Book[] {book});
//        Map<String, Book> bookByTitle = new HashMap<String, Book>();
//        bookByTitle.put(book.getTitle(), book);
        assertTrue(book.isBookAvailable());
        checkoutBook.checkBookOut();
        assertFalse(book.isBookAvailable());
    }

    @Test
    public void shouldBeNotifiedIfBookIsNotInLibrary() {
        mockInput("ble");
        Book book = new Book("testTitle", "testAuthor", 2009);
        checkoutBook = spy(new CheckoutBook(new Book[] {book}));
        checkoutBook.checkBookOut();
        verify(checkoutBook).bookNotAvailable();
    }

    @Test
    public void bookIsStillNotAvailableAfterTryingToCheckItOutMoreThanOnce() {
        mockInput("testTitle\ntestTitle\n");
        Book book = new Book("testTitle", "testAuthor", 2009);
        CheckoutBook checkoutBook = new CheckoutBook(new Book[] {book});
        checkoutBook.checkBookOut();
        assertFalse(book.isBookAvailable());
        checkoutBook.checkBookOut();
        assertFalse(book.isBookAvailable());
    }

    @Test
    public void shouldBeNotifiedIfBookHasNotBeenReturnedToCheckOutAgain() {
        mockInput("testTitle\ntestTitle\n");
        Book book = new Book("testTitle", "testAuthor", 2009);
        checkoutBook = spy(new CheckoutBook(new Book[] {book}));
        checkoutBook.checkBookOut();
        checkoutBook.checkBookOut();
        verify(checkoutBook).bookAlreadyCheckedOut();
    }

    @Test
    public void successfulCheckout() {
        mockInput("testTitle\n");
        Book book = new Book("testTitle", "testAuthor", 2009);
        checkoutBook = spy(new CheckoutBook(new Book[] {book}));
        checkoutBook.checkBookOut();
        verify(checkoutBook).successfulCheckout("testTitle");
    }


}
