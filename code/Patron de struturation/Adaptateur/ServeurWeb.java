public class ServeurWeb {
    private Document document;

    public ServeurWeb() {}

    // Configure le type de document que le serveur va gérer
    public void setDocument(Document doc) {
        this.document = doc;
    }

    // Configurer le contenu du document
    public void definirContenuDocument() {
        if (document != null) {
            document.setContenu();
        } else {
            System.out.println("Veuillez d'abord définir un type de document.");
        }
    }

    // Affiche le document actuel
    public void afficherDocument() {
        if (document != null) {
            document.dessine();
        } else {
            System.out.println("Veuillez d'abord définir un type de document.");
        }
    }

    // Imprime le document actuel
    public void imprimerDocument() {
        if (document != null) {
            document.imprime();
        } else {
            System.out.println("Veuillez d'abord définir un type de document.");
        }
    }

    public static void main(String[] args) {
        ServeurWeb serveur = new ServeurWeb();
        
        // Utilisation avec un DocumentHtml
        serveur.setDocument(new DocumentHtml());
        serveur.definirContenuDocument();
        serveur.afficherDocument();
        serveur.imprimerDocument();

        System.out.println("-----------------------");

        // Utilisation avec un DocumentPdf
        serveur.setDocument(new DocumentPdf());
        serveur.definirContenuDocument();
        serveur.afficherDocument();
        serveur.imprimerDocument();
    }
}
