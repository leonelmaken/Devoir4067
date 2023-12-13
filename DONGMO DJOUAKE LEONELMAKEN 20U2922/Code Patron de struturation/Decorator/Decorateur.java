public abstract class Decorateur implements Fenetre {
    protected Fenetre fenetre;

    public Decorateur(Fenetre fenetre) {
        this.fenetre = fenetre;
    }
}
