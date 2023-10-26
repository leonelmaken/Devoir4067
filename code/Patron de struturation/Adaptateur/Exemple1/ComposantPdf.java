import java.util.Scanner;

public class ComposantPdf {
    private String contenu;

    public int pdfFixeContenu(String contenu) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer le contenu du document PDF  : ");
        
        
        this.contenu = scanner.nextLine();
        return 0;  // retourner le contenu
    }

    public int pdfPrepareAffichage() {
        
        System.out.print("Préparation de l'affichage du contnu : " + contenu);
        return 0;  // Retourne 0 comme une valeur de succès. Ajuste si nécessaire.
    }

    public int pdfRafraichir() {
        System.out.println("Affichage du document PDF : " + contenu);
        return 0;  // Retourne 0 comme une valeur de succès. Ajuste si nécessaire.
    }

    public int pdfTermineAffichage() {
        System.out.println("Affichage du document PDF : " + contenu + "Terminé");
        return 0;  // Retourne 0 comme une valeur de succès. Ajuste si nécessaire.
    }

    public int pdfEnvoieImprimante() {
        System.out.println("Impression du document PDF : " + contenu);
        return 0;  // Retourne 0 comme une valeur de succès. Ajuste si nécessaire.
    }
}
