package Logiciel;

public class ConcreteReservation implements ReservationComponent {

	private String numReservation;
	private double cost;

	public String getDescription() {
		// TODO - implement ConcreteReservation.getDescription
		throw new UnsupportedOperationException();
	}

	public double getCost() {
		return this.cost;
	}

}