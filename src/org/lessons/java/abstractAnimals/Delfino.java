package org.lessons.java.abstractAnimals;

public class Delfino extends Animale implements INuotante {
    @Override
    public void verso() {
        System.out.println("Eeeh!");
    }

    @Override
    public void mangia() {
        System.out.println("Io mangio plancton");
    }

    @Override
    public void nuota() {
        System.out.println("Il delfino sta nuotando!");
    }

}
