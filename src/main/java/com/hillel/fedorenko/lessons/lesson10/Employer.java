package com.hillel.fedorenko.lessons.lesson10;

public class Employer {
    String name;
    String position;
    String email;
    long phoneNumber;
    long salary;
    int age;

    public Employer(String name, String position, String email, long phoneNumber, long salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void showinfo() {
        System.out.println("Name : " + name);
        System.out.println("Position : " + position);
        System.out.println("Email : " + email);
        System.out.println("PhoneNumber : " + phoneNumber);
        System.out.println("Salary : " + salary);
        System.out.println("Age : " + age);
    }
}
