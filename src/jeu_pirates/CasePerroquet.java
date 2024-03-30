package jeu_pirates;

import java.util.ArrayList;
import java.util.List;

public class CasePerroquet extends Case {
    private List<Pion> joueursInvincibles;

    public CasePerroquet(int nbCases) {
        super(nbCases);
        this.joueursInvincibles = new ArrayList<>();
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
