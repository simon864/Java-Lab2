package org.example;

public class Button {
    public int clickCount = 0;

    public void click() {
        clickCount++;
        System.out.println("Number of clicks: " + clickCount);
    }
}
