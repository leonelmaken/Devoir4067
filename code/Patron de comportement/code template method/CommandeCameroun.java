class CommandeCameroun extends Commande {

    // Implémentation spécifique pour calculer la TVA au Cameroun
    @Override
    protected void calculeTva() {
        montantTva = (float) (montantHt * 0.196); // Nouvelle ligne
 // Taux de TVA au Cameroun : 19.6%
    }
}
