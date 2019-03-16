package com.twu.biblioteca;
import com.sun.tools.javac.parser.ScannerFactory;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class MenuTest {

    private Menu menu;
    private String EXPECTED_MESSAGE = "Welcome to BibliotecaTest!.";
    private Book[] books = new Book[1];
    private Librarian librarian;
    private Scanner scanner;
    //ScannerFactory factory;

    @Before
    public void setUp() {
        librarian = mock(Librarian.class);
        scanner = mock(Scanner.class);
        menu = new Menu(librarian);
    }

    @Test
    public void shouldDisplayWelcomeMessage() {
        String message = menu.getWelcomeMessage();
        assertEquals(menu.getWelcomeMessage(), EXPECTED_MESSAGE);
    }

    @Test
    public void shouldBeAbleToSelectOption1toDisplayBook() {
       // Scanner sc = mock(Scanner.class);
        //when(scanner.nextLine()).thenReturn("1");
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        menu.selector();
        verify(librarian, times(1)).listBooks();
    }

    @Test
    public void shouldBeNotifiedWhenInvalidOptionIsChosen() {

    }

    @Test
    public void shouldBeAbleToChooseToQuitBiblioteca() {

    }

}
