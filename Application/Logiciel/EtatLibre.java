package Logiciel;

import Application.Arrangement;
import Application.Siege;
import Application.Cabin;


public class EtatLibre implements EtatSiege {

	/**
	 * Reserves the arrangement, changing its state to reserved.
	 * @param arrangement The arrangement to reserve.
	 */	

	@Override
    public void reserver(Arrangement arrangement) {
        arrangement.setDisponible(false);
        arrangement.setConfirmed(false);
        if (arrangement instanceof Siege) ((Siege) arrangement).setEtat(new EtatReserve());
        if (arrangement instanceof Cabin) ((Cabin) arrangement).setEtat(new EtatReserve());
    }

    @Override
    public void liberer(Arrangement arrangement) {
        // Already libre
    }

    @Override
    public void occuper(Arrangement arrangement) {
        // Can't directly occupy from libre
    }

}