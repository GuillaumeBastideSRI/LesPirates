package jeu_pirates;

public class Main {
	public static void main(String[] args) {
		Plateau plateau = new Plateau(6, 5);
		De de = new De(6);
		CaseKraken caseKraken = new CaseKraken(30);
		CasePerroquet casePerroquet = new CasePerroquet(30);
		CasePotion casePotion = new CasePotion(30);
		System.out.println("R�gles du jeu");
		System.out.println("Le Kraken est � la case : " + caseKraken.PositionKrakenAleatoire());
		System.out.println("Le Perroquet est � la case : " + casePerroquet.PositionPerroquetAleatoire());
		System.out.println("La Potion est cach�e sur la carte et peut �tre trouv�e par le Perroquet");
		Pion pionRouge = new Pion("Rouge");
		int deResultatRouge = de.lancer();
		System.out.println("Le r�sultat du d� du joueur rouge est : " + deResultatRouge);
		pionRouge.avancer(deResultatRouge);
		System.out.println("Le pion rouge est maintenant � la case : " + pionRouge.getPosition());
		Pion pionBleu = new Pion("Bleu");
		int deResultatBleu = de.lancer();
		System.out.println("Le r�sultat du d� du joueur bleu est : " + deResultatBleu);
		pionBleu.avancer(deResultatBleu);
		System.out.println("Le pion bleu est maintenant � la case : " + pionBleu.getPosition());
		plateau.afficherPlateauAvecPion(pionRouge);
	}
}
