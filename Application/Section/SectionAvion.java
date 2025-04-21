package Section;

public class SectionAvion extends Section {

	private SectionAvionType type;
	private int nbRang;
	private int nbCol;
	private DispositionType disposition;

	public SectionAvion(float prix, SectionAvionType type, int nbRang, int nbCol, DispositionType disposition) {
		super(prix);
		this.type = type;
		this.nbRang = nbRang;
		this.nbCol = nbCol;
		this.disposition = disposition;
	}

	@Override
	public String getType() {
		return type.name();
	}

	public int getNbRang() {
		return nbRang;
	}

	public int getNbCol() {
		return nbCol;
	}

	public DispositionType getDisposition() {
		return disposition;
	}
}
