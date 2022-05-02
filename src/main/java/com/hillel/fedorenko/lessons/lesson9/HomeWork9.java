package com.hillel.fedorenko.lessons.lesson9;

import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter M of array");
        int m = inputCheck(scanner);

        System.out.println("Enter N of array");
        int n = inputCheck(scanner);


        int[][] source = new int[m][n];
        int[][] result = new int[n][m];

        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < source[i].length; j++) {
                source[i][j] = random();
            }
        }

        System.out.println("Original matrix");
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < source[i].length; j++) {
                System.out.print(source[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = source[j][i];
            }
        }

        System.out.println("New matrix");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
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

    public static int random() {
        return (int) (Math.random() * 10 + 1);
    }
}
