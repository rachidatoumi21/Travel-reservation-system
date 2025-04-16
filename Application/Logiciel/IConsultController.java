package Logiciel;

public interface IConsultController {

	/**
	 * 
	 * @param mes
	 */
	string afficherMessage(string mes);

	/**
	 * 
	 * @param aeroportDepart
	 * @param aeroportArrivee
	 * @param dateDepart
	 * @param dateArrivee
	 */
	List<Vol> chercherVol(Aeroport aeroportDepart, Aeroport aeroportArrivee, DateTime dateDepart, DateTime dateArrivee);

	/**
	 * 
	 * @param portDepart
	 * @param portArrivee
	 * @param dateDepart
	 * @param dateArrivee
	 */
	List<Itineraire> chercherItineraire(Port portDepart, Port portArrivee, DateTime dateDepart, DateTime dateArrivee);

	/**
	 * 
	 * @param gareDepart
	 * @param gareArrivee
	 * @param dateDepart
	 * @param dateArrivee
	 */
	List<Trajet> chercherTrajet(Gare gareDepart, Gare gareArrivee, DateTime dateDepart, DateTime dateArrivee);

	/**
	 * 
	 * @param aeroport
	 */
	List<Vol> afficherVolsParAeroport(Aeroport aeroport);

	/**
	 * 
	 * @param port
	 */
	List<Itineraire> afficherItinerairesParPort(Port port);

	/**
	 * 
	 * @param gare
	 */
	List<Trajet> afficherTrajetsParGare(Gare gare);

	/**
	 * 
	 * @param vol
	 */
	List<Arrangement> consulterArrangements(Voyage vol);

	/**
	 * 
	 * @param typeVoyage
	 * @param dep
	 * @param arr
	 * @param dateDep
	 * @param dateArr
	 */
	List<Voyage> verifierDisponibiiteVoyage(string typeVoyage, Etablissement dep, Etablissement arr, DateTime dateDep, DateTime dateArr);

}