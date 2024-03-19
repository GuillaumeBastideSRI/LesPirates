package jeu_pirates;

public class Main {
    public static void main(String[] args) {
        int nombreCases = 30;
        Plateau plateau = new Plateau(6, 5);
        De de = new De(6);
        CaseKraken kraken = new CaseKraken(nombreCases);
        CasePerroquet perroquet = new CasePerroquet(nombreCases);

        System.out.println("Règles du jeu");
        System.out.println("Le Kraken est à la case : " + kraken.getPositionKraken());
        System.out.println("Le Perroquet est à la case : " + perroquet.getPositionPerroquet());
        System.out.println("La Potion est cachée sur la carte et peut être trouvée par le Perroquet");

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

        plateau.afficherPlateauAvecElements(pionRouge, pionBleu, kraken, perroquet);
    }
}
