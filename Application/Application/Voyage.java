package Application;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Type de voyage: Vol, itineraire, trajet
 */
public abstract class Voyage {

	private MoyenTransport vehicule;
	private String voyageId;
	private Etablissement depart;
	private Etablissement destination;
	private LocalDateTime dateDepart;
	private LocalDateTime dateArrivee;
	private Compagnie compagnie;
	private List<Arrangement> arrangements = new ArrayList<>();

	public Voyage(Etablissement depart, Etablissement destination, LocalDateTime dateDep, LocalDateTime dateArr, Compagnie c) {
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

	public LocalDateTime getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(LocalDateTime dateDepart) {
		this.dateDepart = dateDepart;
	}

	public LocalDateTime getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(LocalDateTime dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public Compagnie getCompagnie() {
		return compagnie;
	}

	public void setCompagnie(Compagnie compagnie) {
		this.compagnie = compagnie;
	}

	public List<Arrangement> getArrangements() {
		return Collections.unmodifiableList(arrangements);
	}


}