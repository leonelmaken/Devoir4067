public class Client {
    public static void main(String[] args) {
        Directeur directeur = new Directeur();
        MonteurPizza monteurReine = new MonteurPizzaReine();
        MonteurPizza monteurPiquante = new MonteurPizzaPiquante();
        MonteurPizza monteurLocal = new MonteurPizzaLocal();

        // Construire une pizza Reine
        directeur.setMonteurPizza(monteurReine);
        directeur.construirePizza();

        Pizza pizzaReine = directeur.getPizza();
        System.out.println(pizzaReine.toString());


        // Construire une pizza Piquante
        directeur.setMonteurPizza(monteurPiquante);
        directeur.construirePizza();

        Pizza pizzaPiquante = directeur.getPizza();
        System.out.println(pizzaPiquante.toString());

        // Construire une pizza Local
        directeur.setMonteurPizza(monteurLocal);
        directeur.construirePizza();

        Pizza pizzaLocal = directeur.getPizza();
        System.out.println(pizzaLocal.toString());

    }
}
