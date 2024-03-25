package jeu_pirates;

public class Affichage {
    public static void afficherPlateau(Plateau plateau) {
        int[][] cases = plateau.getCases();
        int nbLignes = plateau.getNbLignes();
        int nbColonnes = plateau.getNbColonnes();
        
        for (int ligne = 0; ligne < nbLignes; ligne++) {
            for (int colonne = 0; colonne < nbColonnes; colonne++) {
                System.out.print(cases[ligne][colonne] + "\t");
            }
            System.out.println();
        }
    }
}
