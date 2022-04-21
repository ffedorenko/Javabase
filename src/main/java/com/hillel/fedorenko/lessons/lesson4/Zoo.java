package com.hillel.fedorenko.lessons.lesson4;

public class Zoo {

    public static final double COEFICIENT_BEARS = 1.3;
    public static final double COEFICIENT_TIGERS = 1.2;
    public static final double COEFICIENT_PARROTS = 1.4;
    public static final double COEFICIENT_ELEPH = 1.05;
    public static final double COEFICIENT_RACCONS = 1.8;

    public static void main(String[] args) {

        int min = 2;
        int max = 30;
        int bears = getCount(min, max);
        int tigers = getCount(min, max);
        int parrots = getCount(min, max);
        int eleph = getCount(min, max);
        int raccons = getCount(min, max);

        System.out.println("bears = " + bears);
        System.out.println("tigers = " + tigers);
        System.out.println("parrots = " + parrots);
        System.out.println("eleph = " + eleph);
        System.out.println("raccons = " + raccons);

        int countAnimals = countAnimals(bears, tigers, parrots, eleph, raccons);
        System.out.println("Count animals = " + countAnimals);

        int countAnimalsNextYear = countAnimalsNextYear(bears, tigers, parrots, eleph, raccons);
        System.out.println("Count animals after Year = " + countAnimalsNextYear);
    }

    public static int getCount(int min, int max) {
        int result = (int) (Math.random() * (max - min) + min);
        return result;
    }

    public static int countAnimals(int bears, int tigers, int parrots, int eleph, int raccons) {
        int result = bears + tigers + parrots + eleph + raccons;
        return result;
    }

    public static int countAnimalsNextYear(int bears, int tigers, int parrots, int eleph, int raccons) {
        int result = (int) (bears * COEFICIENT_BEARS)
                + (int) (tigers * COEFICIENT_TIGERS)
                + (int) (parrots * COEFICIENT_PARROTS)
                + (int) (eleph * COEFICIENT_ELEPH)
                + (int) (raccons * COEFICIENT_RACCONS);
        return result;
    }
}
