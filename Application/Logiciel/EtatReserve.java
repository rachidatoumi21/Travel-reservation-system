package Logiciel;

import Application.Arrangement;
import Application.Siege;
import Application.Cabin;
public class EtatReserve implements EtatSiege {
	
	/**
	 * Reserves the arrangement, changing its state to reserved.
	 * @param arrangement The arrangement to reserve.
	 */
	@Override
    public void reserver(Arrangement arrangement) {
        // Already reserved
    }

    @Override
    public void liberer(Arrangement arrangement) {

        arrangement.setDisponible(true);
        arrangement.setConfirmed(false);
        if (arrangement instanceof Siege) ((Siege) arrangement).setEtat(new EtatLibre());
        if (arrangement instanceof Cabin) ((Cabin) arrangement).setEtat(new EtatLibre());
    }

    @Override
    public void occuper(Arrangement arrangement) {
        
        arrangement.setConfirmed(true);
        if (arrangement instanceof Siege) ((Siege) arrangement).setEtat(new EtatOccupe());
        if (arrangement instanceof Cabin) ((Cabin) arrangement).setEtat(new EtatOccupe());
    }
}