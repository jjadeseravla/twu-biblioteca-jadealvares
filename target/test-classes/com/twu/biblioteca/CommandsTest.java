//package com.twu.biblioteca;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.io.ByteArrayInputStream;
//import java.io.InputStream;
//import java.util.Scanner;
//
//import static junit.framework.TestCase.assertEquals;
//import static org.mockito.Mockito.mock;
//
//public class CommandsTest {
//
//    private Commands commands;
//    private Book[] books = new Book[1];
//    private Librarian librarian;
//    private Scanner scanner;
//    private InputStream originalIn;
//
//    @Before
//    public void setUp() {
//        librarian = mock(Librarian.class);
//        scanner = mock(Scanner.class);
//        originalIn = System.in;
//    }
//
//    @After
//        public void tearDown() {
//        System.setIn(originalIn);
//    }
//
//    public void mockInput(String inputData) {
//        InputStream in = new ByteArrayInputStream(inputData.getBytes());
//        System.setIn(in);
//    }
//
//    @Test
//    public void shouldBeAbleToCheckOutABook() {
//        Book book = new Book("testTitle", "testAuthor", 2009);
//        mockInput("testTitle");
//        commands = new Commands(scanner);
//        assertEquals(commands.titleOfBook(), "testTitle");
//    }
//
//    @Test
//    public void shouldBeNotifiedIfBookIsNotInLibrary() {
//        Book book = new Book("testTitle", "testAuthor", 2009);
//        mockInput("ble");
//        commands = new Commands(scanner);
//        assertEquals(commands.titleOfBook(), "testTitle");
//    }
//
//    @Test
//    public void shouldBeNotifiedIfBookHasNotBeenReturnedToCheckOutAgain() {
//        Book book = new Book("testTitle", "testAuthor", 2009);
//        mockInput("testTitle");
//        commands = new Commands(scanner);
//        comm
//    }
//}
