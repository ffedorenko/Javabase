package com.hillel.fedorenko.lessons.lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        float a = 5.5F;
        float b = 3.7F;
        float h = 7.4F;
        float volume = a * b * h;
        System.out.println("Объем параллелепипеда = " + volume);
        float length = (a + b + h) * 4;
        System.out.println("Сумма сторон параллелепипеда = " + length);

        //так как широта должна указыватся точно применяется тип double
        double latitude = 50.398709;
        double longtitude = 30.641956;
        System.out.println("Долгота : " + latitude + "\n" + "Широта : " + longtitude);
    }
}
