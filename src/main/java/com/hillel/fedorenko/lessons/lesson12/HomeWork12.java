package com.hillel.fedorenko.lessons.lesson12;

public class HomeWork12 {
    public static void main(String[] args) {
    }

    public double arithmeticArray(int[][] array) {
        double sum = 0;
        int amount = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                amount++;
            }
        }
        return sum / amount;
    }

    public boolean quadCheck(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length) {
                return false;
            }
        }
        return true;
    }
}
