package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalanceTest {

    @Test
    void addRight() {
        Balance balance = new Balance();
        balance.addRight(5);
        assertEquals(5, balance.rightWeight);
    }

    @Test
    void addLeft() {
        Balance balance = new Balance();
        balance.addLeft(3);
        assertEquals(3, balance.leftWeight);
    }

    @Test
    void result() {
        Balance balance = new Balance();

        // Проверка равенства весов
        balance.addRight(5);
        balance.addLeft(5);
        assertEquals("=", balance.result());

        // Проверка правой чаши тяжелее
        balance.addRight(2);
        assertEquals("R", balance.result());

        // Проверка левой чаши тяжелее
        balance.addLeft(3);
        assertEquals("L", balance.result());
    }
}