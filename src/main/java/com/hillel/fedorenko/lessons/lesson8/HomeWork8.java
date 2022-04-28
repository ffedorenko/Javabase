package com.hillel.fedorenko.lessons.lesson8;

import java.util.Arrays;

public class HomeWork8 {
    public static void main(String[] args) {

        int[] companyNumbers = new int[7];
        int[] personNumbers = new int[7];
        int counter = 0;

        for (int i = 0; i < companyNumbers.length; i++) {
            companyNumbers[i] = random();
            personNumbers[i] = random();
        }

        Arrays.sort(companyNumbers);
        Arrays.sort(personNumbers);

        for (int i = 0; i < personNumbers.length; i++) {
            if (personNumbers[i] == companyNumbers[i]) {
                counter++;
            }
        }

        System.out.println(Arrays.toString(companyNumbers));
        System.out.println(Arrays.toString(personNumbers));
        System.out.println("Количество совпадений : " + counter);
    }

    public static int random() {
        return (int) (Math.random() * 10);
    }
}
