package com.hillel.fedorenko.lessons.lesson13;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        drinkMachine();

        System.out.println("Количество напитков: " + Drinks.counter);
        System.out.println("С вас: " + Drinks.sum + "$");
    }

    public static void drinkMachine() {
        Scanner scanner = new Scanner(System.in);
        DrinksMachine drinksMachine = null;
        boolean stop = false;
        System.out.println("Выберите напиток: " + Arrays.toString(DrinksMachine.values()));
        System.out.println("Когда закончите выбор одного или нескольких напитков - введите 0");
        while (true) {
            while (!stop) {
                String str = scanner.next();
                try {
                    drinksMachine = DrinksMachine.valueOf(str);
                    break;
                } catch (IllegalArgumentException e) {
                    stop = str.equals("0");
                }
            }
            if (stop) {
                break;
            } else {
                new Drinks(drinksMachine);
            }
        }
    }
}
