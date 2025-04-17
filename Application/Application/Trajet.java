package Application;
import java.time.LocalTime;
import java.util.LinkedList;

import Logiciel.*;

public class Trajet extends Voyage {
	private LinkedList<Gare> garesIntermediaires = new LinkedList<Gare>();
	public Trajet(Gare depart,Gare destination,LocalTime dateDep, LocalTime dateArr, TrainLigne c) {
		super(depart, destination, dateDep, dateArr, c);
		
	}
	/**
	 * 
	 * @param visitor
	 */
	public void accept(Visiteur visitor) {
		// TODO - implement Trajet.accept
		throw new UnsupportedOperationException();
	}
	public LinkedList<Gare> getGaresIntermediaires() {
		return garesIntermediaires;
	}
	public void setGaresIntermediaires(LinkedList<Gare> garesIntermediaires) {
		this.garesIntermediaires = garesIntermediaires;
	}
	

}