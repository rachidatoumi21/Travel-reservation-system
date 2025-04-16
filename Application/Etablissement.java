import Logiciel.*;

public abstract class Etablissement {

	private string code;
	private Ville ville;

	public Ville getVille() {
		return this.ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public string getCode() {
		return this.code;
	}

	/**
	 * 
	 * @param code
	 */
	public void setCode(string code) {
		this.code = code;
	}

}