package Exemple3;

import java.util.Scanner;

public class Programme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la longueur du côté du carré : ");
        float cote = scanner.nextFloat();

        Carre carre = new AdapteRectangle(cote);

        System.out.println("Périmètre du carré : " + carre.perimetre());
        System.out.println("Aire du carré : " + carre.aire());
    }
}
