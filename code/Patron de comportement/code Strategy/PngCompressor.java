class PngCompressor implements Compressor {
    @Override
    public void compress(String fileName) {
        System.out.println("Compression en format PNG pour le fichier : " + fileName);
    }
}