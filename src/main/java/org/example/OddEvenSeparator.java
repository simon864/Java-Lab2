package org.example;
import java.util.ArrayList;

public class OddEvenSeparator {
    public ArrayList<Integer> evenNumbers = new ArrayList<>();
    public ArrayList<Integer> oddNumbers = new ArrayList<>();

    public void addNumber(int number) {
        if (number % 2 == 0) {
            evenNumbers.add(number);
        } else {
            oddNumbers.add(number);
        }
    }

    public void even() {
        System.out.println("Even numbers: " + evenNumbers);
    }

    public void odd() {
        System.out.println("odd numbers: " + oddNumbers);
    }
}
