/**
 * Type de compagnie: Aeroport, Port et Gare
 */
import Logiciel.*;
public abstract class Compagnie {
	private CompagnieIdGenerator idGenerator = new CompagnieIdGenerator();
	private String nom;
	private float prix;
	private String id;
	private String idVoyageDebut;

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getPrix() {
		return this.prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdVoyageDebut() {
		return this.idVoyageDebut;
	}

	public void setIdVoyageDebut(String idVoyageDebut) {
		this.idVoyageDebut = idVoyageDebut;
	}

	/**
	 * 
	 * @param prix
	 * @param nom
	 * @param idVoyageD�but
	 */
	public Compagnie(Float prix, String nom) {
		this.setPrix(prix);
		this.setNom(nom);
		this.setIdVoyageDebut(idVoyageDebut);
		this.setId(this.idGenerator.generateID());
		this.nom = nom;
		this.idVoyageDebut = idVoyageDebut;
		// return true;
		// throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param dep
	 * @param arr
	 * @param dateDep
	 * @param dateArr
	 */
	// public void obtenirDisponibilite(int dep, int arr, int dateDep, int dateArr) {
	// 	// TODO - implement Compagnie.obtenirDisponibilite
	// 	throw new UnsupportedOperationException();
	// }

	/**
	 * 
	 * @param section
	 * @param prix
	 */
	// public void assignerPrix(Section section, float prix) {
	// 	// TODO - implement Compagnie.assignerPrix
	// 	throw new UnsupportedOperationException();
	// }

}