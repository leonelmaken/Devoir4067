class ImageSaverContext {
    private Compressor compressor;
    private Filter filter;

    public void setCompressor(Compressor compressor) {
        this.compressor = compressor;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public void saveImage(String fileName) {
        if (compressor != null) {
            compressor.compress(fileName);
        }

        if (filter != null) {
            filter.apply(fileName);
        }

        System.out.println("Image sauvegardée avec succès : " + fileName);
    }
}

