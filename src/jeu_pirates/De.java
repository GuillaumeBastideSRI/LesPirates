package jeu_pirates;

import java.util.Random;

public class De {
    private int nbFaces;

    public De(int nbFaces) {
        this.nbFaces = nbFaces;
    }

    public int lancer() {
        Random rand = new Random();
        return rand.nextInt(nbFaces) + 1;
    }
}