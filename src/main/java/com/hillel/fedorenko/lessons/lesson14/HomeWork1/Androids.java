package com.hillel.fedorenko.lessons.lesson14.HomeWork1;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Google phone");
    }

    @Override
    public void sms() {
        System.out.println("Android Messages");
    }

    @Override
    public void internet() {
        System.out.println("Google Chrome");
    }

    @Override
    public void root() {
        System.out.println("You have root");
    }
}
