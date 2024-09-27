package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ButtonTest {

    @Test
    void click() {
        Button button = new Button();
        button.click();
        assertEquals(1, button.clickCount);

        button.click();
        assertEquals(2, button.clickCount);
    }

}