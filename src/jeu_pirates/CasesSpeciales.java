package jeu_pirates;

public interface CasesSpeciales {
	int getPositionKraken();

	int getPositionPerroquet();

	int getPositionPotion();

	void rendreInvincible(Pion joueur);

	boolean estInvincible(Pion joueur);

	void retirerInvincibilite(Pion joueur);

	void utiliser(Pion joueur);
}
