import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Repertoire racine = new Dossier("Racine");

        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;


        while (continuer) {
            System.out.println("Que voulez-vous faire ?");
            System.out.println("1. Afficher le système de fichiers");
            System.out.println("2. Ajouter un fichier ou un dossier");
            System.out.println("3. Supprimer un fichier ou un dossier");
            System.out.println("4. Quitter");

            int choix = scanner.nextInt();
            scanner.nextLine(); // Pour consommer la nouvelle ligne

            switch (choix) {
                case 1:
                    racine.decrire();
                    break;
                case 2:
                    System.out.println("Entrez le nom de l'élément :");
                    String nom = scanner.nextLine();
                    System.out.println("Entrez le type de l'élément (dossier, txt, pdf) :");
                    String type = scanner.nextLine();

                    if (type.equalsIgnoreCase("dossier")) {
                        Dossier dossier = new Dossier(nom);
                        racine.ajouter(dossier);
                    } else if (type.equalsIgnoreCase("txt")) {
                        Repertoire txt = new TXT(nom);
                        racine.ajouter(txt);
                    } else if (type.equalsIgnoreCase("pdf")) {
                        Repertoire pdf = new PDF(nom);
                        racine.ajouter(pdf);
                    } else {
                        System.out.println("Type non pris en charge.");
                    }
                    break;
                case 3:
                    System.out.println("Entrez le nom de l'élément à supprimer :");
                    String elementASupprimer = scanner.nextLine();
                    Repertoire element = null;

                    for (Repertoire e : racine.elements) {
                        if (e.nom.equals(elementASupprimer)) {
                            element = e;
                            break;
                        }
                    }

                    if (element != null) {
                        racine.supprimer(element);
                    } else {
                        System.out.println("Élément non trouvé.");
                    }
                    break;
                case 4:
                    System.out.println("Entrez le nom du fichier à afficher :");
                    String nomFichier = scanner.nextLine();
                    Repertoire fichier = null;

                    for (Repertoire e : racine.elements) {
                        if (e.nom.equals(nomFichier) && e instanceof Fichier) {
                            fichier = e;
                            break;
                        }
                    }

                    if (fichier != null) {
                        ((Fichier) fichier).afficherContenu();
                    } else {
                        System.out.println("Fichier non trouvé.");
                    }
                    break;    
                case 5:
                    continuer = false;
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        }

        scanner.close();
    }
}

