package jeu_pirates;

import java.util.Random;

public class Kraken {
    private int nbCases;

    public Kraken(int nbCases) {
        this.nbCases = nbCases;
    }

    public int PositionKrakenAleatoire() {
        Random rand = new Random();
		return rand.nextInt(nbCases) + 1;
    }
}