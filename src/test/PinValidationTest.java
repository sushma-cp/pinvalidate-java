package src.test;

import org.junit.Test;

import src.main.PinValidation;

public class PinValidationTest {

    @Test
    void testValidNumber() {
        System.out.println("Testing Valid Number");
        assertEquals(true, PinValidation.pin("4401"));
        assertEquals(true, PinValidation.pin("1232"));

    }

    @Test
    void testInValidNumber() {
        System.out.println("Testing InValid Number");
        assertEquals(true, PinValidation.pin("4441"));
        assertEquals(true, PinValidation.pin("1234"));
        assertEquals(true, PinValidation.pin("9876"));
    }

}