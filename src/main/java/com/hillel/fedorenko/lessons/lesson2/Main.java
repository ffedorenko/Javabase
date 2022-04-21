package com.hillel.fedorenko.lessons.lesson2;

public class Main {
    public static void main(String[] args){

        byte byteMin = (byte) -128;
        byte byteMax = 127;

        System.out.println(byteMin);
        System.out.println(byteMax);

        short shortMin = -32768;

        int someInt = 1_000_000_000;

        long someLong = 2323233232L;

        float floatUsd = 33.55345F;

        double doubleUsd = 33.5534543243;

        System.out.println(floatUsd);
        System.out.println(doubleUsd);

        char charVariant1 = 'A';
        char charVariant2 = 65;
        char charVariant3 = '\u0041';

        System.out.println(charVariant1);
        System.out.println(charVariant2);
        System.out.println(charVariant3);

        String someString = """
                Hello World
                fdgfdgdsgdfsdf
                dfgdfgsgsfd
                dsfsdfsdf
                sdfdsfsdfsdfdsf
                """;

        byte byteMin2; // 0
        Byte byteRef = null; // null
        Byte byteRef2 = 0;
        Byte byteRef3 = new Byte((byte) 11);
        System.out.println(byteRef3);
        System.out.println(byteRef3.floatValue());


    }
}