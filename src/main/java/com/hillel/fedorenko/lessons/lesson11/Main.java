package com.hillel.fedorenko.lessons.lesson11;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("Fedor", "Fedorenko", 85, 120, 1000, "helenko81@gmail.com", 380685351419L, 1999, "Feb", 21);
        Account account2 = new Account("Artem", "Lusenko", 75, 135, 500, "artem12345@ukr.net", 38932188777L, 1998, "Oct", 12);
        Account account3 = new Account("Vladimir", "Mihailovich", 78, 125, 1500, "vladimirmih97", 380737528798L, 1997, "Sep", 15);
        account1.printAccountInfo();
        System.out.println();
        account2.printAccountInfo();
        System.out.println();
        account3.printAccountInfo();
        System.out.println();

        account1.setSteps(2000);
        account1.setPressure(130);
        account1.setWeight(80);
        account1.printAccountInfo();
        System.out.println();

        account2.setSteps(100);
        account2.setWeight(82);
        account2.printAccountInfo();
    }
}
