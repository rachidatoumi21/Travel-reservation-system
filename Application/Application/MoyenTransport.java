package Application;
public abstract class MoyenTransport {

	private String id;
	private Compagnie compagnie;

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
	
}