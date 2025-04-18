package Application;


public class Avion extends MoyenTransport {
    
    public Avion(Compagnie compagnie) {
        super(compagnie);
    }

    @Override
    protected void initSections() {
        // Initialisation des sections d'avion avec des exemples de données
        addSection(new SectionAvion( /* prix= */ 474.00f, SectionAvionType.F, /* rangee= */ 5, /* col= */ 3,
                DispositionType.S));
        addSection(new SectionAvion( /* prix= */ 355.50f, SectionAvionType.A, /* rangee= */ 4, /* col= */ 4,
                DispositionType.C));
        addSection(new SectionAvion( /* prix= */ 237.00f, SectionAvionType.E, /* rangee= */ 25, /* col= */ 10,
                DispositionType.L));
    }

    
}