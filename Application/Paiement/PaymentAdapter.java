package Paiement;

// Adapter : implémente l’interface cible en déléguant à l’ExternalPaymentSystem
public class PaymentAdapter implements PaymentAdaptateur {

    private ExternalPaymentSystem externalSystem;
    private Paiement paiement;    // référence au Paiement à traiter

    public PaymentAdapter(ExternalPaymentSystem externalSystem, Paiement paiement) {
        this.externalSystem = externalSystem;
        this.paiement = paiement;
    }

    @Override
    public void processPayment() {
        // on délègue l’exécution du paiement
        boolean succes = externalSystem.executeTransaction(paiement.getMontant());
		
        if (succes) {
            paiement.updateStatus("CONFIRMED");
        } else {
            paiement.updateStatus("FAILED");
        }
    }
}