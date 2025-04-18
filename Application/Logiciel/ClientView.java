package Logiciel;

import java.time.format.DateTimeFormatter;
import java.util.List;

import Application.Arrangement;
import Application.Itineraire;
import Application.Section;
import Application.Trajet;
import Application.Vol;
import Application.Voyage;

public class ClientView extends View implements Observateur, Visiteur {

	private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("yyyy.MM.dd:HH.mm");

    public ClientView(Database model) {
        super(model);
        model.addObservateur(this);
    }

    @Override
    public void update() {
        System.out.println("[Client View] Availability update:");
        for (Voyage v : model.getVoyages()) {
            v.accept(this);
        }
    }

    @Override
    public void displayMenu() {
        System.out.println("Client Menu: ...");
    }

    @Override
    public String visitVol(Vol vol) {
        StringBuilder sb = new StringBuilder();
        sb.append(vol.getDepart().getCode()).append('-')
          .append(vol.getDestination().getCode())
          .append("[:").append(vol.getCompagnie().getNom()).append("]")
          .append(vol.getVoyageId())
          .append('(').append(vol.getDateDepart().format(FMT))
          .append('-').append(vol.getDateArrivee().format(FMT)).append(')');
        for (Section sec : vol.getVehicule().getSections()) {
            if (!"E".equals(sec.getType())) continue;
            int free = 0;
            for (Arrangement a : sec.getArrangements()) if (a.isDisponible() && !a.isConfirmed()) free++;
            sb.append('|')
              .append(String.format("%.2f", sec.getPrix()))
              .append("|E").append(free);
        }
        return sb.toString();
    }

    @Override
    public String visitTrajet(Trajet trajet) {
        StringBuilder sb = new StringBuilder();
        sb.append(trajet.getDepart().getCode()).append('-')
          .append(trajet.getDestination().getCode())
          .append("[:").append(trajet.getCompagnie().getNom()).append("]")
          .append(trajet.getVoyageId())
          .append('(').append(trajet.getDateDepart().format(FMT))
          .append('-').append(trajet.getDateArrivee().format(FMT)).append(')');
        for (Section sec : trajet.getVehicule().getSections()) {
            if (!"E".equals(sec.getType())) continue;
            int free = 0;
            for (Arrangement a : sec.getArrangements()) if (a.isDisponible() && !a.isConfirmed()) free++;
            sb.append('|')
              .append(String.format("%.2f", sec.getPrix()))
              .append("|E").append(free);
        }
        return sb.toString();
    }

    @Override
    public String visitItineraire(Itineraire itineraire) {
        StringBuilder sb = new StringBuilder();
        sb.append(itineraire.getDepart().getCode()).append('-')
          .append(itineraire.getDestination().getCode())
          .append("[:").append(itineraire.getCompagnie().getNom()).append("]")
          .append(itineraire.getVoyageId())
          .append('(').append(itineraire.getDateDepart().format(FMT))
          .append('-').append(itineraire.getDateArrivee().format(FMT)).append(')');
        for (Section sec : itineraire.getVehicule().getSections()) {
            if (!"E".equals(sec.getType())) continue;
            int free = 0;
            for (Arrangement a : sec.getArrangements()) if (a.isDisponible() && !a.isConfirmed()) free++;
            sb.append('|')
              .append(String.format("%.2f", sec.getPrix()))
              .append("|E").append(free);
        }
        return sb.toString();
    }

}