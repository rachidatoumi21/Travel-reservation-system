package Application;

public class CreateurCompagnieCroisiere extends CreateurCompagnie {

	/**
	 * 
	 * @param prix
	 * @param nom
	 */
	protected CompagnieCroisiere fabrique(Float prix, String nom) {
		CompagnieCroisiere compagnie = new CompagnieCroisiere(prix, nom);
		compagnie.setId(idGen.generateID());
		compagnie.setIdVoyageDebut(idGen.generateIDPrefixVoyage());
		return compagnie;
	}

}