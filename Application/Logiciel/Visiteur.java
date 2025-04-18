package Logiciel;

import Application.Itineraire;
import Application.Trajet;
import Application.Vol;

public interface Visiteur {

	
	String visitVol(Vol vol);

	String visitTrajet(Trajet trajet);

	String visitItineraire(Itineraire itineraire);

}