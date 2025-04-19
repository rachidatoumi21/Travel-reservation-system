package Logiciel;

public class MoyenTransportIDGenerator extends IdGenerator {

	private MoyenTransportIDGenerator _instance;
	private String lastID = "T0"; // ID de départ pour les moyens de transport

	public String generateID() {
		char premiereLettre = lastID.charAt(0);
		int partieNumerique = Integer.parseInt(lastID.substring(1));
		partieNumerique++;
		lastID = "" + premiereLettre + partieNumerique;
		return lastID;
	}

	public MoyenTransportIDGenerator getInstance() {
		return _instance;
	}

}