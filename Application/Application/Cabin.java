package Application;
import Logiciel.*;

/**
 * A cabin arrangement on a cruise.
 */
public class Cabin extends Arrangement {

	private String numeroCabine;
	private int capacite;
	private EtatArrangement currentState;

	public Cabin(Section section,
			String numeroCabine,
			int capacite,
			float prix) {
		super(section, prix);
		this.numeroCabine = numeroCabine;
		this.capacite = capacite;
		this.currentState = new EtatLibre();
		section.addArrangement(this);
	}

	public String getNumeroCabine() {
		return numeroCabine;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setEtat(EtatArrangement newState) {
		this.currentState = newState;
	}

	public void reserver() {
		currentState.reserver(this);
	}

	public void liberer() {
		currentState.liberer(this);
	}

	public void occuper() {
		currentState.occuper(this);
	}
}
