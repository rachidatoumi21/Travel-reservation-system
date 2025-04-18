package Application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class MoyenTransport {

	private String id;
	private Compagnie compagnie;
	private List <Section> sections = new ArrayList<>();

	public MoyenTransport(Compagnie compagnie) {
		setCompagnie(compagnie);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Compagnie getCompagnie() {
		return compagnie;
	}

	public void setCompagnie(Compagnie compagnie) {
		this.compagnie = compagnie;
	}
	
    protected void addSection(Section section) {
        if (section != null && !sections.contains(section)) {
            sections.add(section);
        }
    }

    public List<Section> getSections() {
        return Collections.unmodifiableList(sections);
    }

	/**
	 * Subclasses must implement to define and add their specific Section instances.
	 */
	protected abstract void initSections();
	
}