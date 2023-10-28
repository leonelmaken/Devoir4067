package Exemple3;

public class AdapteRectangle extends Rectangle implements Carre {
    public AdapteRectangle(float cote) {
        super(cote, cote);  // Un carré est un rectangle avec longueur = largeur
    }
}
