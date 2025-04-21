package PatronCommande;

import Application.Compagnie;

/**
 * Commande pour modifier le prix d’une compagnie.
 */
public class CommandModifierPrixCompagnie implements Command {
	private final Compagnie compagnie;
	private final float nouveauPrix;
	private float ancienPrix;

	public CommandModifierPrixCompagnie(Compagnie c, float prix) {
		this.compagnie = c;
		this.nouveauPrix = prix;
	}

	@Override
	public void redo() {
		ancienPrix = compagnie.getPrix(); // supposez getPrixBase()
		compagnie.setPrix(nouveauPrix);
	}

	@Override
	public void undo() {
		compagnie.setPrix(ancienPrix);
	}

	public void modifierPrix(Compagnie c, double prix) {
		redo();
	}
}