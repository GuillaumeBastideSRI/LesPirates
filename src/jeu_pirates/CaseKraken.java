package jeu_pirates;

import java.util.Random;

public class CaseKraken {
    private int nbCases;
    private int positionKraken;

    public CaseKraken(int nbCases) {
        this.nbCases = nbCases;
        this.positionKraken = positionKrakenAleatoire();
    }

    private int positionKrakenAleatoire() {
        return new Random().nextInt(nbCases) + 1;
    }

    public int getPositionKraken() {
        return positionKraken;
    }

    public void attaquerPirate(Pirate pirate) {
        if (pirate.getPosition() == positionKraken) {
            pirate.perdreVie(4);
        }
    }
}

