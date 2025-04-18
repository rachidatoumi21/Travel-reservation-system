package Application;
import Logiciel.*;

/**
 * A seat arrangement on an aircraft or train.
 */
public class Siege extends Arrangement {

	private int rang;
	private char col;
	private SiegePreference siegePreference;
	private EtatArrangement currentState;

	public Siege(Section section,
			int rang,
			char col,
			SiegePreference siegePreference,
			float prix) {
		super(section, prix);
		this.rang = rang;
		this.col = col;
		this.siegePreference = siegePreference;
		this.currentState = new EtatLibre();
		section.addArrangement(this);
	}

	public int getRang() {
		return rang;
	}

	public char getCol() {
		return col;
	}

	public SiegePreference getSiegePreference() {
		return siegePreference;
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