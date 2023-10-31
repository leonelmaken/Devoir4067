public class Fichier extends Repertoire {
    private String contenu;

    public Fichier(String nom, String type) {
        super(nom, type);
        this.contenu = "";
    }

    public void afficherContenu() {
        System.out.println("Contenu du fichier " + nom + " :");
        System.out.println(contenu);
    }

    public void modifierContenu(String contenu) {
        this.contenu = contenu;
    }

    public void ajouter(Repertoire element) {
        // Ne fait rien, car les fichiers ne peuvent pas contenir d'autres éléments.
        System.out.println("Impossible d'ajouter un élément à un fichier.");
    }

    public void supprimer(Repertoire element) {
        // Ne fait rien, car les fichiers ne peuvent pas contenir d'autres éléments.
        System.out.println("Impossible de supprimer un élément d'un fichier.");
    }

    public Repertoire obtenir(int index) {
        // Ne fait rien, car les fichiers ne peuvent pas contenir d'autres éléments.
        System.out.println("Impossible d'obtenir un élément d'un fichier.");
        return null;
    }
}
