package Logiciel;

import Application.Port;

public class CreateurPort extends CreateurEtablissement {

	/**
	 * 
	 * @param ville
	 */
	protected Port fabrique(String nom, Ville ville) {
		Port port = new Port(nom, ville);
		port.setCode(idGenerator.generateID());
		return port;

	}
}