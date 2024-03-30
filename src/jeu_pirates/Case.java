package jeu_pirates;

import java.util.Random;

public abstract class Case {
    protected int nbCases;
    protected int position;

    public Case(int nbCases) {
        this.nbCases = nbCases;
        this.position = genererPositionAleatoire();
    }

    protected int genererPositionAleatoire() {
        return new Random().nextInt(nbCases) + 1;
    }

    public int getPosition() {
        return position;
    }
}
