package jeu_pirates;

public class Pion extends Pirate {
    private String couleur;
    private int position = 1;
    private boolean estInvincible = false;

    public Pion(String nom, String couleur) {
        super(nom);
        this.couleur = couleur;
    }

    public void avancer(int nbCases) {
        position += nbCases;
    }

    public int getPosition() {
        return position;
    }

    public void utiliserPotion() {
        estInvincible = true;
    }

    @Override
    protected boolean estInvincible() {
        return estInvincible;
    }
}
