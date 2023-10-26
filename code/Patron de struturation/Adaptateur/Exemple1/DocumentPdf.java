import java.util.Scanner;
public class DocumentPdf implements Document{


    private ComposantPdf composantPdf;
    private String contenu;

    public DocumentPdf() {
        this.composantPdf = new ComposantPdf();
    }


    @Override
    public int setContenu() {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer le contenu du document PDF : ");

        this.contenu = scanner.nextLine();
        composantPdf.pdfFixeContenu(String.valueOf(contenu));
        return 0;

    }

    @Override
    public int dessine() {
       composantPdf.pdfPrepareAffichage();
        int resultat = composantPdf.pdfRafraichir();
        composantPdf.pdfTermineAffichage();
        return resultat; // Supposons que pdfRafraichir() donne le résultat le plus pertinent. Ajuste si nécessaire.
    }

    @Override
    public int imprime() {
       return composantPdf.pdfEnvoieImprimante();
    }
    
}
