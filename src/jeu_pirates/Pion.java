package jeu_pirates;

public class Pion extends Pirate {
    private String couleur;
    private int position = 1;

    public Pion(String couleur, String nom) {
        this.couleur = couleur;
        super (nom);
    }

    public void avancer(int nbCases) {
        position += nbCases;
    }

    public int getPosition() {
        return position;
    }
        
    public void utiliserPotion() {
    	this.estInvincible = true;
    }
    
    private boolean estInvincible;
}
