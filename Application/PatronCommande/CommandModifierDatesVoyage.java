package PatronCommande;

import java.time.LocalDateTime;
import Application.Voyage;

/**
 * Commande pour modifier les dates de départ et d’arrivée d’un voyage.
 */
public class CommandModifierDatesVoyage implements Command {
    private final Voyage voyage;
    private final LocalDateTime nouvelleDateDepart;
    private final LocalDateTime nouvelleDateArrivee;
    private LocalDateTime ancienneDateDepart;
    private LocalDateTime ancienneDateArrivee;

    public CommandModifierDatesVoyage(Voyage v,
                                      LocalDateTime dDep,
                                      LocalDateTime dArr) {
        this.voyage               = v;
        this.nouvelleDateDepart   = dDep;
        this.nouvelleDateArrivee  = dArr;
    }

    @Override
    public void redo() {
        ancienneDateDepart  = voyage.getDateDepart();
        ancienneDateArrivee = voyage.getDateArrivee();
        voyage.setDateDepart(nouvelleDateDepart);
        voyage.setDateArrivee(nouvelleDateArrivee);
    }

    @Override
    public void undo() {
        voyage.setDateDepart(ancienneDateDepart);
        voyage.setDateArrivee(ancienneDateArrivee);
    }

    public void modificationHeures(Voyage v,
                                   LocalDateTime dDep,
                                   LocalDateTime dArr) {
									
        redo();
    }
}