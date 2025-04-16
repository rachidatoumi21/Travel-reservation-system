package Logiciel;

public abstract class CreateurCompagnie {

	/**
	 * 
	 * @param prix
	 * @param nom
	 */
	protected abstract Compagnie fabrique(Float prix, String nom);

	/**
	 * 
	 * @param prix
	 * @param nom
	 * @param idVoyageD�but
	 */
	public Compagnie creerCompagnie(Float prix, String nom, String idVoyageD�but) {
		// TODO - implement CreateurCompagnie.creerCompagnie
		throw new UnsupportedOperationException();
	}

}