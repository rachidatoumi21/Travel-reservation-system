package Logiciel;

public class EtablissementIdGenerator extends IdGenerator {

	private static EtablissementIdGenerator _instance = new EtablissementIdGenerator();
	private String lastID = "AAA";

	public String generateID() {
		char premiereLettre = lastID.charAt(0);
		char deuxiemeLettre = lastID.charAt(1);
		char troisiemeLettre = lastID.charAt(2);

		troisiemeLettre++;
		deuxiemeLettre++;

		if (troisiemeLettre > 'Z') {
			troisiemeLettre = 'A';
			deuxiemeLettre++;
		}
		if (deuxiemeLettre > 'Z') {
			deuxiemeLettre = 'A';
			premiereLettre++;
		}
		lastID = "" + premiereLettre + deuxiemeLettre + troisiemeLettre;
		
		return lastID;
	}

	public EtablissementIdGenerator getInstance() {
		return _instance;
	}

}