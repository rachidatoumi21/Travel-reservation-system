package Logiciel;


import Application.CompagnieAerienne;

public class CreateurCompagnieAerienne extends CreateurCompagnie {

	/**
	 * 
	 * @param prix
	 * @param nom
	 */
	protected CompagnieAerienne fabrique(Float prix, String nom) {
		CompagnieAerienne compagnie = new CompagnieAerienne(prix, nom);
		compagnie.setId(idGen.generateID());
		compagnie.setIdVoyageDebut(idGen.generateIDPrefixVoyage());

		return compagnie;
	}

}