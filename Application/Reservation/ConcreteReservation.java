package Reservation;

// Composant concret (déjà dans le diagramme)
public class ConcreteReservation implements ReservationComponent {
    private String numReservation;
    private double cost;

    public ConcreteReservation(String numReservation, double cost) {
        this.numReservation = numReservation;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return "Réservation #" + numReservation;
    }

    @Override
    public double getCost() {
        return cost;
    }
}