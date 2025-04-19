package Application;
import java.time.LocalDateTime;
import java.util.LinkedList;

import Logiciel.*;

public class Trajet extends Voyage {
	
	private LinkedList<Gare> garesIntermediaires = new LinkedList<Gare>();
	
	public Trajet(Gare depart,Gare destination,LocalDateTime dateDep, LocalDateTime dateArr, TrainLigne c) {
		super(depart, destination, dateDep, dateArr, c);
		
	}
	
	@Override
	public void accept(Visiteur visitor) {
		visitor.visitTrajet(this);
	}
	public LinkedList<Gare> getGaresIntermediaires() {
		return garesIntermediaires;
	}
	public void setGaresIntermediaires(LinkedList<Gare> garesIntermediaires) {
		this.garesIntermediaires = garesIntermediaires;
	}
	

}