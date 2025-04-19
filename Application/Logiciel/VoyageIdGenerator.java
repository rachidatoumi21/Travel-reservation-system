package Logiciel;

public class VoyageIdGenerator extends IdGenerator {

	private static VoyageIdGenerator _instance = new VoyageIdGenerator();
	private String lastID = "0";

	public String generateID() {
		int nombreVoyages = Integer.parseInt(lastID);
		nombreVoyages++;
		lastID = String.valueOf(nombreVoyages);
		return lastID;
	}

	public VoyageIdGenerator getInstance() {
		return _instance;
	}

}