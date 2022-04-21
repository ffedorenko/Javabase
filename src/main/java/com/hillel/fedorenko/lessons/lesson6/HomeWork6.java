package com.hillel.fedorenko.lessons.lesson6;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            game();
            System.out.println("Play again? Press 1, for quit press 0");
        } while (inputCheck(scanner) == 1);
    }

    public static int inputCheck(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("ERROR! Wrong input");
                System.out.println("Enter number again!");
                scanner.next();
            }
        }
    }


    public static int randomizer() {
        return ((int) (Math.random() * 10)) + 1;
    }

    public static void game() {
        Scanner scanner = new Scanner(System.in);
        int attempt = 5;
        int randomNumber = randomizer();
        System.out.println("Make a guess from 1 to 10. You have 5 tries");
        do {
            attempt--;
            if (inputCheck(scanner) == randomNumber) {
                System.out.println("You're win!");
                break;
            } else {
                if (attempt > 0) {
                    System.out.println("Not right number! You have " + attempt + " tries");
                } else {
                    System.out.println("You are fail!");
                }
            }
        } while (attempt > 0);
    }
}