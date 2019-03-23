package com.twu.biblioteca;

import com.twu.biblioteca.model.Book;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.*;

public class InstructionTest {


    @Test
    public void shouldBeAbleToCheckOutABook() {
        //mockInput("testTitle\n");
        Book book = new Book("testTitle", "testAuthor", 2009);
        Instruction instruction = new Instruction(new Book[] {book});
        assertTrue(book.isBookAvailable());
        instruction.checkBookOut("testTitle");
        assertFalse(book.isBookAvailable());
    }

    @Test
    public void unsuccessfulCheckoutOrReturnIfBookIsNotInLibrary() {
        //mockInput("ble");
        Book book = new Book("testTitle", "testAuthor", 2009);
        Instruction instruction = spy(new Instruction(new Book[] {book}));
        instruction.checkBookOut("ble");
        verify(instruction).bookNotAvailable();
    }

    @Test
    public void unsuccessfulCheckoutIfTryingToCheckItOutMoreThanOnce() {
       // mockInput("testTitle\ntestTitle\n");
        Book book = new Book("testTitle", "testAuthor", 2009);
        Instruction checkoutBook = new Instruction(new Book[] {book});
        checkoutBook.checkBookOut("testTitle");
        assertFalse(book.isBookAvailable());
        checkoutBook.checkBookOut("testTitle");
        assertFalse(book.isBookAvailable());
    }

    @Test
    public void shouldBeNotifiedIfBookHasNotBeenReturnedToCheckOutAgain() {
        //mockInput("testTitle\ntestTitle\n");
        Book book = new Book("testTitle", "testAuthor", 2009);
        Instruction instruction = spy(new Instruction(new Book[] {book}));
        instruction.checkBookOut("testTitle");
        instruction.checkBookOut("testTitle");
        verify(instruction).bookAlreadyCheckedOut();
    }

    @Test
    public void successfulCheckout() {
        //mockInput("testTitle\n");
        Book book = new Book("testTitle", "testAuthor", 2009);
        Instruction instruction = spy(new Instruction(new Book[] {book}));
        instruction.checkBookOut("testTitle");
        verify(instruction).successfulCheckout("testTitle");
    }

    @Test
    public void unsuccessfulReturnIfHaveNotCheckedOutToReturn() {
        //mockInput("testTitle\n");
        Book book = new Book("testTitle", "testAuthor", 2009);
        Instruction instruction = spy(new Instruction(new Book[] {book}));
        instruction.returnABook("testTitle");
        verify(instruction).bookNotCheckedOutToReturn("testTitle");
    }


    @Test
    public void successfulReturnOfBook() {
        //mockInput("testTitle\ntestTitle\n");
        Book book = new Book("testTitle", "testAuthor", 2009);
        Instruction instruction = spy(new Instruction(new Book[] {book}));
        instruction.checkBookOut("testTitle");
        instruction.returnABook("testTitle");
        verify(instruction).successfulReturn("testTitle");
    }
}
