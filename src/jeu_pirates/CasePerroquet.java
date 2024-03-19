package jeu_pirates;

import java.util.Random;

public class CasePerroquet {
    private int nbCases;
    private int positionPerroquet;

    public CasePerroquet(int nbCases) {
        this.nbCases = nbCases;
        this.positionPerroquet = PositionPerroquetAleatoire();
    }

    private int PositionPerroquetAleatoire() {
        Random rand = new Random();
        return rand.nextInt(nbCases) + 1;
    }

    public int getPositionPerroquet() {
        return positionPerroquet;
    }
}
