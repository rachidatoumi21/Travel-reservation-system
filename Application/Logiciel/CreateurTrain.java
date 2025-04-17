package Logiciel;

import Application.Compagnie;
import Application.Train;
import Application.TrainLigne;

public class CreateurTrain extends CreateurMoyenTransport {

	protected Train fabrique(Compagnie compagnie) {
		if (!(compagnie instanceof TrainLigne)) {
			throw new IllegalArgumentException("La compagnie doit être une Compagnie.");
		}
		TrainLigne compagnieTrain = (TrainLigne) compagnie;
		Train train = new Train(compagnieTrain);
		train.setId(idGenerator.generateID());
		return train;
	}

	

}