package Paiement;
import java.time.LocalDateTime;

import Reservation.Reservation;
import Users.Client;

import java.util.UUID;



public class Paiement {

	private String transactionId;
	private double montant;
	private LocalDateTime datePaiement;
	private ModePaiment modePaiement;
	private PaymentAdaptateur processor;
	private String statut;

	 // ——— constructeurs, getters/setters existants… ———
	 public Paiement(String transactionId, double montant, ModePaiment modePaiement, String statut) {
        this.transactionId = transactionId;
        this.montant       = montant;
        this.modePaiement  = modePaiement;
		this.statut        = statut;
    }

	/**
     * Lance le paiement via le PaymentAdaptateur, puis
     * renvoie true si le statut est "CONFIRMED".
     */
	public boolean effectuerPaiement(Paiement p) {
        if (processor == null) {
            throw new IllegalStateException("Processor non défini");
        }
        processor.processPayment();
        return "CONFIRMED".equals(this.statut);
    }

	

	/**
	 * 
	 * @param client
	 * @param numReservation
	 * @param modePaiement
	 * @param infoCarte
	 */
	 /**
     * Crée et prépare un Paiement pour la réservation donnée.
     *
     * @param client          le client qui paie
     * @param numReservation  l’identifiant de la réservation
     * @param modePaiement    le mode de paiement choisi
     * @param infoCarte       les infos de carte (passées à l’ExternalPaymentSystem)
     * @return true si la réservation existe et que le paiement a pu être configuré, false sinon
     */
    public boolean creerPaiement(Client client,
                                 String numReservation,
                                 ModePaiment modePaiement,
                                 String infoCarte) {

        // 1) Récupérer la réservation par son numéro
        Reservation reservation = Reservation.getReservationDetails(numReservation);
        if (reservation == null || ! reservation.getClient().equals(client)) {
            return false;
        }

        // 2) Générer un ID de transaction unique
        this.transactionId = UUID.randomUUID().toString();

        // 3) Déterminer le montant à payer à partir du Voyage associé
         // 3) Prendre le montant depuis la réservation
		this.montant = reservation.getPrix();

        // 4) Mémoriser le mode et initialiser le statut
        this.modePaiement = modePaiement;
        this.statut       = "PENDING";

        // 5) Construire l’adaptateur de paiement
        ExternalPaymentSystem eps = new ExternalPaymentSystem(infoCarte);
        this.processor = new PaymentAdapter(eps, this);

        return true;
    
	}

	/**
	 * 
	 * @param processor
	 */
	public void setProcessor(PaymentAdaptateur processor) {
		this.processor = processor;
	}

	/**
     * Met à jour le statut du paiement (ex. "CONFIRMED" ou "FAILED")
     * et renseigne la date de paiement si confirmé.
     */
    public void updateStatus(String newStatus) {

        this.statut = newStatus;
        if ("CONFIRMED".equals(newStatus)) {
            this.datePaiement = LocalDateTime.now();
        }
    }

	 // ——— getters existants ———
	 public String getTransactionId() {
        return this.transactionId;
    }
    public double getMontant() {
        return this.montant;
    }
    public String getStatut() {
        return this.statut;
    }
    public LocalDateTime getDatePaiement() {
        return this.datePaiement;
    }
	
      // getter pour le mode de paiement
    public ModePaiment getModePaiement() {
        return modePaiement;
    }
}

