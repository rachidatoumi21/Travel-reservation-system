package Logiciel;

import Application.Compagnie;
import Application.MoyenTransport;

public abstract class CreateurMoyenTransport {
	protected MoyenTransportIDGenerator idGenerator = new MoyenTransportIDGenerator();
	
	protected abstract MoyenTransport fabrique(Compagnie compagnie);

	public MoyenTransport creerMoyenTransport(Compagnie compagnie) {
		return fabrique(compagnie);
	}

}