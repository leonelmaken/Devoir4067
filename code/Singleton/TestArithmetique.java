public class TestArithmetique {
 public static void main(String[] args)
 {
 int som = Arithmetique.getInstance().somme(2, 5);
 System.out.printf("\nla somme est %d",som);
 float div = Arithmetique.getInstance().division(2, 5);
 System.out.printf("\nla division est %f",div);
 int soustraction = Arithmetique.getInstance().soustraction(8, 5);
 System.out.printf("\nla soustraction est %d",soustraction);
int multiplication = Arithmetique.getInstance().multiplication(8, 5);
 System.out.printf("\nla multiplication est %d\n",multiplication);
 Arithmetique s1 = Arithmetique.getInstance(8, 3);
 s1.affiche();
 Arithmetique s2 = Arithmetique.getInstance(5, 9);
 s2.affiche();
 }
}