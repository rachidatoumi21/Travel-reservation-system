package Logiciel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.time.LocalDateTime;

import Application.Voyage;
import Application.Vol;
import Application.Trajet;
import Application.Itineraire;
import Application.Etablissement;
import Application.Aeroport;
import Application.Gare;
import Application.Port;
import Application.Compagnie;
import Application.MoyenTransport;
import Application.Arrangement;

public class Database implements IConsultController {

	private List<Observateur> observateurs;
	private List<User> users;
	private List<Voyage> voyages;
	private List<Etablissement> etablissements;
	private List<Compagnie> compagnies;
	private List<MoyenTransport> moyensTransport;


	/* Getters */
	protected List<Voyage> getVoyages() {
		return this.voyages;
	}
	protected List<User> getUsers() {
		return this.users;
	}
	protected List<Etablissement> getEtablissements() {
		return this.etablissements;
	}
	protected List<Compagnie> getCompagnies() {
		return this.compagnies;
	}
	protected List<MoyenTransport> getMoyensTransport() {
		return this.moyensTransport;
	}


	public void addObservateur(Observateur o) {
		if (o != null && !observateurs.contains(o)) {
            observateurs.add(o);
        }
	}
	
	public void removeObservateur(Observateur o) {
		observateurs.remove(o);
	}

	public void notifyObservateur() {
		for (Observateur o : new ArrayList<>(observateurs)) {
            o.update();
        }
	}


	public void addUser(User user) {
		if (user != null && !users.contains(user)) {
			users.add(user);
			notifyObservateur();
		}
	}

	public void removeUser(User user) {
		if (users.remove(user)) {
			notifyObservateur();
		}
	}


	public void addVoyage(Voyage voyage) {
		if (voyage != null && !voyages.contains(voyage)) {
			voyages.add(voyage);
			notifyObservateur();
		}
	}

	public void removeVoyage(Voyage voyage) {
		if (voyages.remove(voyage)) {
			notifyObservateur();
		}
	}

	
	public void addEtablissement(Etablissement etab) {
		if (etab != null && !etablissements.contains(etab)) {
			etablissements.add(etab);
			notifyObservateur();
		}
	}

	public void removeEtablissement(Etablissement etab) {
		if (etablissements.remove(etab)) {
			notifyObservateur();
		}
	}


	public void addCompagnie(Compagnie compagnie) {
		if (compagnie != null && !compagnies.contains(compagnie)) {
			compagnies.add(compagnie);
			notifyObservateur();
		}
	}

	public void removeCompagnie(Compagnie compagnie) {
		if (compagnies.remove(compagnie)) {
			notifyObservateur();
		}
	}


	public void addMoyenTransport(MoyenTransport moyenTrans) {
		if (moyenTrans != null && !moyensTransport.contains(moyenTrans)) {
			moyensTransport.add(moyenTrans);
			notifyObservateur();
		}
	}

	public void removeMoyenTransport(MoyenTransport moyenTrans) {
		if (moyensTransport.remove(moyenTrans)) {
			notifyObservateur();
		}
	}


	@Override
	public String afficherMessage(String mes) {
		notifyObservateur();
		return mes;
	}

	/**
	 * 
	 * @param aeroportDepart
	 * @param aeroportArrivee
	 * @param dateDepart
	 * @param dateArrivee
	 * 
	 */
	@Override
	public List<Vol> chercherVol(Aeroport aeroportDepart, Aeroport aeroportArrivee, LocalDateTime dateDepart, LocalDateTime dateArrivee) {
		List<Vol> result = new ArrayList<>();
		for (Voyage v : voyages) {
			if (v instanceof Vol) {
				Vol vol = (Vol) v;
				if (vol.getDepart().equals(aeroportDepart) &&
						vol.getDestination().equals(aeroportArrivee) &&
						vol.getDateDepart().equals(dateDepart) &&
						vol.getDateArrivee().equals(dateArrivee)) {
					result.add(vol);
				}
			}
		}
		return result;
	}

