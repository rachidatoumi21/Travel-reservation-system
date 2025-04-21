package Application;

public abstract class CreateurMoyenTransport {
	protected MoyenTransportIDGenerator idGenerator = new MoyenTransportIDGenerator();
	
	protected abstract MoyenTransport fabrique(Compagnie compagnie);

	public MoyenTransport creerMoyenTransport(Compagnie compagnie) {
		return fabrique(compagnie);
	}

}