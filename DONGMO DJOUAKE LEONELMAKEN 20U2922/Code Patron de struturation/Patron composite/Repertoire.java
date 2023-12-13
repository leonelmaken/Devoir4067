import java.util.ArrayList;
import java.util.List;

public abstract class Repertoire {
   String nom;
    private String type;  // Peut être "txt", "pdf" ou "dossier"
    protected List<Repertoire> elements;

   public Repertoire(String nom, String type) {
        this.nom = nom;
        this.type = type;
        this.elements = new ArrayList<>(); // Initialisez la liste ici.
    }
    public void decrire() {
        decrire(0);
    }

    protected void decrire(int niveau) {
        StringBuilder indentation = new StringBuilder();
        for (int i = 0; i < niveau; i++) {
            indentation.append("  "); // Deux espaces pour chaque niveau
        }
        System.out.println(indentation.toString() + (type.equals("dossier") ? "Dossier : " + nom : "Fichier : " + nom + " de type " + type));

        if (type.equals("dossier")) {
            for (Repertoire element : elements) {
                element.decrire(niveau + 1);
            }
        }
    }
    public void ajouter(Repertoire element) {
        if (type.equals("dossier")) {
            elements.add(element);
        } else {
            System.out.println("Impossible d'ajouter un élément à un fichier.");
        }
    }

    public void supprimer(Repertoire element) {
        if (type.equals("dossier")) {
            elements.remove(element);
        } else {
            System.out.println("Impossible de supprimer un élément d'un fichier.");
        }
    }

    public Repertoire obtenir(int index) {
        if (type.equals("dossier") && index >= 0 && index < elements.size()) {
            return elements.get(index);
        } else {
            System.out.println("Impossible d'obtenir un élément d'un fichier ou un élément qui n'existe pas.");
            return null;
        }
    }
}
