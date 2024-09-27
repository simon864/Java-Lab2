package org.example;

public class Bell {
    private boolean ding = true;

    public String sound() {
        if (ding) {
            ding = false;
            return "ding";
        } else {
            ding = true;
            return  "dong";
        }
    }
}
