package com.hillel.fedorenko.lessons.lesson11;

public class Account {
    String name;
    String surname;
    int weight;
    int pressure;
    int steps;
    int dayOfBirth;
    int yearOfBirth;
    String mouthOfBirth;
    String email;
    long phoneNumber;
    int age;

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public Account(String name, String surname, int weight, int pressure, int steps, String email,
                   long phoneNumber, int yearOfBirth, String monthOfBirth, int dayOfBirth) {
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.dayOfBirth = dayOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.mouthOfBirth = monthOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = 2022 - yearOfBirth;
    }

    public void printAccountInfo() {
        System.out.println("Name : " + name);
        System.out.println("Surname : " + surname);
        System.out.println("Weight : " + weight);
        System.out.println("Pressure : " + pressure);
        System.out.println("Steps : " + steps);
        System.out.println("Date of birth : " + dayOfBirth + " " + mouthOfBirth + " " + yearOfBirth);
        System.out.println("Age : " + age);
        System.out.println("Email : " + email);
        System.out.println("Phone number : " + phoneNumber);
    }

}
