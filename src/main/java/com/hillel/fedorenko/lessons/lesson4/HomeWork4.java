package com.hillel.fedorenko.lessons.lesson4;

import static com.hillel.fedorenko.lessons.lesson4.Person.personInfo;

public class HomeWork4 {
    public static void main(String[] args) {
        //task #1
        System.out.println(personInfo("Will", "Smith", "New York", 2936729462846L));
        System.out.println(personInfo("Jackie", "Chan", "Shanghai", 12312412412L));
        System.out.println(personInfo("Sherlock", "Holmes", "London", 37742123513L));

        //task *
        System.out.println(getFactorial(5));
    }

    public static long getFactorial(long f) {
        if (f <= 1) {
            return 1;
        }
        else {
            return f * getFactorial(f - 1);
        }
    }
}
