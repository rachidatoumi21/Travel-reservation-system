package Logiciel;
import Application.Compagnie;
// Removed duplicate import of Logiciel.Compagnie
public abstract class CreateurCompagnie {
	protected CompagnieIdGenerator idGen = new CompagnieIdGenerator();
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
	public Compagnie creerCompagnie(Float prix, String nom){
		return fabrique(prix, nom);
	}

}