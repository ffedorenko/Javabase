package com.hillel.fedorenko.lessons.lesson6;

public class Main {
    public static void main(String[] args) {
//        System.out.println("start loop");
//        for (int i = 0; i < 100; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.println("j = " + j);

//        int i = 0;
//        while (i < 10) {
//            System.out.println(i);
//            i++;

//        int i = 0;
//        do {
//            System.out.println(i);
//        } while (i == 5);

//        bomb();
        System.out.println(getFactorial(1));
    }
    public static void bomb() {
        int timer = 10;
        boolean demined = false;
        while (timer > 0) {
            System.out.println(timer);

            int rand = (int) (Math.random() * 50);
            if (rand > 40) {
                System.out.println("good");
                demined = true;
                break;
            }
            timer--;
        }
        if (!demined) {
            System.out.println("BOOM!!!!");
        }
    }
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result += i;
        }
        return result;
    }
}
