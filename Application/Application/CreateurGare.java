package Application;

public class CreateurGare extends CreateurEtablissement {

	/**
	 * 
	 * @param ville
	 */
	protected Gare fabrique(String nom, Ville ville) {
		Gare gare = new Gare(nom, ville);
		gare.setCode(idGenerator.generateID());
		return gare;
	}

}