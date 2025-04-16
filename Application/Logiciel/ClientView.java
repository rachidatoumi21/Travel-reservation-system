package Logiciel;

public class ClientView extends View implements Observateur, Visiteur {

	private List<String> clientMenuOptions;
	private String selectedOption;
	private String errorMessage;

	public void displayMenu() {
		// TODO - implement ClientView.displayMenu
		throw new UnsupportedOperationException();
	}

	public Siege promptSeatSelection() {
		// TODO - implement ClientView.promptSeatSelection
		throw new UnsupportedOperationException();
	}

	public void update() {
		// TODO - implement ClientView.update
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param vol
	 */
	public String visitVol(Vol vol) {
		// TODO - implement ClientView.visitVol
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param trajet
	 */
	public String visitTrajet(Trajet trajet) {
		// TODO - implement ClientView.visitTrajet
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param itineraire
	 */
	public String visitItineraire(Itineraire itineraire) {
		// TODO - implement ClientView.visitItineraire
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param voyages
	 */
	public void displayVoyageInfoClient(List<Voyage> voyages) {
		// TODO - implement ClientView.displayVoyageInfoClient
		throw new UnsupportedOperationException();
	}

}