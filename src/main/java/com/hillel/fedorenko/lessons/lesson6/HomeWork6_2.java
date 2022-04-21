package com.hillel.fedorenko.lessons.lesson6;

public class HomeWork6_2 {
    public static void main(String[] args) {
        int shuttleNumber = 0;
        int countShuttles = 0;

        for (int i = 1; countShuttles < 100; i++) {
            shuttleNumber = i;
            if (i % 10 == 4 || i % 10 == 9 || i / 10 == 4 || i / 10 == 9 ||
                    i / 10 == 14 || i / 10 == 19) {
                continue;
            } else {
                countShuttles++;
                System.out.println("Count of shuttles : " + countShuttles);
                System.out.println("Number of shuttle : " + shuttleNumber);
                System.out.println();
            }
        }
    }
}
