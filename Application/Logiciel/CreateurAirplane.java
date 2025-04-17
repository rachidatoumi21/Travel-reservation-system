package Logiciel;

import Application.Airplane;
import Application.Compagnie;
import Application.CompagnieAerienne;

public class CreateurAirplane extends CreateurMoyenTransport {

	protected Airplane fabrique(Compagnie compagnie) {
		if(!(compagnie instanceof CompagnieAerienne)) {
			throw new IllegalArgumentException("La compagnie doit être une Compagnie Aerienne.");
		}
		CompagnieAerienne compagnieAerienne = (CompagnieAerienne) compagnie;
		Airplane airplane = new Airplane(compagnieAerienne);
		airplane.setId(idGenerator.generateID());
		return airplane;
	}


}