package jeu_pirates;

public class Main {
	public static void main(String[] args) {
		Plateau plateau = new Plateau(6, 5);
		De de = new De(6);
		Pion pionRouge = new Pion("Rouge");
		int deResultatRouge = de.lancer();
		System.out.println("Le résultat du dé du joueur rouge est : " + deResultatRouge);
		pionRouge.avancer(deResultatRouge);
		System.out.println("Le pion rouge est maintenant à la case : " + pionRouge.getPosition());
		Pion pionBleu = new Pion("Bleu");
		int deResultatBleu = de.lancer();
		System.out.println("Le résultat du dé du joueur bleu est : " + deResultatBleu);
		pionBleu.avancer(deResultatBleu);
		System.out.println("Le pion bleu est maintenant à la case : " + pionBleu.getPosition());
		plateau.afficherPlateauAvecPion(pionRouge);
	}
}
