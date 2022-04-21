package com.hillel.fedorenko.lessons.lesson4;

public class Person {
    public static String personInfo(String name, String lastName, String city, long number) {
        String call = "Позвонить гражданину " + name + " " + lastName
                + " из города " + city
                + " можно по номеру " + number;
        return call;
    }
}
