package jeu_pirates;

public class Pion {
    private String couleur;
    private int position;

    public Pion(String couleur) {
        this.couleur = couleur;
        this.position = 1;
    }

    public void avancer(int nbCases) {
        position += nbCases;
    }

    public int getPosition() {
        return position;
    }
}
