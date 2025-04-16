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
	 * @param idVoyageDébut
	 */
	public Compagnie creerCompagnie(Float prix, String nom, String idVoyageDébut) {
		// TODO - implement CreateurCompagnie.creerCompagnie
		throw new UnsupportedOperationException();
	}

}