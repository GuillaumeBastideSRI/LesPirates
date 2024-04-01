package jeu_pirates;

public interface CaseSpéciales {
	public interface Kraken {
	    int getPositionKraken();
	}
	public interface Perroquet {
	    int getPositionPerroquet();
	    int getPositionPotion();
	    void rendreInvincible(Pion joueur);
	    boolean estInvincible(Pion joueur);
	    void retirerInvincibilite(Pion joueur);
	}
	public interface Potion {
	    void utiliser(Pion joueur);
	}
}
