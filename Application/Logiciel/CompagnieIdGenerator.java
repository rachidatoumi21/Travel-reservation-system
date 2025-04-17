package Logiciel;

public class CompagnieIdGenerator extends IdGenerator {

	private static CompagnieIdGenerator _instance = new CompagnieIdGenerator();
	private String lastID = "A0";
	private String idPrefixVoyage = "AA"; // Prefix for Compagnie IDs

	public String generateID() {
		// Separer la partie alphabetique et numerique de l'ID
        char partieLettre = lastID.charAt(0);
        int partieNumerique = Integer.parseInt(lastID.substring(1));
        
        partieNumerique++;
        
        // Check if the numeric part exceeds 4 digits (moins de six caractères uniques à chaque compagnie)
        if (String.valueOf(partieNumerique).length() > 4) {
            partieNumerique = 0;
            partieLettre++;
        }
        
        // Nouveau ID
        lastID = partieLettre + String.valueOf(partieNumerique);
        
        return lastID;
	}

	public String generateIDPrefixVoyage() {
		char premiereLettre = idPrefixVoyage.charAt(0);
		char deuxiemeLettre = idPrefixVoyage.charAt(1);
		deuxiemeLettre++;
		if (deuxiemeLettre > 'Z') {
			deuxiemeLettre = 'A';
			premiereLettre++;
		}
		idPrefixVoyage = "" + premiereLettre + deuxiemeLettre;
		
		return idPrefixVoyage;
	}

	public CompagnieIdGenerator getInstance() {
		return _instance;
	}

}