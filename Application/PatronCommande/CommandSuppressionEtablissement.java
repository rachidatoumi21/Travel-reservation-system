package PatronCommande;

import java.util.Map;
import Application.Etablissement;

/**
 * Commande pour supprimer (et restaurer) un établissement dans une Map.
 */
public class CommandSuppressionEtablissement implements Command {
    private final String idEtablissement;
    private final Map<String, Etablissement> etablissements;
    private Etablissement etablissementSupprime;

    /**
     * @param idEtablissement  l’identifiant de l’établissement à supprimer
     * @param etablissements    la Map contenant tous les établissements
     */
    public CommandSuppressionEtablissement(String idEtablissement,
                                           Map<String, Etablissement> etablissements) {
        this.idEtablissement = idEtablissement;
        this.etablissements   = etablissements;
    }

    /**
     * Supprime l’établissement de la Map et renvoie la Map mise à jour.
     */
    public Map<String, Etablissement> supprimerEtablissement(String idEtablissement,
                                                             Map<String, Etablissement> etablissements) {
        // on s’assure d’utiliser bien nos attributs internes
        redo();
        return etablissements;
    }

    @Override
    public void redo() {
        // retire et mémorise pour pouvoir annuler
        etablissementSupprime = etablissements.remove(idEtablissement);
    }

    @Override
    public void undo() {
        // remet l’établissement supprimé si on l’avait bien en mémoire
        if (etablissementSupprime != null) {
            etablissements.put(idEtablissement, etablissementSupprime);
        }
    }
}