public class Pizza {

private String nom = "";
private String pate = "";
private String sauce = "";
private String garniture = "";
public void setNom(String nom) {
    this.nom = nom;
}
public void setPate(String pate)
{ this.pate = pate; }
public void setSauce(String sauce)
{ this.sauce = sauce; }
public void setGarniture(String garniture) { this.garniture =
garniture; }
@Override
public String toString() {
    return "Pizza " + nom + ":\n" +
           "Pate = " + pate + "\n" +
           "Sauce = " + sauce + "\n" +
           "Garniture = " + garniture;
}

}