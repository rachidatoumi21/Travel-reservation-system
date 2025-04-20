package Logiciel;

// Décorateur pour le service repas
public class MealServiceDecorator extends ReservationDecorator {
    public MealServiceDecorator(ReservationComponent reservation) {
        super(reservation);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Service Repas";
    }

    @Override
    public double getCost() {
        return super.getCost() + mealCost();
    }

    private double mealCost() {
        // tarif fixe ou calcul selon la section…
        return 25.0;
    }
}