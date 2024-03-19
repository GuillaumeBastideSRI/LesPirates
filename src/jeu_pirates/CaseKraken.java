package jeu_pirates;

import java.util.Random;

public class CaseKraken {
    private int nbCases;
    private int positionKraken;

    public CaseKraken(int nbCases) {
        this.nbCases = nbCases;
        this.positionKraken = PositionKrakenAleatoire();
    }

    private int PositionKrakenAleatoire() {
        Random rand = new Random();
        return rand.nextInt(nbCases) + 1;
    }

    public int getPositionKraken() {
        return positionKraken;
    }
}
