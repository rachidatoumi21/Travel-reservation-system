package Application;

import java.time.LocalDateTime;
import java.util.List;

import Section.Arrangement;

public interface IConsultController {

	/**
	 * 
	 * @param mes
	 */
	String afficherMessage(String mes);

	/**
	 * 
	 * @param aeroportDepart
	 * @param aeroportArrivee
	 * @param dateDepart
	 * @param dateArrivee
	 */
	List<Vol> chercherVol(Aeroport aeroportDepart, Aeroport aeroportArrivee,LocalDateTime dateDepart,LocalDateTime dateArrivee);

	/**
	 * 
	 * @param portDepart
	 * @param portArrivee
	 * @param dateDepart
	 * @param dateArrivee
	 */
	List<Itineraire> chercherItineraire(Port portDepart, Port portArrivee,LocalDateTime dateDepart,LocalDateTime dateArrivee);

	/**
	 * 
	 * @param gareDepart
	 * @param gareArrivee
	 * @param dateDepart
	 * @param dateArrivee
	 */
	List<Trajet> chercherTrajet(Gare gareDepart, Gare gareArrivee,LocalDateTime dateDepart,LocalDateTime dateArrivee);

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
	List<Voyage> verifierDisponibiliteVoyage(String typeVoyage, Etablissement dep, Etablissement arr,LocalDateTime dateDep,LocalDateTime dateArr);

}