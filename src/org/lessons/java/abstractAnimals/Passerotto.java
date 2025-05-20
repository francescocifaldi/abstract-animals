package org.lessons.java.abstractAnimals;

public class Passerotto extends Animale implements IVolante {
    @Override
    public void verso() {
        System.out.println("Cip!");
    }

    @Override
    public void mangia() {
        System.out.println("Io mangio semi");
    }

    @Override
    public void vola() {
        System.out.println("Il passerotto sta volando!");
    }

}
