package jeu_pirates;

public class CaseKraken extends Case {
    public CaseKraken(int nbCases) {
        super(nbCases);
    }

    public void attaquerPirate(Pirate pirate) {
        if (pirate.getPosition() == position) {
            pirate.perdreVie(5);
            System.out.println("Le Kraken attaque le pirate " + pirate.getNom() + " !");
        }
    }
}
