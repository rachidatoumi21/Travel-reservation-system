package Application;

public class Ville {

	private String idVille;
	private String nom;
	private String pays;

	public Ville(String idVile, String nom, String pays) {
		this.idVille = idVile;
		this.nom = nom;
		this.pays = pays;
	}

	public String getIdVille() {
		return idVille;
	}

	public void setIdVille(String idVille) {
		this.idVille = idVille;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

}