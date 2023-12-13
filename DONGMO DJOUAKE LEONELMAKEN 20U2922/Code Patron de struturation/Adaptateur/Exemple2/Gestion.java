package Exemple2;

import java.util.Scanner;

// ... (les autres classes et interfaces restent inchangées)

class Gestion {
    private Stack stack;
    private Scanner scanner;

    public Gestion(Stack stack) {
        this.stack = stack;
        this.scanner = new Scanner(System.in);
    }

    public void performOperations() {
        while (true) {
            System.out.println("Que voulez-vous faire?");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Top");
            System.out.println("4. Quitter");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Entrez la valeur à push : ");
                    String value = scanner.next();
                    stack.push(value);
                    break;
                case 2:
                    System.out.println("Popped value: " + stack.pop());
                    break;
                case 3:
                    System.out.println("Top value: " + stack.top());
                    break;
                case 4:
                    System.out.println("Au revoir !");
                    scanner.close();
                    return;
                default:
                    System.out.println("Choix invalide. Essayez à nouveau.");
            }
        }
    }

    public static void main(String[] args) {
        Stack s = new StackAdapter();
        Gestion g = new Gestion(s);
        g.performOperations();
    }
}
