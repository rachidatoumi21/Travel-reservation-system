package Logiciel;

public interface Visiteur {

	/**
	 * 
	 * @param vol
	 */
	string visitVol(Vol vol);

	/**
	 * 
	 * @param trajet
	 */
	string visitTrajet(Trajet trajet);

	/**
	 * 
	 * @param itineraire
	 */
	string visitItineraire(Itineraire itineraire);

}