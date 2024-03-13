package jeu_pirates;

import java.util.Random;

public class CasePerroquet {
    private int nbCases;

    public CasePerroquet(int nbCases) {
        this.nbCases = nbCases;
    }

    public int PositionPerroquetAleatoire() {
        Random rand = new Random();
		return rand.nextInt(nbCases) + 1;
    }
}