/**
 * Type de voyage: Vol, itinéraire, trajet
 */
public abstract class Voyage {

	MoyenTransport véhicule;
	private String voyageId;
	private int depart;
	private int destination;
	private DateTime dateDepart;
	private DateTime dateArrivee;
	private Compagnie compagnie;
	private double prix;

	public void setDepart(int depart) {
		this.depart = depart;
	}

	public void setDestination(int destination) {
		this.destination = destination;
	}

	public void setDateDepart(DateTime dateDepart) {
		this.dateDepart = dateDepart;
	}

	public void setDateArrivee(DateTime dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	/**
	 * 
	 * @param vId
	 * @param dateDep
	 * @param dateArr
	 * @param c
	 */
	public Voyage(String vId, DateTime dateDep, DateTime dateArr, Compagnie c) {
		// TODO - implement Voyage.Voyage
		throw new UnsupportedOperationException();
	}

	public Voyage getVoyage() {
		// TODO - implement Voyage.getVoyage
		throw new UnsupportedOperationException();
	}

	public String getId() {
		// TODO - implement Voyage.getId
		throw new UnsupportedOperationException();
	}

	public Section getSection() {
		// TODO - implement Voyage.getSection
		throw new UnsupportedOperationException();
	}

	public Compagnie getCompagnie() {
		return this.compagnie;
	}

	public DateTime getDateDépart() {
		// TODO - implement Voyage.getDateDépart
		throw new UnsupportedOperationException();
	}

	public DateTime getDateArrivée() {
		// TODO - implement Voyage.getDateArrivée
		throw new UnsupportedOperationException();
	}

	public double getDuréeHeures() {
		// TODO - implement Voyage.getDuréeHeures
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sectionType
	 */
	public double calculerPrix(Enum sectionType) {
		// TODO - implement Voyage.calculerPrix
		throw new UnsupportedOperationException();
	}

	public Etablissement getDepart() {
		// TODO - implement Voyage.getDepart
		throw new UnsupportedOperationException();
	}

	public Etablissement getArrivee() {
		// TODO - implement Voyage.getArrivee
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idVoyage
	 */
	public boolean findVoyageById(int idVoyage) {
		// TODO - implement Voyage.findVoyageById
		throw new UnsupportedOperationException();
	}

}