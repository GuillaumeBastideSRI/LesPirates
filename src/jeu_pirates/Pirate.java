package jeu_pirates;

public class Pirate {
    protected String nom;
    private int vie = 5;

    public Pirate(String nom) {
        this.nom = nom;
    }

    public void perdreVie(int points) {
        if (!estInvincible()) {
            vie -= points;
            if (vie < 0) {
                vie = 0;
            }
        }
    }

    protected boolean estInvincible() {
        return false;
    }

    public int getVie() {
        return vie;
    }

    public String getNom() {
        return nom;
    }

	public int getPosition() {
		return 0;
	}
}
