package Application;
import java.time.LocalDateTime;
import java.util.List;

import Logiciel.*;

public class Itineraire extends Voyage {

	private List<Port> portsVisites;

	public Itineraire(Port depart, Port destination, LocalDateTime dateDep, LocalDateTime dateArr, CompagnieCroisiere c, List<Port> portsVisites) {
		super(depart, destination, dateDep, dateArr, c);
		setPortsVisites(portsVisites);
	}

	public Itineraire(Port depart, Port destination, LocalDateTime dateDep, LocalDateTime dateArr, CompagnieCroisiere c) {
		super(depart, destination, dateDep, dateArr, c);
	}

	@Override
	public void accept(Visiteur visitor) {
		visitor.visitItineraire(this);
	}
	public List<Port> getPortsVisites() {
		return portsVisites;
	}
	public void setPortsVisites(List<Port> portsVisites) {
		this.portsVisites = portsVisites;
	}

}