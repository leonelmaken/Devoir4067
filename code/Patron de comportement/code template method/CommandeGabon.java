class CommandeGabon extends Commande {

    // Implémentation spécifique pour calculer la TVA au Gabon
    @Override
    protected void calculeTva() {
        // Taux de TVA variable au Gabon : 12% pour les prestations, 15% pour le matériel
        // Pour cet exemple, supposons que la commande concerne les prestations
        montantTva = (float) (montantHt * 0.12);
    }
}

