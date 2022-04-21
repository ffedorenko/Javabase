package com.hillel.fedorenko.lessons.lesson3;

public class HomeWork3 {
    public static void main(String[] args) {
        //task #1
        int attackLiWarrior = 13;
        int attackLiArcher = 24;
        int attackLiHorseman = 46;
        int attackMinWarrior = 9;
        int attackMinArcher = 35;
        int attackMinHorseman = 12;

        int attackOfArmyLi = (attackLiWarrior + attackLiArcher + attackLiHorseman) * 860;
        System.out.println("Общая атака династии Ли = " + attackOfArmyLi);
        double attackOfArmyMin = (attackMinArcher + attackMinWarrior + attackMinHorseman) * 860 * 1.5;
        System.out.println("Общая атака династии Минь = " + (int) attackOfArmyMin);

        //task #2
        division();

        //task #3*
        randomizer(5000);
    }

    public static void division() {
        int a = 10, b = 3;
        System.out.println((double) a / b);
    }

    public static void randomizer(int n) {
        int a = (int) (Math.random() * (Math.abs(n) * 2 + 1) - Math.abs(n));
        System.out.println(a);
    }
}
