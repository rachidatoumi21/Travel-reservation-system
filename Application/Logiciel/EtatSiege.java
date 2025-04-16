package Logiciel;

public interface EtatSiege {

	/**
	 * 
	 * @param siege
	 */
	void reserver(Siege siege);

	/**
	 * 
	 * @param siege
	 */
	void liberer(Siege siege);

	/**
	 * 
	 * @param siege
	 */
	void occuper(Siege siege);

}