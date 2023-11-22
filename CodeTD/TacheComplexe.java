import java.util.ArrayList;
import java.util.List;

public class TacheComplexe implements Tache {
    private String nom;
    private List<Tache> sousTaches = new ArrayList<>();

    public TacheComplexe(String nom) {
        this.nom = nom;
    }

    public void ajouter(Tache tache) {
        sousTaches.add(tache);
    }

    public void supprimer(Tache tache) {
        sousTaches.remove(tache);
    }

    public String getNom() {
        return nom;
    }

    public int getCout() {
        int coutTotal = 0;
        for (Tache tache : sousTaches) {
            coutTotal += tache.getCout();
        }
        return coutTotal;
    }
}
