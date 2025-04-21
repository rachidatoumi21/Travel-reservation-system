package Application;

public class CreateurAeroport extends CreateurEtablissement {

	/**
	 * 
	 * @param ville
	 */
	protected Aeroport fabrique(String nom, Ville ville) {
		Aeroport aeroport = new Aeroport(nom, ville);
		aeroport.setCode(idGenerator.generateID());
		return aeroport;
	}

}