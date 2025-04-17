package Application;
import java.time.LocalTime;
import java.util.List;

import Logiciel.*;

public class Itineraire extends Voyage {

	private List<Port> portsVisites;

	public Itineraire(Port depart, Port destination, LocalTime dateDep, LocalTime dateArr, CompagnieCroisiere c, List<Port> portsVisites) {
		super(depart, destination, dateDep, dateArr, c);
		setPortsVisites(portsVisites);
	}

	public Itineraire(Port depart, Port destination, LocalTime dateDep, LocalTime dateArr, CompagnieCroisiere c) {
		super(depart, destination, dateDep, dateArr, c);
	}

	/**
	 * 
	 * @param visitor
	 */
	public void accept(Visiteur visitor) {
		// TODO - implement Itineraire.accept
		throw new UnsupportedOperationException();
	}
	public List<Port> getPortsVisites() {
		return portsVisites;
	}
	public void setPortsVisites(List<Port> portsVisites) {
		this.portsVisites = portsVisites;
	}

}