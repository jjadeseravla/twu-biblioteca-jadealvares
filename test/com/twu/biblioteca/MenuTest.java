package com.twu.biblioteca;
import com.sun.tools.javac.parser.ScannerFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class MenuTest {

    private Menu menu;
    private String EXPECTED_MESSAGE = "Welcome to BibliotecaTest!.";
    private Book[] books = new Book[1];
    private Librarian librarian;
    private Scanner scanner;
    private InputStream originalIn;
    private CheckoutBook checkoutBook;
    //ScannerFactory factory;

    @Before
    public void setUp() {
        librarian = mock(Librarian.class);
        scanner = mock(Scanner.class);
        checkoutBook = mock(CheckoutBook.class);
        menu = new Menu(librarian, checkoutBook);
        originalIn = System.in;
    }

    @After
    public void tearDown() {
        System.setIn(originalIn);
    }

    @Test
    public void shouldDisplayWelcomeMessage() {
        String message = menu.getWelcomeMessage();
        assertEquals(menu.getWelcomeMessage(), EXPECTED_MESSAGE);
    }

    public void mockInput(String inputData) {
        InputStream in = new ByteArrayInputStream(inputData.getBytes());
        System.setIn(in);
    }

    @Test
    public void shouldBeAbleToSelectOptionsOnMenu() {
        mockInput("1\n3\n2\n");
        menu = new Menu(librarian, checkoutBook);
        assertEquals(menu.inputFromUser(), 1);
        assertEquals(menu.inputFromUser(), 3);
        assertEquals(menu.inputFromUser(), 2);
    }

    @Test
    public void shouldBeAbleToSelectUnavailableOption() {
        mockInput("7\n");
        menu = new Menu(librarian, checkoutBook);
        assertEquals(menu.inputFromUser(), 7);
    }

    @Test
    public void notifiedInvalidOption() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        menu.invalidMessage();
        assertEquals("Please select a valid option!\n", outContent.toString());
    }


}
