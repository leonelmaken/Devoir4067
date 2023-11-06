import java.util.Scanner;

public class ClientFenetre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le texte à afficher dans la fenêtre : ");
        String texte = scanner.nextLine();

        Fenetre fenetre = new FenetreSimple(texte);
        boolean continuer = true;

        while (continuer) {
            System.out.println("Choisissez une option :");
            System.out.println("1. Afficher la fenêtre simple");
            System.out.println("2. Afficher la fenêtre avec défilement vertical");
            System.out.println("3. Afficher la fenêtre avec défilement horizontal");
            System.out.println("4. Quitter");

            int choix = scanner.nextInt();
            scanner.nextLine(); // Pour consommer la nouvelle ligne

            switch (choix) {
                case 1:
                    fenetre = new FenetreSimple(texte);
                    break;
                case 2:
                    fenetre = new DecorateurVertical(new FenetreSimple(texte));
                    break;
                case 3:
                    fenetre = new DecorateurHorizontal(new FenetreSimple(texte));
                    break;
                case 4:
                    continuer = false;
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }

            if (continuer) {
                System.out.println("Contenu de la fenêtre :");
                fenetre.afficher();
            }
        }

        System.out.println("Programme terminé.");
    }
}
