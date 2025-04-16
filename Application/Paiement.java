import Logiciel.*;

public class Paiement implements PaymentAdaptateur {

	private String transactionId;
	private double montant;
	private DateTime datePaiement;
	private ModePaiment modePaiement;
	private PaymentAdaptateur processor;

	/**
	 * 
	 * @param paiement
	 */
	public boolean effectuerPaiment(Paiement paiement) {
		// TODO - implement Paiement.effectuerPaiment
		throw new UnsupportedOperationException();
	}

	public String getTransactionId() {
		return this.transactionId;
	}

	/**
	 * 
	 * @param client
	 * @param numReservation
	 * @param modePaiement
	 * @param infoCarte
	 */
	public boolean creerPaiement(Client client, String numReservation, ModePaiement modePaiement, String infoCarte) {
		// TODO - implement Paiement.creerPaiement
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param processor
	 */
	public void setProcessor(PaymentAdaptateur processor) {
		this.processor = processor;
	}

}