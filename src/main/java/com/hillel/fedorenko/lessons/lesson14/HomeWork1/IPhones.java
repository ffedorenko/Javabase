package com.hillel.fedorenko.lessons.lesson14.HomeWork1;

public class IPhones implements Smartphones, IOS{
    @Override
    public void call() {
        System.out.println("FaceTime");
    }

    @Override
    public void sms() {
        System.out.println("iMessage");
    }

    @Override
    public void internet() {
        System.out.println("Safari");
    }

    @Override
    public void airdrop() {
        System.out.println("Enable wifi for airdrop");
    }
}
