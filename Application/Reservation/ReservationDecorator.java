package Reservation;

// Decorator abstrait (déjà dans le diagramme)
public abstract class ReservationDecorator implements ReservationComponent {
    protected ReservationComponent reservation;

    public ReservationDecorator(ReservationComponent reservation) {
        this.reservation = reservation;
    }

    @Override
    public String getDescription() {
        return reservation.getDescription();
    }

    @Override
    public double getCost() {
        return reservation.getCost();
    }
}