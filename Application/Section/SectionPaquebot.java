package Section;

public class SectionPaquebot extends Section {

	private SectionPaquebotType type;
	private int nbCabin;

	public SectionPaquebot(float prix, SectionPaquebotType type, int nbCabin) {
		super(prix);
		this.type = type;
		this.nbCabin = nbCabin;
	}

	@Override
	public String getType() {
		return type.name();
	}

	public int getNbCabin() {
		return nbCabin;
	}
}