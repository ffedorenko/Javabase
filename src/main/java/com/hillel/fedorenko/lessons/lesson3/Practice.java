package com.hillel.fedorenko.lessons.lesson3;

import org.w3c.dom.ls.LSOutput;

public class Practice {
    public static void main(String[] args) {
    /*
    int a = 2;
    int b = -3;
    int c = 16;
    double result = Math.abs(a - b) / (a + b) * 3 - Math.sqrt(c);
    double result2 = (a + b) / 12 * c % 4 + Math.abs(b);


    double salary1 = 500;
    double salary2 = 1500;
    double salary3 = 3500;

    double salary1For10Years = salary1 * 128;
    double salary2For10Years = salary2 * 128;
    double salary3For10Years = salary3 * 128;

        System.out.println(salary1For10Years);
        System.out.println(salary2For10Years);
        System.out.println(salary3For10Years);

     */

        float ball1 = 1f;
        float ball2 = 0.5f;
        float ball3 = 0.2f;
        final float DESTINY_FACTOR = 0.7f;


        double  volumeBall1 = (double) 4 / 3 * Math.PI * Math.pow(ball1, 3);
        double  volumeBall2 = (double) 4 / 3 * Math.PI * Math.pow(ball2, 3);
        double  volumeBall3 = (double) 4 / 3 * Math.PI * Math.pow(ball3, 3);
        System.out.println(volumeBall1);
        System.out.println(volumeBall2);
        System.out.println(volumeBall3);
    }
}
