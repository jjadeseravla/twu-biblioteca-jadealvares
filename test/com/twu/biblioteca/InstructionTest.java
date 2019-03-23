//package com.twu.biblioteca;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.io.ByteArrayInputStream;
//import java.io.InputStream;
//
//import java.util.Scanner;
//
//import static junit.framework.TestCase.assertTrue;
//import static org.junit.Assert.assertFalse;
//import static org.mockito.Mockito.*;
//
//public class InstructionTest {
//
//    private Scanner scanner;
//
//    @Before
//    public void setUp() {
//    }
//
//    @After
//    public void tearDown() {
//    }
//
//    public void mockInput(String inputData) {
//        InputStream in = new ByteArrayInputStream(inputData.getBytes());
//        scanner = new Scanner(in);
//    }
//
//    @Test
//    public void shouldBeAbleToCheckOutABook() {
//        mockInput("testTitle\n");
//        Book book = new Book("testTitle", "testAuthor", 2009);
//        Instruction instruction = new Instruction(scanner, new Book[] {book});
//        assertTrue(book.isBookAvailable());
//        instruction.checkBookOut();
//        assertFalse(book.isBookAvailable());
//    }
//
//    @Test
//    public void unsuccessfulCheckoutOrReturnIfBookIsNotInLibrary() {
//        mockInput("ble");
//        Book book = new Book("testTitle", "testAuthor", 2009);
//        Instruction instruction = spy(new Instruction(scanner, new Book[] {book}));
//        instruction.checkBookOut();
//        verify(instruction).bookNotAvailable();
//    }
//
//    @Test
//    public void unsuccessfulCheckoutIfTryingToCheckItOutMoreThanOnce() {
//        mockInput("testTitle\ntestTitle\n");
//        Book book = new Book("testTitle", "testAuthor", 2009);
//        Instruction checkoutBook = new Instruction(scanner, new Book[] {book});
//        checkoutBook.checkBookOut();
//        assertFalse(book.isBookAvailable());
//        checkoutBook.checkBookOut();
//        assertFalse(book.isBookAvailable());
//    }
//
//    @Test
//    public void shouldBeNotifiedIfBookHasNotBeenReturnedToCheckOutAgain() {
//        mockInput("testTitle\ntestTitle\n");
//        Book book = new Book("testTitle", "testAuthor", 2009);
//        Instruction instruction = spy(new Instruction(scanner, new Book[] {book}));
//        instruction.checkBookOut();
//        instruction.checkBookOut();
//        verify(instruction).bookAlreadyCheckedOut();
//    }
//
//    @Test
//    public void successfulCheckout() {
//        mockInput("testTitle\n");
//        Book book = new Book("testTitle", "testAuthor", 2009);
//        Instruction instruction = spy(new Instruction(scanner, new Book[] {book}));
//        instruction.checkBookOut();
//        verify(instruction).successfulCheckout("testTitle");
//    }
//
//    @Test
//    public void unsuccessfulReturnIfHaveNotCheckedOutToReturn() {
//        mockInput("testTitle\n");
//        Book book = new Book("testTitle", "testAuthor", 2009);
//        Instruction instruction = spy(new Instruction(scanner, new Book[] {book}));
//        instruction.returnABook();
//        verify(instruction).bookNotCheckedOutToReturn("testTitle");
//    }
//
//
//    @Test
//    public void successfulReturnOfBook() {
//        mockInput("testTitle\ntestTitle\n");
//        Book book = new Book("testTitle", "testAuthor", 2009);
//        Instruction instruction = spy(new Instruction(scanner, new Book[] {book}));
//        instruction.checkBookOut();
//        instruction.returnABook();
//        verify(instruction).successfulReturn("testTitle");
//    }
//}
