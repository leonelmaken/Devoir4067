
class JpegCompressor implements Compressor {
    @Override
    public void compress(String fileName) {
        System.out.println("Compression en format JPEG pour le fichier : " + fileName);
    }
}