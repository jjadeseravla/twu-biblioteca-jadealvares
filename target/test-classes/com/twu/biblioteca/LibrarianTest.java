//package com.twu.biblioteca;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
//
//import static org.hamcrest.CoreMatchers.containsString;
//import static org.junit.Assert.*;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//public class LibrarianTest {
//
//    private Book book1;
//    private Book book2;
//    private Movie movie1;
//    private Movie movie2;
//    private Librarian librarian;
//    private UserInput scanner;
//
////    @Before
////    public void setUp() {
////        book1 = new Book("testbook1", "testauthor1", 1999);
////        book2 = new Book("The God Delusion", "Richard Dawkins", 1980);
////        movie1 = new Movie("testMovie1", 2011, "testDirector1", 7);
////        movie2 = new Movie("testMovie2", 2000, "testDirector2", 8);
////        Librarian librarian = new Librarian(new Book[] {book1, book2}, new Movie[] {movie1, movie2});
////    }
//
//    @Before
//    public void setUp() {
//        scanner = mock(UserInput.class);
//    }
//
//
////    @Test
////    public void shouldListAllBooks() {
////        Book book2 = new Book("testbook2", "testauthor2", 1993);
////        assertArrayEquals(new Book[]{book1, book2}, librarian.getBooks());
////    }
////
////    @Test
////    public void bookDetailsShouldBeDisplayed() {
////       assertEquals(librarian.getBooks()[0].getYear(), 1999);
////    }
//
//    @Test
//    public void canListAllBooksInANiceManner() {
//        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(outContent));
//        librarian.listBooks();
//        assertEquals("testbook1|testauthor1|1999\n\n", outContent.toString());
//    }
//
//    @Test
//    public void shouldListMovies() {
//
//        when(scanner.nextLine()).thenReturn("hello", "hello"); //sequence of actions
//        librarian.listMovies();
//        assertEquals()
//
//                create  a wrapper for system.out like the one for scanner;
//    }
//}
