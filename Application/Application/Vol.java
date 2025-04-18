package Application;
import java.time.LocalDateTime;

import Logiciel.*;

public class Vol extends Voyage {

	public Vol(Aeroport depart, Aeroport destination, LocalDateTime dateDep, LocalDateTime dateArr, CompagnieAerienne c) {
		super(depart, destination, dateDep, dateArr, c);
	}

	@Override
	public void accept(Visiteur visitor) {
		visitor.visitVol(this);
	}

}