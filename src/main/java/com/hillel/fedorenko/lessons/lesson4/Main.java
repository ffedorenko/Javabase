package com.hillel.fedorenko.lessons.lesson4;

public class Main {
    public static void main(String[] args) {
        System.out.println(year(4));;
    }
    public static boolean year(int n) {
        float a = (float) n / 4;
        float b = (float) n / 400;
        float c = (float) n / 100;
        boolean result = true;
        if (b % 1 == 0) {
            return  result;
        }
        else if (c % 1 == 0) {
            result = false;
        }
        else if (a % 1 == 0) {
            return result;
        }
        else {
            result = false;
        }
        return result;
    }
}
