package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenSeparatorTest {

    @Test
    void addNumber() {
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(10);
        separator.addNumber(5);
        separator.addNumber(7);
        separator.addNumber(2);

        assertEquals("[10, 2]", separator.evenNumbers.toString());
        assertEquals("[5, 7]", separator.oddNumbers.toString());
    }

    @Test
    void even() {
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(10);
        separator.addNumber(5);
        separator.addNumber(7);
        separator.addNumber(2);
        assertEquals("[10, 2]", separator.evenNumbers.toString());
    }

    @Test
    void odd() {
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(10);
        separator.addNumber(5);
        separator.addNumber(7);
        separator.addNumber(2);
        assertEquals("[5, 7]", separator.oddNumbers.toString());
    }
}