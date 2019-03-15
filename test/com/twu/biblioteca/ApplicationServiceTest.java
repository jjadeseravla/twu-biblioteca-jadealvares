package com.twu.biblioteca;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ApplicationServiceTest {

    private ApplicationService service;
    private String EXPECTED_MESSAGE = "Welcome to BibliotecaTest!.";

    @Before
    public void setUp() {
        service = new ApplicationService();
    }

    @Test
    public void shouldDisplayWelcomeMessage() {
        String message = service.getWelcomeMessage();
        assertEquals(service.getWelcomeMessage(), message);
    }

}
