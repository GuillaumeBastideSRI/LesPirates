package jeu_pirates;

public class Pirate {
    private String nom;
    private int vie = 5;
    private int position = 1;

    public Pirate(String nom) {
        this.nom = nom;
    }

    public void perdreVie(int points) {
        vie -= points;
        if (vie < 0) {
            vie = 0;
        }
    }

    public int getVie() {
        return vie;
    }

    public int getPosition() {
        return position;
    }

    public String getNom() {
        return nom;
    }
}
