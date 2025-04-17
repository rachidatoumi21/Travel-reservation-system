package Application;
import java.time.LocalTime;
/**
 * Type de voyage: Vol, itineraire, trajet
 */
public abstract class Voyage {

	private MoyenTransport vehicule;
	private String voyageId;
	private Etablissement depart;
	private Etablissement destination;
	private LocalTime dateDepart;
	private LocalTime dateArrivee;
	private Compagnie compagnie;

	public Voyage(Etablissement depart, Etablissement destination, LocalTime dateDep, LocalTime dateArr, Compagnie c) {
		setDepart(depart);
		setDestination(destination);
		setDateDepart(dateDep);
		setDateArrivee(dateArr);
		setCompagnie(c);
	}

	public MoyenTransport getVehicule() {
		return vehicule;
	}

	public void setVehicule(MoyenTransport vehicule) {
		this.vehicule = vehicule;
	}

	public String getVoyageId() {
		return voyageId;
	}

	public void setVoyageId(String voyageId) {
		this.voyageId = voyageId;
	}

	public Etablissement getDepart() {
		return depart;
	}

	public void setDepart(Etablissement depart) {
		this.depart = depart;
	}

	public Etablissement getDestination() {
		return destination;
	}

	public void setDestination(Etablissement destination) {
		this.destination = destination;
	}

	public LocalTime getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(LocalTime dateDepart) {
		this.dateDepart = dateDepart;
	}

	public LocalTime getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(LocalTime dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public Compagnie getCompagnie() {
		return compagnie;
	}

	public void setCompagnie(Compagnie compagnie) {
		this.compagnie = compagnie;
	}


}