package Logiciel;

public class CommandSuppressionVoyage implements Command {

	private string idVoyage;
	private Map<String, Voyage> voyages;

	/**
	 * 
	 * @param idVoyage
	 * @param voyages
	 */
	public Map<String, Voyage> supprimerVoyage(string idVoyage, Map<String, Voyage> voyages) {
		// TODO - implement CommandSuppressionVoyage.supprimerVoyage
		throw new UnsupportedOperationException();
	}

	public void redo() {
		// TODO - implement CommandSuppressionVoyage.redo
		throw new UnsupportedOperationException();
	}

	public void undo() {
		// TODO - implement CommandSuppressionVoyage.undo
		throw new UnsupportedOperationException();
	}

}