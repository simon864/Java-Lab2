package org.example;

public class Balance {
    public int leftWeight = 0;
    public int rightWeight = 0;

    public void addRight(int weight) {
        rightWeight += weight;
    }

    public void addLeft(int weight) {
        leftWeight += weight;
    }

    public String result() {
        if (leftWeight == rightWeight) {
            return "=";
        } else if (rightWeight > leftWeight) {
            return "R";
        } else {
            return "L";
        }
    }
}