	/**
	 * 
	 * @param portDepart
	 * @param portArrivee
	 * @param dateDepart
	 * @param dateArrivee
	 */
	@Override
	public List<Itineraire> chercherItineraire(Port portDepart, Port portArrivee, LocalDateTime dateDepart, LocalDateTime dateArrivee) {
		List<Itineraire> result = new ArrayList<>();
		for (Voyage v : voyages) {
			if (v instanceof Itineraire) {
				Itineraire iti = (Itineraire) v;
				if (iti.getDepart().equals(portDepart) &&
						iti.getDestination().equals(portArrivee) &&
						iti.getDateDepart().equals(dateDepart) &&
						iti.getDateArrivee().equals(dateArrivee)) {
					result.add(iti);
				}
			}
		}
		return result;
	}

	/**
	 * 
	 * @param gareDepart
	 * @param gareArrivee
	 * @param dateDepart
	 * @param dateArrivee
	 */
	@Override
	public List<Trajet> chercherTrajet(Gare gareDepart, Gare gareArrivee, LocalDateTime dateDepart, LocalDateTime dateArrivee) {
		List<Trajet> result = new ArrayList<>();
		for (Voyage v : voyages) {
			if (v instanceof Vol) {
				Trajet tj = (Trajet) v;
				if (tj.getDepart().equals(gareDepart) &&
						tj.getDestination().equals(gareArrivee) &&
						tj.getDateDepart().equals(dateDepart) &&
						tj.getDateArrivee().equals(dateArrivee)) {
					result.add(tj);
				}
			}
		}
		return result;
	}

	/**
	 * 
	 * @param aeroport
	 */
	@Override
	public List<Vol> afficherVolsParAeroport(Aeroport aeroport) {
		List<Vol> result = new ArrayList<>();
		for (Voyage v : voyages) {
			if (v instanceof Vol && ((Vol) v).getDepart().equals(aeroport)) {
				result.add((Vol) v);
			}
		}
		return result;
	}

	/**
	 * 
	 * @param port
	 */
	@Override
	public List<Itineraire> afficherItinerairesParPort(Port port) {
		List<Itineraire> result = new ArrayList<>();
		for (Voyage v : voyages) {
			if (v instanceof Itineraire && ((Itineraire) v).getDepart().equals(port)) {
				result.add((Itineraire) v);
			}
		}
		return result;
	}

	/**
	 * 
	 * @param gare
	 */
	@Override
	public List<Trajet> afficherTrajetsParGare(Gare gare) {
		List<Trajet> result = new ArrayList<>();
		for (Voyage v : voyages) {
			if (v instanceof Trajet && ((Trajet) v).getDepart().equals(gare)) {
				result.add((Trajet) v);
			}
		}
		return result;
	}

	/**
	 * 
	 * @param vol
	 */
	@Override
	public List<Arrangement> consulterArrangements(Voyage voyage) {
		return voyage.getArrangements(); // TODO
	}

	/**
	 * 
	 * @param typeVoyage
	 * @param dep
	 * @param arr
	 * @param dateDep
	 * @param dateArr
	 */
	@Override
	public List<Voyage> verifierDisponibiliteVoyage(String typeVoyage, Etablissement dep, Etablissement arr, LocalDateTime dateDep, LocalDateTime dateArr) {
		switch (typeVoyage.toLowerCase()) {
            case "vol":
                return new ArrayList<>(chercherVol((Aeroport) dep, (Aeroport) arr, dateDep, dateArr));
            case "itineraire":
                return new ArrayList<>(chercherItineraire((Port) dep, (Port) arr, dateDep, dateArr));
            case "trajet":
                return new ArrayList<>(chercherTrajet((Gare) dep, (Gare) arr, dateDep, dateArr));
            default:
                return Collections.emptyList();
        }
	}

	/**
	 * 
	 * @param userId
	 */
	public User findUser(String userId) {
		for (User u : users) {
			if (u.getUserId().equals(userId)) 
				return u;
		}
		return null;
	}

	/**
	 * 
	 * @param code
	 */
	public Etablissement findEtablissement(String code) {
		for (Etablissement e : etablissements) {
			if (e.getCode().equals(code)) 
				return e;
		}
		return null;
	}

	/**
	 * 
	 * @param compagnieId
	 */
	public Compagnie findCompagnie(String compagnieId) {
		for (Compagnie comp : compagnies) {
			if (comp.getId().equals(compagnieId))
				return comp;
		}
		return null;
	}

	/**
	 * 
	 * @param id
	 */
	public MoyenTransport findMoyenTransport(String id) {
		for (MoyenTransport m : moyensTransport) {
			if (m.getId().equals(id))
				return m;
		}
		return null;
	}


}