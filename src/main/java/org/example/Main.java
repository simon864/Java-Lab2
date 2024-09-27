package org.example;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        System.out.println("BUTTON-TASK1:");
        Button button = new Button();
        button.click();
        button.click();

        System.out.println("BALANCE-TASK2:");
        Balance balance = new Balance();
        balance.addRight(5);
        balance.addLeft(3);
        System.out.println(balance.result());

        System.out.println("BELL-TASK3:");
        Bell bell = new Bell();
        System.out.println(bell.sound());
        System.out.println(bell.sound());
        System.out.println(bell.sound());

        System.out.println("OddEvenSeparator-TASK4:");
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(10);
        separator.addNumber(5);
        separator.addNumber(7);
        separator.addNumber(2);
        separator.even();
        separator.odd();

        System.out.println("TABLE-TASK5:");
        Table table = new Table(2, 3);
        table.setValue(0, 1, 5);
        table.setValue(1, 0, 10);
        System.out.println(table.toString());
        System.out.println("average value: " + table.average());
    }
}