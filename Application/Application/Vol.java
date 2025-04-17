package Application;
import java.time.LocalTime;

import Logiciel.*;

public class Vol extends Voyage {

	/**
	 * 
	 * @param visitor
	 */
	public Vol(Aeroport depart, Aeroport destination, LocalTime dateDep, LocalTime dateArr, CompagnieAerienne c) {
		super(depart, destination, dateDep, dateArr, c);
	}
	public void accept(Visiteur visitor) {
		// TODO - implement Vol.accept
		throw new UnsupportedOperationException();
	}

}