package jeu_pirates;

import java.util.Random;

public class CaseKraken {
    private int nbCases;

    public CaseKraken(int nbCases) {
        this.nbCases = nbCases;
    }

    public int PositionKrakenAleatoire() {
        Random rand = new Random();
		return rand.nextInt(nbCases) + 1;
    }
}