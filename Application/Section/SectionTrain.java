package Section;

public class SectionTrain extends Section {

	private SectionTrainType type;
	private DispositionType disposition;

	public SectionTrain(float prix, SectionTrainType type, DispositionType disposition) {
		super(prix);
		this.type = type;
		this.disposition = disposition;
	}

	@Override
	public String getType() {
		return type.name();
	}

	public DispositionType getDisposition() {
		return disposition;
	}
}