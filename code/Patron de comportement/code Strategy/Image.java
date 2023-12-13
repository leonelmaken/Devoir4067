import java.util.Scanner;

public class Image {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ImageSaverContext imageSaverContext = new ImageSaverContext();

        System.out.println("Choisissez le format de compression :");
        System.out.println("1. PNG");
        System.out.println("2. JPEG");
        int choixCompression = scanner.nextInt();

        switch (choixCompression) {
            case 1:
                imageSaverContext.setCompressor(new PngCompressor());
                break;
            case 2:
                imageSaverContext.setCompressor(new JpegCompressor());
                break;
            default:
                System.out.println("Format de compression non valide.");
                return;
        }

        System.out.println("Choisissez le filtre :");
        System.out.println("1. Noir et Blanc");
        System.out.println("2. Contraste élevé");
        int choixFiltre = scanner.nextInt();

        switch (choixFiltre) {
            case 1:
                imageSaverContext.setFilter(new BlackAndWhiteFilter());
                break;
            case 2:
                imageSaverContext.setFilter(new HighContrastFilter());
                break;
            default:
                System.out.println("Filtre non valide.");
                return;
        }

        System.out.print("Entrez le nom du fichier : ");
        String fileName = scanner.next();

        imageSaverContext.saveImage(fileName);

        // Fermez le scanner
        scanner.close();
    }
}