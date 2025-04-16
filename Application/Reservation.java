public class Reservation {

	private Client client;
	private string numReservation;
	private string statut;
	private DateTime dateCreation;
	private DateTime dateExpiration;
	private DateTime datePaiement;
	private ModePaiement modePaiement;
	private boolean isPaid;

	/**
	 * 
	 * @param numReservation
	 */
	public Reservation getReservationDetails(string numReservation) {
		// TODO - implement Reservation.getReservationDetails
		throw new UnsupportedOperationException();
	}

	public string getId() {
		// TODO - implement Reservation.getId
		throw new UnsupportedOperationException();
	}

	public Voyage getVoyage() {
		// TODO - implement Reservation.getVoyage
		throw new UnsupportedOperationException();
	}

	public Client getClient() {
		return this.client;
	}

	public string getStatut() {
		return this.statut;
	}

	public DateTime getDateExpiration() {
		return this.dateExpiration;
	}

	public bool estExpirée() {
		// TODO - implement Reservation.estExpirée
		throw new UnsupportedOperationException();
	}

	public bool validerDisponibilité() {
		// TODO - implement Reservation.validerDisponibilité
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param p
	 */
	public void confirmerPaiement(Paiement p) {
		// TODO - implement Reservation.confirmerPaiement
		throw new UnsupportedOperationException();
	}

	public void annuler() {
		// TODO - implement Reservation.annuler
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param client
	 * @param arrangement
	 * @param voyage
	 */
	public void creerReservation(int client, Arrangement arrangement, Voyage voyage) {
		// TODO - implement Reservation.creerReservation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param client
	 * @param numReservation
	 * @param modePaiement
	 * @param infoCarte
	 */
	public void payerReservation(Client client, String numReservation, ModePaiement modePaiement, string infoCarte) {
		// TODO - implement Reservation.payerReservation
		throw new UnsupportedOperationException();
	}

}