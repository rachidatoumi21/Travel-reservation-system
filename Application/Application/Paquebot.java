package Application;

import Section.SectionPaquebot;
import Section.SectionPaquebotType;

public class Paquebot extends MoyenTransport {
    public Paquebot(Compagnie compagnie) {
        super(compagnie);
    }

    @Override
    protected void initSections() {
        
        // Initialisation des sections de paquebot avec des exemples de données
        addSection(new SectionPaquebot( /* prix=100% */ 500.00f, SectionPaquebotType.D, /* nbCabin= */ 10));
        addSection(new SectionPaquebot( /* prix=90% */ 450.00f, SectionPaquebotType.F, /* nbCabin= */ 20));
        addSection(new SectionPaquebot( /* prix=75% */ 375.00f, SectionPaquebotType.O, /* nbCabin= */ 30));
        addSection(new SectionPaquebot( /* prix=50% */ 250.00f, SectionPaquebotType.I, /* nbCabin= */ 40));
    }
}