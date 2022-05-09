package com.hillel.fedorenko.lessons.lesson11;

public class BurgerMain {
    public static void main(String[] args) {
        Burger burgerBeef = new Burger("Regular", "Beef", "Cheddar",
                "Onion", "Ketchup");
        System.out.println();

        Burger burgerDiet = new Burger("Gluten-free", "Chicken", "None", "Green Onion");

        System.out.println();

        Burger burgerExtraChicken = new Burger("Texas", "Chicken", "Emmental'",
                "Dill", "Mayonnaise classic", "Extra");
    }
}
