package com.hillel.fedorenko.lessons.lesson11;

public class Burger {
    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Your Burger:" + "\n" + "Bun: " + bun + "\n" + "Meat: " + meat + "\n" + "Cheese: " + cheese + "\n"
                + "Greens: " + greens + "\n" + "Mayonnaise: " + mayonnaise);
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Your Burger:" + "\n" + "Bun: " + bun + "\n" + "Meat: " + meat + "\n" + "Cheese: " + cheese + "\n"
                + "Greens: " + greens);
    }

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise, String extrameat) {
        this.bun = bun;
        this.meat = extrameat + " " + meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Your Burger:" + "\n" + "Bun: " + bun + "\n" + "Meat: " + extrameat + " " + meat + "\n" + "Cheese: " + cheese + "\n"
                + "Greens: " + greens + "\n" + "Mayonnaise: " + mayonnaise);
    }
}
