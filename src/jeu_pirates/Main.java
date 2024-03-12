package jeu_pirates;

public class Main {
    public static void main(String[] args) {
        Plateau plateau = new Plateau(6, 5);
        De de = new De(6);
        Pion pionRouge = new Pion("Rouge");
        int deResultat = de.lancer();
        System.out.println("Le résultat du dé est : " + deResultat);
        pionRouge.avancer(deResultat);
        System.out.println("Le pion rouge est maintenant à la case : " + pionRouge.getPosition());
        plateau.afficherPlateauAvecPion(pionRouge);
    }
}
