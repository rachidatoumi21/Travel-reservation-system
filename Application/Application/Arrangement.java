package Application;

public abstract class Arrangement {

	private boolean estDisponible;
	private boolean isConfirmed;
	private float prix;
	private Section section;

	
	/**
	 * @param section the section (class) of the vehicle
	 * @param prix    price for this arrangement
	 */
	public Arrangement(Section section, float prix) {
		this.section = section;
		this.prix = prix;
		this.estDisponible = true;
		this.isConfirmed = false;
	}

	public Section getSection() {
		return section;
	}

	public boolean isDisponible() {
		return estDisponible;
	}
	
	public void setDisponible(boolean estDisponible) {
		this.estDisponible = estDisponible;
	}

	public boolean isConfirmed() {
		return isConfirmed;
	}

	public void setConfirmed(boolean confirmed) {
		this.isConfirmed = confirmed;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

}