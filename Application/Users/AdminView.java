package Users;

import Application.Itineraire;
import Application.Trajet;
import Application.Vol;
import Application.Voyage;
import Section.Arrangement;
import Section.Section;
import Section.SectionAvion;

import java.time.format.DateTimeFormatter;


class AdminView extends View implements Observateur, Visiteur {
	private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("yyyy.MM.dd:HH.mm");
	
	public AdminView(Database model) {
		super(model);
		model.addObservateur(this);
	}

	@Override
	public void update() {
	
		long volsCount = model.getVoyages().stream()
				.filter(v -> v instanceof Vol)
				.count();
		long trajetsCount = model.getVoyages().stream()
				.filter(v -> v instanceof Trajet)
				.count();
		long itinsCount = model.getVoyages().stream()
				.filter(v -> v instanceof Itineraire)
				.count();

		System.out.printf(
				"[Admin View] Database updated: %d vols, %d trajets, %d itinéraires%n",
				volsCount, trajetsCount, itinsCount);

		for (Voyage v : model.getVoyages()) {
			v.accept(this);
		}
	}

	@Override
	public void displayMenu() {
		System.out.println("Admin Menu:...");
	}

	@Override
	public String visitVol(Vol vol) {

		StringBuilder sb = new StringBuilder();

		sb.append(vol.getDepart().getCode()).append('-').append(vol.getArrivee().getCode())
				.append("[:").append(vol.getCompagnie().getNom()).append("]")
				.append(vol.getVoyageId())
				.append('(').append(vol.getDateDepart().format(FMT))
				.append('-').append(vol.getDateArrivee().format(FMT)).append(')');

		for (Section sec : vol.getVehicule().getSections()) {
			sec = (SectionAvion) sec;
			int total = sec.getArrangements().size();
			int reserved = 0;

			for (Arrangement a : sec.getArrangements())
				if (a.isConfirmed())

					reserved++;
			sb.append('|').append(sec.getType())
					.append('(').append(reserved).append('/').append(total).append(')')
					.append(String.format("%.2f", sec.getPrix()));
		}
		return sb.toString();
	}

	@Override
	public String visitTrajet(Trajet trajet) {
		StringBuilder sb = new StringBuilder();

		sb.append(trajet.getDepart().getCode()).append('-').append(trajet.getArrivee().getCode())
				.append("[:").append(trajet.getCompagnie().getNom()).append("]")
				.append(trajet.getVoyageId())
				.append('(').append(trajet.getDateDepart().format(FMT))
				.append('-').append(trajet.getDateArrivee().format(FMT)).append(')');

		for (Section sec : trajet.getVehicule().getSections()) {
			int total = sec.getArrangements().size();
			int reserved = 0;

			for (Arrangement a : sec.getArrangements())
				if (a.isConfirmed())
					reserved++;
			sb.append('|').append(sec.getType())
					.append('(').append(reserved).append('/').append(total).append(')')
					.append(String.format("%.2f", sec.getPrix()));
		}

		return sb.toString();
	}

	@Override
	public String visitItineraire(Itineraire itineraire) {
		StringBuilder sb = new StringBuilder();
		sb.append(itineraire.getDepart().getCode()).append('-').append(itineraire.getArrivee().getCode())
				.append("[:").append(itineraire.getCompagnie().getNom()).append("]")
				.append(itineraire.getVoyageId())
				.append('(').append(itineraire.getDateDepart().format(FMT))
				.append('-').append(itineraire.getDateArrivee().format(FMT)).append(')');

		for (Section sec : itineraire.getVehicule().getSections()) {
			int total = sec.getArrangements().size();
			int reserved = 0;

			for (Arrangement a : sec.getArrangements())
				if (a.isConfirmed())
					reserved++;
			sb.append('|').append(sec.getType())
					.append('(').append(reserved).append('/').append(total).append(')')
					.append(String.format("%.2f", sec.getPrix()));
		}
		
		return sb.toString();
	}
}