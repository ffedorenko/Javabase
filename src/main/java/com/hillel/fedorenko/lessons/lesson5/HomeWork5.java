package com.hillel.fedorenko.lessons.lesson5;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        //task#1
        Scanner scanner = new Scanner(System.in);
        String teamA = "Good guy's";
        System.out.println("Frags Good guy's player1 : ");
        int playerA1 = scanner.nextInt();
        System.out.println("Frags Good guy's player2 : ");
        int playerA2 = scanner.nextInt();
        System.out.println("Frags Good guy's player3 : ");
        int playerA3 = scanner.nextInt();
        System.out.println("Frags Good guy's player4 : ");
        int playerA4 = scanner.nextInt();
        System.out.println("Frags Good guy's player5 : ");
        int playerA5 = scanner.nextInt();

        String teamB = "Bad guy's";
        System.out.println("Frags Bad guy's player1 : ");
        int playerB1 = scanner.nextInt();
        System.out.println("Frags Bad guy's player2 : ");
        int playerB2 = scanner.nextInt();
        System.out.println("Frags Bad guy's player3 : ");
        int playerB3 = scanner.nextInt();
        System.out.println("Frags Bad guy's player4 : ");
        int playerB4 = scanner.nextInt();
        System.out.println("Frags Bad guy's player5 : ");
        int playerB5 = scanner.nextInt();

        float resultA = (float) (playerA1 + playerA2 + playerA3 + playerA4 + playerA5) / 5;
        float resultB = (float) (playerB1 + playerB2 + playerB3 + playerB4 + playerB5) / 5;

        if (resultA > resultB) {
            System.out.println("Победила команда " + teamA + " набравшая " + resultA + " очков");
        } else {
            System.out.println("Победила команда " + teamB + " набравшая " + resultB + " очков");
        }

        System.out.println(year(400));
        System.out.println(akkerman(3, 3));
    }

    //task#2*
    public static boolean year(int n) {
        float a = (float) n / 4;
        float b = (float) n / 400;
        float c = (float) n / 100;
        boolean result = true;
        if (b % 1 == 0) {
            return result;
        } else if (c % 1 == 0) {
            result = false;
        } else if (a % 1 == 0) {
            return result;
        } else {
            result = false;
        }
        return result;
    }

    //task #3*
    public static int akkerman(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (n == 0 && m > 0) {
            return akkerman(m - 1, 1);
        } else {
            return akkerman(m - 1, akkerman(m, n - 1));
        }
    }
}
