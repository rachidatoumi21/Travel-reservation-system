package Logiciel;

import Application.Voyage;
import java.util.Map;

/**
 * Commande pour supprimer (et rétablir) un voyage dans une Map.
 */
public class CommandSuppressionVoyage implements Command {
    private final String idVoyage;
    private final Map<String, Voyage> voyages;
    private Voyage voyageSupprime;

    public CommandSuppressionVoyage(String id, Map<String, Voyage> voyages) {
        this.idVoyage = id;
        this.voyages  = voyages;
    }

    /** Supprime de la Map */
    public Map<String, Voyage> supprimerVoyage(String idVoyage,
                                               Map<String, Voyage> voyages) {
												
        redo();
        return voyages;
    }

    @Override
    public void redo() {
        voyageSupprime = voyages.remove(idVoyage);
    }

    @Override
    public void undo() {
        if (voyageSupprime != null) {
            voyages.put(idVoyage, voyageSupprime);
        }
    }
}