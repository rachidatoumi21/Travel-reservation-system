package Logiciel;

import Application.Compagnie;
import Application.CompagnieCroisiere;
import Application.Cruiseship;

public class CreateurCruiseship extends CreateurMoyenTransport {

	protected Cruiseship fabrique(Compagnie compagnie) {
		if (!(compagnie instanceof CompagnieCroisiere)) {
			throw new IllegalArgumentException("La compagnie doit être une Compagnie.");
		}
		CompagnieCroisiere compagnieCroisiere = (CompagnieCroisiere) compagnie;
		Cruiseship cruiseship = new Cruiseship(compagnieCroisiere);
		cruiseship.setId(idGenerator.generateID());
		return cruiseship;
	}

	

}