public class DecorateurHorizontal extends Decorateur {
    public DecorateurHorizontal(Fenetre fenetre) {
        super(fenetre);
    }

    public void afficher() {
        String texte = fenetre.toString(); // Accéder au texte depuis la fenetre
        String[] lignes = texte.split("\n");

        for (String ligne : lignes) {
            char[] caracteres = ligne.toCharArray();
            for (char caractere : caracteres) {
                System.out.print(caractere + " ");
            }
            System.out.println(); // Passer à la ligne suivante
        }
    }
}
