package com.twu.biblioteca;
import com.sun.tools.javac.parser.ScannerFactory;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MenuTest {

    private Menu menu;
    private String EXPECTED_MESSAGE = "Welcome to BibliotecaTest!.";
    private Book[] books = new Book[1];
    private Librarian librarian;

//    @Before
//    public void setUp() {
//        factory = Mockito.mock(ScannerFactory.class);
//        librarian = Mockito.mock(Librarian.class);
//        menu = new Menu(factory.getInstance(), librarian);
//        Book book = Mockito.mock(Book.class);
//        //when(book.getTitle()).thenReturn("yala");
//        books[0] = book;
//        //menu = new Menu(Librarian librarian = new Librarian(Book books));
//    }
//
//    @Test
//    public void shouldDisplayWelcomeMessage() {
//        String message = menu.getWelcomeMessage();
//        assertEquals(menu.getWelcomeMessage(), message);
//    }

}
