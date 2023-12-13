package Exemple3;
public class Rectangle {
    protected float longueur;
    protected float largeur;

    public Rectangle(float longueur, float largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public float perimetre() {
        return 2 * (longueur + largeur);
    }

    public float aire() {
        return longueur * largeur;
    }
}
