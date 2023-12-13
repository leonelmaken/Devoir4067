class HighContrastFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Application du filtre contraste élevé pour le fichier : " + fileName);
    }
}