package org.example;

public class Table {
    private int[][] table;

    public Table(int rows, int cols) {
        table = new int[rows][cols];
    }

    public int getValue(int row, int col) {
        return table[row][col];
    }

    public void setValue(int row, int col, int value) {
        table[row][col] = value;
    }

    public int rows() {
        return table.length;
    }

    public int cols() {
        return table[0].length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                sb.append(table[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public double average() {
        int sum = 0;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                sum += table[i][j];
            }
        }
        return (double) sum / (table.length * table[0].length);
    }
}
