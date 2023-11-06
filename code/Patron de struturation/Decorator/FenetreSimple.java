public class FenetreSimple implements Fenetre {
    private String texte;

    public FenetreSimple(String texte) {
        this.texte = texte;
    }

    public void afficher() {
        System.out.println(texte);
    }
}
