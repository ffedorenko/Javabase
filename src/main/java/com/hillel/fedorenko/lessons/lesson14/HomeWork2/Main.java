package com.hillel.fedorenko.lessons.lesson14.HomeWork2;

public class Main {
    public static void main(String[] args) {
        PopMusic popMusic = new PopMusic();
        RockMusic rockMusic = new RockMusic();
        ClassicMusic classicMusic = new ClassicMusic();

        MusicStyles[] musicStyles = {popMusic, rockMusic, classicMusic};

        for (MusicStyles musicStyle : musicStyles) {
            musicStyle.playMusic();
        }
    }
}
