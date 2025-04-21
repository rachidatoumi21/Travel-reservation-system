package Application;

public abstract class Etablissement {

	private String code;
	private String nom;
	private Ville ville;

	public Etablissement(String nom, Ville ville) {
		setNom(nom);
		setVille(ville);
	}
	public Ville getVille() {
		return this.ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public String getCode() {
		return this.code;
	}

	/**
	 * 
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}