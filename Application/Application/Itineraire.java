package Application;
import Logiciel.*;

public class Itineraire extends Voyage {

	private Port depart;
	private Port destination;
	private int nbCabinsDispo;
	private List<Port> portsVisit�s;

	/**
	 * 
	 * @param visitor
	 */
	public void accept(Visiteur visitor) {
		// TODO - implement Itineraire.accept
		throw new UnsupportedOperationException();
	}

}