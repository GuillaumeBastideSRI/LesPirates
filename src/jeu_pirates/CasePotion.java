package jeu_pirates;

import java.util.Random;

public class CasePotion {
    private int nbCases;

    public CasePotion(int nbCases) {
        this.nbCases = nbCases;
    }

    public int PositionPotionAleatoire() {
        Random rand = new Random();
		return rand.nextInt(nbCases) + 1;
    }
}
