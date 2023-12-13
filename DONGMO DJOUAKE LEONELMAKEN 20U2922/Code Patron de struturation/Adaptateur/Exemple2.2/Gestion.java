import java.util.Scanner;

public class Gestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack pile = new FileAdapte();

        while (true) {
            System.out.println("\nOptions :");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Top");
            System.out.println("4. Quitter");
            System.out.print("Choix : ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Entrer une valeur : ");
                    int value = scanner.nextInt();
                    pile.push(value);
                    break;
                case 2:
                    int poppedValue = pile.pop();
                    if (poppedValue == Integer.MIN_VALUE) {
                        System.out.println("La pile est vide!");
                    } else {
                        System.out.println("Valeur extraite : " + poppedValue);
                    }
                    break;
                case 3:
                    int topValue = pile.top();
                    if (topValue == Integer.MIN_VALUE) {
                        System.out.println("La pile est vide!");
                    } else {
                        System.out.println("Valeur au sommet : " + topValue);
                    }
                    break;
                case 4:
                    System.out.println("Au revoir!");
                    return;
                default:
                    System.out.println("Option invalide. Réessayez.");
            }
        }
    }
}
