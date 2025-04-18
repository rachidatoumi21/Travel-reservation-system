package Logiciel;

import java.time.LocalDateTime;

import Application.Compagnie;
import Application.CompagnieCroisiere;
import Application.Etablissement;
import Application.Itineraire;
import Application.Port;

public class CreateurItineraire extends CreateurVoyage {

	public Itineraire fabrique(Etablissement depart, Etablissement destination, LocalDateTime dateDep, LocalDateTime dateArr, Compagnie c) {
		if (!(depart instanceof Port) || !(destination instanceof Port)) {
			throw new IllegalArgumentException("Les établissements doivent être des ports.");
		}
		if (!(c instanceof CompagnieCroisiere)) {
			throw new IllegalArgumentException("La compagnie doit être une compagnie de croisière.");
		}
		Port departPort = (Port) depart;
		Port destinationPort = (Port) destination;
		CompagnieCroisiere compagnieCroisiere = (CompagnieCroisiere) c;
		Itineraire itineraire = new Itineraire(departPort, destinationPort, dateDep, dateArr, compagnieCroisiere);
		
		return itineraire;
	
	}

	

}