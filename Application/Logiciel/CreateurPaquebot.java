package Logiciel;

import Application.Compagnie;
import Application.CompagnieCroisiere;
import Application.Paquebot;

public class CreateurPaquebot extends CreateurMoyenTransport {

	protected Paquebot fabrique(Compagnie compagnie) {

		if (!(compagnie instanceof CompagnieCroisiere)) {
			throw new IllegalArgumentException("La compagnie doit être une Compagnie.");
		}

		CompagnieCroisiere compagnieCroisiere = (CompagnieCroisiere) compagnie;
		Paquebot cruiseship = new Paquebot(compagnieCroisiere);
		cruiseship.setId(idGenerator.generateID());
		
		return cruiseship;
	}

	

}