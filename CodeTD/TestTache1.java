import java.util.Scanner;

public class TestTache1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom de la tâche complexe : ");
        String nomTache = scanner.nextLine();
        TacheComplexe tacheComplexe = new TacheComplexe(nomTache);

        boolean continuer = true;

        while (continuer) {
            System.out.println("Options :");
            System.out.println("1. Ajouter une tâche élémentaire");
            System.out.println("2. Ajouter une tâche complexe");
            System.out.println("3. Afficher le coût total");
            System.out.println("4. Quitter");

            int choix = scanner.nextInt();
            scanner.nextLine(); // Pour consommer la nouvelle ligne

            switch (choix) {
                case 1:
                    System.out.print("Nom de la tâche élémentaire : ");
                    String nomElementaire = scanner.nextLine();
                    System.out.print("Coût de la tâche élémentaire : ");
                    int coutElementaire = scanner.nextInt();
                    TacheElementaire tacheElementaire = new TacheElementaire(nomElementaire, coutElementaire);
                    tacheComplexe.ajouter(tacheElementaire);
                    break;
                case 2:
                      System.out.print("Nom de la tâche complexe : ");
                        String nomComplexe = scanner.nextLine();
                        System.out.print("Coût de la tâche Complexe : ");
                        int coutComplexe = scanner.nextInt();
                        TacheComplexe nouvelleTacheComplexe = new TacheComplexe(nomComplexe);
                        tacheComplexe.ajouter(nouvelleTacheComplexe);
                    break;
                case 3:
                    System.out.println("Coût total de la tâche complexe : " + tacheComplexe.getCout());
                    break;
                case 4:
                    continuer = false;
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }

        System.out.println("Programme terminé.");
    }
}

