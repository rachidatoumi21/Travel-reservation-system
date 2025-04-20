package Application;

public class Train extends MoyenTransport {
    public Train(Compagnie compagnie) {
        super(compagnie);
    }

    @Override
    protected void initSections() {
        
        // Initialisation des sections de train avec des exemples de données
        addSection(new SectionTrain( /* prix=... */ 100.00f, SectionTrainType.P, DispositionType.C));
        addSection(new SectionTrain( /* prix=... */ 50.00f, SectionTrainType.E, DispositionType.S));
    }
}