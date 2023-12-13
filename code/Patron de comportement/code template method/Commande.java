abstract class Commande {

    protected float montantHt;
    protected float montantTva;
    protected float montantTtc;

    // Méthode template qui définit l'algorithme de calcul du montant TTC
    public final void calculeMontantTtc() {
        calculeTva();
        montantTtc = montantHt + montantTva;
    }

    // Méthode spécifique aux sous-classes pour calculer la TVA
    protected abstract void calculeTva();

    // Méthode template pour afficher les détails de la commande
    public final void affiche() {
        System.out.println("Montant HT : " + montantHt);
        System.out.println("Montant TVA : " + montantTva);
        System.out.println("Montant TTC : " + montantTtc);
    }
}