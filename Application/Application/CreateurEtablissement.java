package Application;

public abstract class CreateurEtablissement {
	protected EtablissementIdGenerator idGenerator = new EtablissementIdGenerator();
	/**
	 * 
	 * @param ville
	 */
	protected abstract Etablissement fabrique(String nom, Ville ville);

	/**
	 * 
	 * @param ville
	 */
	public Etablissement creerEtablissement(String nom, Ville ville) {
		return fabrique(nom, ville);
	}

}