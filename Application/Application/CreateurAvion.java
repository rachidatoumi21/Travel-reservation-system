package Application;

public class CreateurAvion extends CreateurMoyenTransport {

	protected Avion fabrique(Compagnie compagnie) {
		if(!(compagnie instanceof CompagnieAerienne)) {
			throw new IllegalArgumentException("La compagnie doit être une Compagnie Aerienne.");
		}
		CompagnieAerienne compagnieAerienne = (CompagnieAerienne) compagnie;
		Avion airplane = new Avion(compagnieAerienne);
		airplane.setId(idGenerator.generateID());
		return airplane;
	}


}