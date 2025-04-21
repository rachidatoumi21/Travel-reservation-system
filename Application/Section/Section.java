package Section;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Section {

	private float prix;
	private List<Arrangement> arrangements;

	public Section(float prix) {
		this.prix = prix;
		this.arrangements = new ArrayList<>();
	}
	
	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public void addArrangement(Arrangement arrangement) {
		if (arrangement != null && !arrangements.contains(arrangement)) {
			arrangements.add(arrangement);
		}
	}

 	public List<Arrangement> getArrangements() {
        return Collections.unmodifiableList(arrangements);
    }

    public List<Arrangement> findAvailableArrangement() {
        List<Arrangement> available = new ArrayList<>();
        for (Arrangement a : arrangements) {
            if (a.isDisponible() && !a.isConfirmed()) {
                available.add(a);
            }
        }
        return available;
    }

	/**
	 * Returns the section type code, e.g. "F", "A", "E".
	 */
	public abstract String getType();


}