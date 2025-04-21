package Users;

public abstract class User {

	private String nom;
	private String prenom;
	private String userId;
	private String courriel;
	private boolean isAdmin;

	public String getUserId() {
		return this.userId;
	}

	public String getNom() {
		return this.nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public String getCourriel() {
		return this.courriel;
	}

	public boolean isAdmin() {
		return this.isAdmin;
	}
}