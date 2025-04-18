package Logiciel;

import java.time.LocalDateTime;

import Application.Compagnie;
import Application.Etablissement;
import Application.Voyage;

public abstract class CreateurVoyage {
	protected VoyageIdGenerator voyageIdGenerator = new VoyageIdGenerator();

	protected abstract Voyage fabrique(Etablissement depart, Etablissement destination, LocalDateTime dateDep, LocalDateTime dateArr, Compagnie c);

	public Voyage creerVoyage(Etablissement depart, Etablissement destination, LocalDateTime dateDep, LocalDateTime dateArr, Compagnie c) {
		return fabrique(depart, destination, dateDep, dateArr, c);
	}

}