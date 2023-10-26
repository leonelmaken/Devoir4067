public class Client3 {

public static void main(String[] args) {
IProduitFactory produitFactory1 = new ProduitFactory1();
IProduitFactory produitFactory2 = new ProduitFactory2();
IProduitFactory produitFactory3 = new ProduitFactory3();
ProduitA produitA = null;
ProduitB produitB = null;
ProduitC produitC = null;

System.out.println("Utilisation de la premiere fabrique");
produitA = produitFactory1.getProduitA();
produitB = produitFactory1.getProduitB();
produitC = produitFactory1.getProduitC();
produitA.methodeA();
produitB.methodeB();
produitC.methodeC();
System.out.println("Utilisation de la seconde fabrique");
produitA = produitFactory2.getProduitA();
produitB = produitFactory2.getProduitB();
produitC = produitFactory2.getProduitC();
produitA.methodeA();
produitB.methodeB();
produitC.methodeC();

System.out.println("Utilisation de la troisième fabrique");
produitA = produitFactory3.getProduitA();
produitB = produitFactory3.getProduitB();
produitC = produitFactory3.getProduitC();
produitA.methodeA();
produitB.methodeB();
produitC.methodeC();

   }
}