package Logiciel;

public interface Visiteur {

	/**
	 * 
	 * @param vol
	 */
	String visitVol(Vol vol);

	/**
	 * 
	 * @param trajet
	 */
	String visitTrajet(Trajet trajet);

	/**
	 * 
	 * @param itineraire
	 */
	String visitItineraire(Itineraire itineraire);

}