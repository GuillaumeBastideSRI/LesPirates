package jeu_pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CasePerroquet {
    private int nbCases;
    private int positionPerroquet;
    private List<Pion> joueursInvincibles;

    public CasePerroquet(int nbCases) {
        this.nbCases = nbCases;
        this.positionPerroquet = positionPerroquetAleatoire();
        this.joueursInvincibles = new ArrayList<>();
    }

    private int positionPerroquetAleatoire() {
        return new Random().nextInt(nbCases) + 1;
    }

    public int getPositionPerroquet() {
        return positionPerroquet;
    }

    public void rendreInvincible(Pion joueur) {
        joueursInvincibles.add(joueur);
    }

    public boolean estInvincible(Pion joueur) {
        return joueursInvincibles.contains(joueur);
    }

    public void retirerInvincibilite(Pion joueur) {
        joueursInvincibles.remove(joueur);
    }
}
