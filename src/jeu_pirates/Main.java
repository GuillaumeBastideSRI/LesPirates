package jeu_pirates;

public class Main {
    public static void main(String[] args) {
        int nombreCases = 30;
        Plateau plateau = new Plateau(6, 5);
        De de = new De(6);
        CaseKraken kraken = new CaseKraken(nombreCases);
        CasePerroquet perroquet = new CasePerroquet(nombreCases);

        System.out.println("R�gles du jeu");
        System.out.println("Le Kraken est � la case : " + kraken.getPositionKraken());
        System.out.println("Le Perroquet est � la case : " + perroquet.getPositionPerroquet());
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

        plateau.afficherPlateauAvecElements(pionRouge, pionBleu, kraken, perroquet);
    }
}
