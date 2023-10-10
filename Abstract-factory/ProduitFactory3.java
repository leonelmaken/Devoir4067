public class ProduitFactory3 implements IProduitFactory {
public ProduitA getproduitA() {
return new ProduitA3();
}
public ProduitB getProduitB() {
return new ProduitB3();
}
public ProduitC getProduitC() {
return new ProduitC3();
}
}