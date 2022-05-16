package com.hillel.fedorenko.lessons.lesson13;

public enum DrinksMachine {
    COFFEE("Кофе"),
    TEA("Чай"),
    LEMONADE("Лимонад"),
    MOJITO("Мохито"),
    MINERAL_WATER("Минералка"),
    COCA_COLA("Кока-кола");

    private final String title;
    private DrinksMachine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
