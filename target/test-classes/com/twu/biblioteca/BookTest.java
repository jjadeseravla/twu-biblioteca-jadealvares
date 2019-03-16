package com.twu.biblioteca;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book1Test;

    @Before
    public void setUp() {
        book1Test = new Book("my life", "me", 1991);
    }

    @Test
    public void getTitleTest() {
        assertEquals(book1Test.getTitle(), "my life");
    }
}
