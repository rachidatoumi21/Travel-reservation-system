package Logiciel;

import Application.Compagnie;
import Application.Train;

public class CreateurTrain extends CreateurMoyenTransport {

	protected Train fabrique(Compagnie compagnie) {
		Train train = new Train(compagnie);
		train.setId(idGenerator.generateID());
		return train;
	}

	

}