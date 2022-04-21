package com.hillel.fedorenko.lessons.lesson7;

import java.util.Arrays;

public class HomeWork7 {
    public static void main(String[] args) {
//        System.out.println("Task №1");
//        task1();
//        System.out.println("Task №2");
//        task2();
        System.out.println("Task №3");
        //task #3*
        int[] firstArray = new int[10];
        int[] secondArray = new int[20];

        for (int i = 0; i < arrayCompare(firstArray, secondArray); i++) {
            if (i < firstArray.length) {
                firstArray[i] = randomTask2();
            }
            if (i < secondArray.length) {
                secondArray[i] = randomTask2();
            }
        }
        System.out.println("Source : " + Arrays.toString(secondArray));
        System.out.println("Target : " + Arrays.toString(firstArray));
        System.out.println(Arrays.toString(arrayCopy(firstArray, secondArray)));
    }

    public static void task1() {
        int[] team1 = new int[25];
        int[] team2 = new int[25];

        for (int i = 0; i < team1.length; i++) {
            team1[i] = randomTask1();
            team2[i] = randomTask1();
        }

        System.out.println(Arrays.toString(team1));
        System.out.println(Arrays.toString(team2));

        float average1 = 0;
        float average2 = 0;

        for (int i = 0; i < team1.length; i++) {
            average1 += team1[i];
            average2 += team2[i];
        }

        average1 /= team1.length;
        average2 /= team2.length;

        System.out.println("Average age of team1 : " + average1);
        System.out.println("Average age of team2 : " + average2);

    }

    public static int randomTask1() {
        return (int) (Math.random() * (41 - 18) + 18);
    }

    public static void task2() {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = randomTask2();
        }
        System.out.println(Arrays.toString(array));

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Max number : " + max + "\n" + "Min number : " + min);
    }

    public static int randomTask2() {
        return (int) (Math.random() * 100 + 1);
    }

    public static int[] arrayCopy(int[] arrayTarget, int[] arraySource) {
        int[] resultArray = new int[arrayTarget.length + arraySource.length];
        int index = 0;
        for (int i = 0; i < resultArray.length; i++) {
            if (i < arrayTarget.length) {
                resultArray[i] = arrayTarget[i];
            } else {
                resultArray[i] = arraySource[index];
                index++;
            }
        }
        return resultArray;
    }

    public static int arrayCompare(int[] array1, int[] array2) {
        return Math.max(array1.length, array2.length);
    }
}
