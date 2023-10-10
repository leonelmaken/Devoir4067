public class ProduitFactory3 implements IProduitFactory {

public ProduitB getProduitB() {
return new ProduitB3();
}
public ProduitC getProduitC() {
return new ProduitC3();
}
@Override
public ProduitA getProduitA() {
    return new ProduitA3();
}
}