package PatronCommande;
import Application.Etablissement;
import Application.Ville;

public class CommandModifierVilleEtablissement implements Command {
    private Etablissement etablissement;
    private Ville nouvelleVille;
    private Ville ancienneVille;

    public CommandModifierVilleEtablissement(Etablissement e, Ville v) {
        this.etablissement = e;
        this.nouvelleVille = v;
    }

    @Override
    public void redo() {
        // sauvegarde de l’état avant modification
        ancienneVille = etablissement.getVille();
        etablissement.setVille(nouvelleVille);
    }

    @Override
    public void undo() {
        etablissement.setVille(ancienneVille);
    }

    /** Point d’entrée direct, comme défini en UML */
    public void modifierVille(Etablissement e, Ville v) {
        redo();
    }
}