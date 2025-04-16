package Logiciel;

public class ClientView extends View implements Observateur, Visiteur {

	private List<string> clientMenuOptions;
	private string selectedOption;
	private string errorMessage;

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
	public string visitVol(Vol vol) {
		// TODO - implement ClientView.visitVol
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param trajet
	 */
	public string visitTrajet(Trajet trajet) {
		// TODO - implement ClientView.visitTrajet
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param itineraire
	 */
	public string visitItineraire(Itineraire itineraire) {
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