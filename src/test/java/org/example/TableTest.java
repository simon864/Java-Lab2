package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {

    @Test
    void getValue() {
        Table table = new Table(2, 3);
        table.setValue(0, 1, 5);
        table.setValue(1, 0, 10);
        assertEquals(5, table.getValue(0, 1));
        assertEquals(10, table.getValue(1, 0));
    }

    @Test
    void setValue() {
        Table table = new Table(2, 3);
        table.setValue(0, 1, 5);
        assertEquals(5, table.getValue(0, 1));
    }

    @Test
    void rows() {
        Table table = new Table(2, 3);
        assertEquals(2, table.rows());
    }

    @Test
    void cols() {
        Table table = new Table(2, 3);
        assertEquals(3, table.cols());
    }

    @Test
    void testToString() {
        Table table = new Table(2, 3);
        table.setValue(0, 1, 5);
        table.setValue(1, 0, 10);
        assertEquals("0 5 0 \n10 0 0 \n", table.toString());
    }

    @Test
    void average() {
        Table table = new Table(2, 3);
        table.setValue(0, 1, 5);
        table.setValue(1, 0, 10);
        assertEquals(2.5, table.average());
    }
}