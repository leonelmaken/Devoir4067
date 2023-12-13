import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez le pays :");
        System.out.println("1. Cameroun");
        System.out.println("2. Gabon");

        int choixPays = scanner.nextInt();

        Commande commande = null;

        switch (choixPays) {
            case 1:
                commande = new CommandeCameroun();
                break;
            case 2:
                commande = new CommandeGabon();
                break;
            default:
                System.out.println("Choix invalide. Le programme se termine.");
                System.exit(0);
        }

        System.out.print("Montant HT pour la commande : ");
        commande.montantHt = scanner.nextFloat();

        commande.calculeMontantTtc();
        commande.affiche();

        // Fermez le scanner
        scanner.close();
    }
}