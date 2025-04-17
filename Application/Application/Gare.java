package Application;
import Logiciel.Ville;

public class Gare extends Etablissement {
    private String code;
	private Ville ville;

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

}