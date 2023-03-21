package ru.gnkoshelev.snowone2023._00;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EqualsTest {
    @Test
    void equalsTest() {
        String myString = new String("Hello, world!");
        assertFalse("Hello, world!" == myString);// Compare string references, which are different
        assertTrue("Hello, world!".equals(myString));// Compare string contents, which are definitely the same
    }
}
