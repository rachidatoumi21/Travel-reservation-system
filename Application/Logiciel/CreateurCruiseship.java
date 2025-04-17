package Logiciel;

import Application.Compagnie;
import Application.Cruiseship;

public class CreateurCruiseship extends CreateurMoyenTransport {

	protected Cruiseship fabrique(Compagnie compagnie) {
		Cruiseship cruiseship = new Cruiseship(compagnie);
		cruiseship.setId(idGenerator.generateID());
		return cruiseship;
	}

	

}