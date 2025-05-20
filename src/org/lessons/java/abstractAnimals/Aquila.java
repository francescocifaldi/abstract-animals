package org.lessons.java.abstractAnimals;

public class Aquila extends Animale implements IVolante {
    @Override
    public void verso() {
        System.out.println("Screech!");
    }

    @Override
    public void mangia() {
        System.out.println("Io mangio piccoli mammiferi.");
    }

    @Override
    public void vola() {
        System.out.println("L'Aquila sta volando!");
    }

}
