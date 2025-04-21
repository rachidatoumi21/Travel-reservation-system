package Reservation;


import Paiement.ModePaiment;
import Paiement.Paiement;
import Section.Arrangement;
import Users.Client;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import Application.Voyage;


/**
 * Une réservation conservée en mémoire pour les tests.
 */
public class Reservation {

    // stockage statique de toutes les réservations
    private static final Map<String, Reservation> store = new HashMap<>();

    
    private Client client;
    private String numReservation;
    private Arrangement arrangement;    
    private Voyage voyage;              
    private Double prix;
    private String statut;
    private LocalDateTime dateCreation;
    private LocalDateTime dateExpiration;
    private LocalDateTime datePaiement;
    private ModePaiment modePaiement;
    private boolean isPaid;


    /**
     * Récupère la réservation en mémoire par son numéro.
     */
    public static Reservation getReservationDetails(String numReservation) {
        return store.get(numReservation);
    }

    /**
     * Indique si la réservation est expirée (au‑delà de dateExpiration).
     */
    public boolean estExpiree() {
        return LocalDateTime.now().isAfter(dateExpiration);
    }

    /**
     * Vérifie que l'arrangement est toujours disponible.
     * Nécessite que Arrangement expose isDisponible().
     */
    public boolean validerDisponibilite() {
        return arrangement.isDisponible();
    }

    /**
     * Confirme ce paiement sur la réservation :
     * met à jour statut, datePaiement et flag isPaid.
     */
    public void confirmerPaiement(Paiement p) {
        this.statut       = "PAID";
        this.isPaid       = true;
        this.datePaiement = LocalDateTime.now();
        this.modePaiement = p.getModePaiement();
    }

    /**
     * Annule la réservation : changement de statut et 
     * remise à dispo de l'arrangement si nécessaire.
     */
    public void annuler() {
        this.statut = "CANCELLED";
        this.isPaid = false;
        arrangement.setDisponible(true);
    }

    /**
     * Crée une nouvelle réservation en mémoire.
     * @param client      le client qui réserve
     * @param arrangement l'arrangement choisi
     * @param voyage      le voyage correspondant
     */
    public void creerReservation(Client client,
                                  Arrangement arrangement,
                                  Voyage voyage) {
        this.client          = client;
        this.arrangement     = arrangement;
        this.voyage          = voyage;
        this.numReservation  = UUID.randomUUID().toString();
        this.prix            = arrangement.getPrix();
        this.dateCreation    = LocalDateTime.now();
        this.dateExpiration  = dateCreation.plusHours(24);  // tenue 24 h
        this.statut          = "PENDING";
        this.isPaid          = false;

        // enregistre dans le store
        store.put(this.numReservation, this);
    }

    /**
     * Lance le paiement pour cette réservation :
     * crée et exécute le Paiement, puis confirme ou échoue.
     */
    public void payerReservation(Client client,
                                 String numReservation,
                                 ModePaiment modePaiement,
                                 String infoCarte) {
        // 1) Vérifier cohérence
        if (! this.client.equals(client)
         || ! this.numReservation.equals(numReservation)) {
            throw new IllegalArgumentException("Réservation ou client invalide");
        }

        // 2) Créer et configurer le Paiement
        Paiement p = new Paiement("", 0.0, modePaiement, "PENDING");
        boolean okCreate = p.creerPaiement(client, numReservation, modePaiement, infoCarte);
        if (! okCreate) {
            throw new IllegalStateException("Impossible de créer le paiement");
        }

        // 3) Exécuter le paiement
        boolean paid = p.effectuerPaiement(p);
        if (paid) {
            confirmerPaiement(p);
        } else {
            this.statut = "FAILED";
        }
    }

	// ——— getters ———
    public String getId() {
        return numReservation;
    }
    public Voyage getVoyage() {
        return voyage;
    }
    public Client getClient() {
        return client;
    }
    public String getStatut() {
        return statut;
    }
    public Double getPrix() {
        return prix;
    }
    public LocalDateTime getDateExpiration() {
        return dateExpiration;
    }


  
}