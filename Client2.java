public class Client {

    public static void main(String[] args) {

        ProduitFactory produitFactory = new ProduitFactory();

        ProduitA produitA = null;

        produitA = produitFactory.geProduitA(produitFactory.TYPE_PRODUITA1);
        produitA.methodeA();
    }
}