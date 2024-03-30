package jeu_pirates;

public class Plateau {
	private int[][] cases;
	private int nbLignes;
	private int nbColonnes;

	public Plateau(int lignes, int colonnes) {
		this.nbLignes = lignes;
		this.nbColonnes = colonnes;
		this.cases = new int[lignes][colonnes];
		initialiserPlateau();
	}

	private void initialiserPlateau() {
		int valeur = 1;
		for (int ligne = 0; ligne < nbLignes; ligne++) {
			if (ligne % 2 == 0) {
				for (int colonne = 0; colonne < nbColonnes; colonne++) {
					cases[ligne][colonne] = valeur++;
				}
			} else {
				for (int colonne = nbColonnes - 1; colonne >= 0; colonne--) {
					cases[ligne][colonne] = valeur++;
				}
			}
		}
	}

	public void afficherPlateau() {
		for (int ligne = 0; ligne < nbLignes; ligne++) {
			for (int colonne = 0; colonne < nbColonnes; colonne++) {
				System.out.print(cases[ligne][colonne] + "\t");
			}
			System.out.println();
		}
	}

	public void afficherPlateauAvecElements(Pion pionRouge, Pion pionBleu, CaseKraken kraken, CasePerroquet perroquet) {
	    String[][] plateauAvecPion = new String[nbLignes][nbColonnes];
	    int positionPionRouge = pionRouge.getPosition();
	    int positionPionBleu = pionBleu.getPosition();
	    int positionKraken = kraken.getPosition();
	    int positionPerroquet = perroquet.getPosition();

	    for (int ligne = 0; ligne < nbLignes; ligne++) {
	        for (int colonne = 0; colonne < nbColonnes; colonne++) {
	            if (cases[ligne][colonne] == positionPionRouge && cases[ligne][colonne] == positionPionBleu) {
	                plateauAvecPion[ligne][colonne] = "D";
	            } else if (cases[ligne][colonne] == positionPionRouge) {
	                plateauAvecPion[ligne][colonne] = "PR";
	            } else if (cases[ligne][colonne] == positionPionBleu) {
	                plateauAvecPion[ligne][colonne] = "PB";
	            } else if (cases[ligne][colonne] == positionKraken) {
	                plateauAvecPion[ligne][colonne] = "K";
	            } else if (cases[ligne][colonne] == positionPerroquet) {
	                plateauAvecPion[ligne][colonne] = "P";
	            } else {
	                plateauAvecPion[ligne][colonne] = Integer.toString(cases[ligne][colonne]);
	            }
	        }
	    }

	    for (int ligne = 0; ligne < nbLignes; ligne++) {
	        for (int colonne = 0; colonne < nbColonnes; colonne++) {
	            System.out.print(plateauAvecPion[ligne][colonne] + "\t");
	        }
	        System.out.println();
	    }
	}
	
	public int[][] getCases() {
		return cases;
	}

	public int getNbLignes() {
		return nbLignes;
	}

	public int getNbColonnes() {
		return nbColonnes;
	}
}
