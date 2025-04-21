package Application;

import java.time.LocalDateTime;

public class CreateurVol extends CreateurVoyage {

	
	protected Voyage fabrique(Etablissement depart, Etablissement destination, LocalDateTime dateDep, LocalDateTime dateArr, Compagnie c) {
		if (!(depart instanceof Aeroport) || !(destination instanceof Aeroport)) {
			throw new IllegalArgumentException("Les établissements doivent être des aéroports.");
		}
		if (!(c instanceof CompagnieAerienne)) {
			throw new IllegalArgumentException("La compagnie doit être une compagnie aérienne.");
		}
		Aeroport departAeroport = (Aeroport) depart;
		Aeroport destinationAeroport = (Aeroport) destination;
		CompagnieAerienne compagnieAerienne = (CompagnieAerienne) c;

		Vol vol = new Vol(departAeroport, destinationAeroport, dateDep, dateArr, compagnieAerienne);

		return vol;
	}

	


}