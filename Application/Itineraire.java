import Logiciel.*;

public class Itineraire extends Voyage {

	private Port depart;
	private Port destination;
	private int nbCabinsDispo;
	private List<Port> portsVisités;

	/**
	 * 
	 * @param visitor
	 */
	public void accept(Visiteur visitor) {
		// TODO - implement Itineraire.accept
		throw new UnsupportedOperationException();
	}

}