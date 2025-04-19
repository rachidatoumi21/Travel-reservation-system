package Logiciel;

import Application.TrainLigne;

public class CreateurTrainLigne extends CreateurCompagnie {

	/**
	 * 
	 * @param prix
	 * @param nom
	 */
	protected TrainLigne fabrique(Float prix, String nom) {
		TrainLigne compagnie = new TrainLigne(prix, nom);
		compagnie.setId(idGen.generateID());
		compagnie.setIdVoyageDebut(idGen.generateIDPrefixVoyage());
		return compagnie;
	}

}