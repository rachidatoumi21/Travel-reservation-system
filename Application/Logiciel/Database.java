package Logiciel;

public class Database implements IConsultController {

	private List<Observateur> observateurs;
	private List<User> users;
	private List<Voyage> voyages;
	private List<Etablissement> etablissements;
	private List<Compagnie> compagnies;
	private List<MoyenTransport> moyensTransport;

	/**
	 * 
	 * @param o
	 */
	public void addObservateur(Observateur o) {
		// TODO - implement Database.addObservateur
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param o
	 */
	public void removeObservateur(Observateur o) {
		// TODO - implement Database.removeObservateur
		throw new UnsupportedOperationException();
	}

	public void notifyObservateur() {
		// TODO - implement Database.notifyObservateur
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param user
	 */
	public void addUser(User user) {
		// TODO - implement Database.addUser
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param user
	 */
	public void removeUser(User user) {
		// TODO - implement Database.removeUser
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param voyage
	 */
	public void addVoyage(Voyage voyage) {
		// TODO - implement Database.addVoyage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param voyage
	 */
	public void removeVoyage(Voyage voyage) {
		// TODO - implement Database.removeVoyage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param etab
	 */
	public void addEtablissement(Etablissement etab) {
		// TODO - implement Database.addEtablissement
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param etab
	 */
	public void removeEtablissement(Etablissement etab) {
		// TODO - implement Database.removeEtablissement
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param compagnie
	 */
	public void addCompagnie(Compagnie compagnie) {
		// TODO - implement Database.addCompagnie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param compagnie
	 */
	public void removeCompagnie(Compagnie compagnie) {
		// TODO - implement Database.removeCompagnie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param moyenTrans
	 */
	public void addMoyenTransport(MoyenTransport moyenTrans) {
		// TODO - implement Database.addMoyenTransport
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param moyenTrans
	 */
	public void removeMoyenTransport(MoyenTransport moyenTrans) {
		// TODO - implement Database.removeMoyenTransport
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param mes
	 */
	public String afficherMessage(String mes) {
		// TODO - implement Database.afficherMessage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param aeroportDepart
	 * @param aeroportArrivee
	 * @param dateDepart
	 * @param dateArrivee
	 */
	public List<Vol> chercherVol(Aeroport aeroportDepart, Aeroport aeroportArrivee, DateTime dateDepart, DateTime dateArrivee) {
		// TODO - implement Database.chercherVol
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param portDepart
	 * @param portArrivee
	 * @param dateDepart
	 * @param dateArrivee
	 */
	public List<Itineraire> chercherItineraire(Port portDepart, Port portArrivee, DateTime dateDepart, DateTime dateArrivee) {
		// TODO - implement Database.chercherItineraire
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param gareDepart
	 * @param gareArrivee
	 * @param dateDepart
	 * @param dateArrivee
	 */
	public List<Trajet> chercherTrajet(Gare gareDepart, Gare gareArrivee, DateTime dateDepart, DateTime dateArrivee) {
		// TODO - implement Database.chercherTrajet
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param aeroport
	 */
	public List<Vol> afficherVolsParAeroport(Aeroport aeroport) {
		// TODO - implement Database.afficherVolsParAeroport
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param port
	 */
	public List<Itineraire> afficherItinerairesParPort(Port port) {
		// TODO - implement Database.afficherItinerairesParPort
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param gare
	 */
	public List<Trajet> afficherTrajetsParGare(Gare gare) {
		// TODO - implement Database.afficherTrajetsParGare
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param vol
	 */
	public List<Arrangement> consulterArrangements(Voyage vol) {
		// TODO - implement Database.consulterArrangements
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param typeVoyage
	 * @param dep
	 * @param arr
	 * @param dateDep
	 * @param dateArr
	 */
	public List<Voyage> verifierDisponibiiteVoyage(String typeVoyage, Etablissement dep, Etablissement arr, DateTime dateDep, DateTime dateArr) {
		// TODO - implement Database.verifierDisponibiiteVoyage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param userId
	 */
	public User findUser(String userId) {
		// TODO - implement Database.findUser
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param code
	 */
	public Etablissement findEtablissement(String code) {
		// TODO - implement Database.findEtablissement
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param compagnieId
	 */
	public Compagnie findCompagnie(String compagnieId) {
		// TODO - implement Database.findCompagnie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 */
	public MoyenTransport findMoyenTransport(String id) {
		// TODO - implement Database.findMoyenTransport
		throw new UnsupportedOperationException();
	}

}