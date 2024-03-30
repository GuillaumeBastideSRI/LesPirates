package jeu_pirates;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            jouerUnePartie(scanner);
            System.out.println("Voulez-vous recommencer une partie ? (O/N)");
            String reponse = scanner.nextLine().toUpperCase();
            if (!reponse.equals("O")) {
                break;
            }
        }
        scanner.close();
    }

    public static void jouerUnePartie(Scanner scanner) {
        int nombreCases = 30;
        Plateau plateau = new Plateau(6, 5);
        De de = new De(6);
        CaseKraken kraken = new CaseKraken(nombreCases);
        CasePerroquet perroquet = new CasePerroquet(nombreCases);

        System.out.println("Règles du jeu");
        System.out.println("Le Kraken est à la case : " + kraken.getPosition());
        System.out.println("Le Perroquet est à la case : " + perroquet.getPosition());
        System.out.println("La Potion est cachée sur la carte et peut être trouvée par le Perroquet");

        Pion pionRouge = new Pion("Rouge");
        Pion pionBleu = new Pion("Bleu");

        while (true) {
            if (pionRouge != null) {
                System.out.println("Appuyez sur Entrée pour que le joueur rouge lance le dé et effectue son tour.");
                scanner.nextLine();
                int deResultatRouge = de.lancer();
                System.out.println("Le résultat du dé du joueur rouge est : " + deResultatRouge);

                int nouvellePositionRouge = pionRouge.getPosition() + deResultatRouge;
                if (nouvellePositionRouge >= nombreCases) {
                    System.out.println("Le joueur rouge a atteint la dernière case et a remporté la partie !");
                    break;
                } else {
                    pionRouge.avancer(deResultatRouge);
                    System.out.println("Le pion rouge est maintenant à la case : " + pionRouge.getPosition());
                }

                if (pionRouge.getPosition() == kraken.getPosition()) {
                    System.out.println("Le Kraken attaque le joueur rouge !");
                    pionRouge = null;
                    System.out.println("Le joueur rouge est mort !");
                }

                if (pionRouge != null && pionRouge.getPosition() == perroquet.getPosition()) {
                    System.out.println("Le joueur rouge a trouvé le perroquet !");
                    System.out.println("Le perroquet dit : Je vais chercher la potion à a case " + perroquet.getPosition());
                    System.out.println("Voulez-vous utiliser la potion ? (O/N)");
                    String reponsePotion = scanner.nextLine().toUpperCase();
                    if (reponsePotion.equals("O")) {
                        pionRouge.utiliserPotion();
                        System.out.println("Le joueur rouge a utilisé la potion et est maintenant invincible !");
                    }
                }
            }

            if (pionRouge == null || pionRouge.getPosition() >= nombreCases) {
                break;
            }

            if (pionBleu != null) {
                System.out.println("Appuyez sur Entrée pour que le joueur bleu lance le dé et effectue son tour.");
                scanner.nextLine();
                int deResultatBleu = de.lancer();
                System.out.println("Le résultat du dé du joueur bleu est : " + deResultatBleu);

                int nouvellePositionBleu = pionBleu.getPosition() + deResultatBleu;
                if (nouvellePositionBleu >= nombreCases) {
                    System.out.println("Le joueur bleu a atteint la dernière case et a remporté la partie !");
                    break;
                } else {
                    pionBleu.avancer(deResultatBleu);
                    System.out.println("Le pion bleu est maintenant à la case : " + pionBleu.getPosition());
                }

                if (pionBleu.getPosition() == kraken.getPosition()) {
                    System.out.println("Le Kraken attaque le joueur bleu !");
                    pionBleu = null;
                    System.out.println("Le joueur bleu est mort !");
                }

                if (pionBleu != null && pionBleu.getPosition() == perroquet.getPosition()) {
                    System.out.println("Le joueur bleu a trouvé le perroquet !");
                    System.out.println("Le perroquet dit : Je vais chercher la potion à la case " + perroquet.getPosition());
                    System.out.println("Voulez-vous utiliser la potion ? (O/N)");
                    String reponsePotion = scanner.nextLine().toUpperCase();
                    if (reponsePotion.equals("O")) {
                        pionBleu.utiliserPotion();
                        System.out.println("Le joueur bleu a utilisé la potion et est maintenant invincible !");
                    }
                }
            }

            if (pionBleu == null || pionBleu.getPosition() >= nombreCases) {
                break;
            }
        }
    }
}
