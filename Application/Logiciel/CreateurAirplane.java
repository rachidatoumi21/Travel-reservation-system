package Logiciel;

import Application.Airplane;
import Application.Compagnie;

public class CreateurAirplane extends CreateurMoyenTransport {

	protected Airplane fabrique(Compagnie compagnie) {
		Airplane airplane = new Airplane(compagnie);
		airplane.setId(idGenerator.generateID());
		return airplane;
	}


}