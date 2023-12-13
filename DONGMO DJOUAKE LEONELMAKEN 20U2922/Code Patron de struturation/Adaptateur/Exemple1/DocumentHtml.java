import java.util.Scanner;

public class DocumentHtml implements Document {
    private String contenu;

    @Override
    public int setContenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez entrer le contenu du document HTML  : ");
        
        
        this.contenu = scanner.nextLine();
        return 0;  // retourner le contenu
    }

    @Override
    public int dessine() {
        System.out.println("Affichage du document HTML : " + contenu);
        return 0;
    }

    @Override
    public int imprime() {
        System.out.println("Impression du document HTML : " + contenu);
        return 0;
    }
}
