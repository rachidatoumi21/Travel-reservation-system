package Section;

public class EtatOccupe implements EtatSiege {

	@Override
    public void reserver(Arrangement arrangement) {
        // Can't reserve occupied
    }

    @Override
    public void liberer(Arrangement arrangement) {
        
        arrangement.setConfirmed(false);
        arrangement.setDisponible(true);
        if (arrangement instanceof Siege) ((Siege) arrangement).setEtat(new EtatLibre());
        if (arrangement instanceof Cabin) ((Cabin) arrangement).setEtat(new EtatLibre());
    }

    @Override
    public void occuper(Arrangement arrangement) {
        // Already occupied
    }

}