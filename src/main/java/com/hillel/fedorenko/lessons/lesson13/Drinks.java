package com.hillel.fedorenko.lessons.lesson13;

import java.util.function.DoubleToIntFunction;

public class Drinks {
    public static final int PRICE_COFFEE = 2;
    public static final int PRICE_TEA = 1;
    public static final int PRICE_LEMONADE = 2;
    public static final int PRICE_MOJITO = 4;
    public static final int PRICE_MINERAL_WATER = 1;
    public static final int PRICE_COCA_COLA = 2;

    public static int counter = 0;
    public static int sum = 0;

    public Drinks(DrinksMachine drinksMachine) {
        counter++;
        switch (drinksMachine) {
            case COFFEE -> {
                sum += PRICE_COFFEE;
                System.out.println("Вам налили Кофе");
            }
            case TEA -> {
                sum += PRICE_TEA;
                System.out.println("Вам налили чай");
            }
            case LEMONADE -> {
                sum += PRICE_LEMONADE;
                System.out.println("Вам налили лимонад");
            }
            case MOJITO -> {
                sum += PRICE_MOJITO;
                System.out.println("Вам налили мохито");
            }
            case MINERAL_WATER -> {
                sum += PRICE_MINERAL_WATER;
                System.out.println("Вам налили минералку");
            }
            case COCA_COLA -> {
                sum += PRICE_COCA_COLA;
                System.out.println("Вам налили кока-колу");
            }
        }
    }
}
