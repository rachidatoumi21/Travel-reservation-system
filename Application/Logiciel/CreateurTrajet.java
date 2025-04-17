package Logiciel;

import java.time.LocalTime;

import Application.Compagnie;
import Application.Etablissement;
import Application.Gare;
import Application.TrainLigne;
import Application.Trajet;
import Application.Voyage;

public class CreateurTrajet extends CreateurVoyage {

	protected Voyage fabrique(Etablissement depart, Etablissement destination, LocalTime dateDep, LocalTime dateArr,
			Compagnie c) {
		if (!(depart instanceof Gare) || !(destination instanceof Gare)) {
			throw new IllegalArgumentException("Les établissements doivent être des gares.");
		}
		if (!(c instanceof TrainLigne)) {
			throw new IllegalArgumentException("La compagnie doit être une ligne de train.");
		}
		Gare departGare = (Gare) depart;
		Gare destinationGare = (Gare) destination;
		TrainLigne compagnieTrain = (TrainLigne) c;
		Trajet trajet = new Trajet(departGare, destinationGare, dateDep, dateArr, compagnieTrain);
		return trajet;
	}

}