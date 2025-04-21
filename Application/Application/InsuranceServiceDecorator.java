package Application;

import Reservation.ReservationComponent;
import Reservation.ReservationDecorator;

// Décorateur pour l’assurance
public class InsuranceServiceDecorator extends ReservationDecorator {

    public InsuranceServiceDecorator(ReservationComponent reservation) {
        super(reservation);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Assurance";
    }

    @Override
    public double getCost() {
        return super.getCost() + insuranceCost();
    }

    private double insuranceCost() {
        // tarif fixe ou pourcentage…
        return 15.0;
    }
}