class BlackAndWhiteFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Application du filtre noir et blanc pour le fichier : " + fileName);
    }
}
