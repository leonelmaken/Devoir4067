public class DecorateurVertical extends Decorateur {
    public DecorateurVertical(Fenetre fenetre) {
        super(fenetre);
    }

    public void afficher() {
        fenetre.afficher(); // Afficher le texte directement depuis la fenetre
    }
}
