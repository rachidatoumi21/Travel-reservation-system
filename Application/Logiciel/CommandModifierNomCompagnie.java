package Logiciel;

import Application.Compagnie;

/**
 * Commande pour modifier le nom d’une compagnie.
 */
public class CommandModifierNomCompagnie implements Command {
    private final Compagnie compagnie;
    private final String nouveauNom;
    private String ancienNom;

    public CommandModifierNomCompagnie(Compagnie c, String nom) {
        this.compagnie  = c;
        this.nouveauNom = nom;
    }

    @Override
    public void redo() {
        ancienNom = compagnie.getNom();
        compagnie.setNom(nouveauNom);
    }

    @Override
    public void undo() {
        compagnie.setNom(ancienNom);
    }

    public void modifierNom(Compagnie c, String nom) {
        redo();
    }
}