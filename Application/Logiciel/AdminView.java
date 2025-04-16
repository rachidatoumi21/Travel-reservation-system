package Logiciel;

public class AdminView extends View implements Observateur, Visiteur {

	private List<String> adminMenuOptions;
	private String selectedOption;
	private String errorMessage;
	private Arraylist commands = new Map<String,Command>;

	public void displayMenu() {
		// TODO - implement AdminView.displayMenu
		throw new UnsupportedOperationException();
	}

	public void update() {
		// TODO - implement AdminView.update
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param vol
	 */
	public String visitVol(Vol vol) {
		// TODO - implement AdminView.visitVol
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param trajet
	 */
	public String visitTrajet(Trajet trajet) {
		// TODO - implement AdminView.visitTrajet
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param itineraire
	 */
	public String visitItineraire(Itineraire itineraire) {
		// TODO - implement AdminView.visitItineraire
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param voyages
	 */
	public void displayVoyageInfoAdmin(List<Voyage> voyages) {
		// TODO - implement AdminView.displayVoyageInfoAdmin
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param result
	 */
	public void showAdminResult(String result) {
		// TODO - implement AdminView.showAdminResult
		throw new UnsupportedOperationException();
	}

	public void displayAdminMenu() {
		// TODO - implement AdminView.displayAdminMenu
		throw new UnsupportedOperationException();
	}

}