package Logiciel;

import Application.Voyage;
import Application.Etablissement;
import java.time.LocalDateTime;

/**
 * Commande pour modifier les lieux de départ et d’arrivée d’un voyage.
 */
public class CommandModifierLieuxVoyage implements Command {
    private final Voyage voyage;
    private final Etablissement nouveauDepart;
    private final Etablissement nouveauArrivee;
    private Etablissement ancienDepart;
    private Etablissement ancienArrivee;

    public CommandModifierLieuxVoyage(Voyage v,
                                      Etablissement dep,
                                      Etablissement arr) {
        this.voyage         = v;
        this.nouveauDepart  = dep;
        this.nouveauArrivee = arr;
    }

    @Override
    public void redo() {
        ancienDepart  = voyage.getDepart();
        ancienArrivee = voyage.getArrivee();
        voyage.setDepart(nouveauDepart);
        voyage.setArrivee(nouveauArrivee);
    }

    @Override
    public void undo() {
        voyage.setDepart(ancienDepart);
        voyage.setArrivee(ancienArrivee);
    }

    public void modificationLieux(Voyage v,
                                  Etablissement dep,
                                  Etablissement arr) {
        redo();
    }
}