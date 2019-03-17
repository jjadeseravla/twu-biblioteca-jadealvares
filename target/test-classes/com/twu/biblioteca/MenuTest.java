package com.twu.biblioteca;
import com.sun.tools.javac.parser.ScannerFactory;
import org.junit.After;
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
    private InputStream originalIn;
    //ScannerFactory factory;

    @Before
    public void setUp() {
        librarian = mock(Librarian.class);
        scanner = mock(Scanner.class);
        menu = new Menu(librarian);
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
    public void shouldBeAbleToSelectOption1toDisplayBook() {
        mockInput("1\n3\n2\n");
        //sm = new Scannermocks();
        menu = new Menu(librarian);
        assertEquals(menu.inputFromUser(), 1);
        assertEquals(menu.inputFromUser(), 3);
        assertEquals(menu.inputFromUser(), 2);
    }

    @Test
    public void shouldBeAbleToSelectOption1toDisplayBook2() {
        mockInput("7\n");
        menu = new Menu(librarian);
        assertEquals(menu.inputFromUser(), 7);
    }







    @Test
    public void shouldDisplayWelcomeMessage() {
        String message = menu.getWelcomeMessage();
        assertEquals(menu.getWelcomeMessage(), EXPECTED_MESSAGE);
    }

//    @Test
//    public void shouldBeAbleToSelectOption1toDisplayBook() {
//       // Scanner sc = mock(Scanner.class);
//        //when(scanner.nextLine()).thenReturn("1");
//        String input = "1";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//        menu.selector();
//        verify(librarian, times(1)).listBooks();
//    }

    @Test
    public void shouldBeNotifiedWhenInvalidOptionIsChosen() {

    }

    @Test
    public void shouldBeAbleToChooseToQuitBiblioteca() {

    }

}
