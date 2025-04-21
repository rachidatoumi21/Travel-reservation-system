
package Users;

import Application.*;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        // Create the in‑memory database
        Database db = new Database();

        // Create some Ville objects
        Ville montreal = new Ville("MTL", "Montreal", "Canada");
        Ville toronto = new Ville("TRT", "Toronto", "Canada");
        Ville calgary = new Ville("CAL", "Calgary", "Canada");
        Ville miami = new Ville("MIA", "Miami", "USA");
        Ville ottawa = new Ville("OTT", "Ottawa", "Canada");
        Ville vancouver = new Ville("VAN", "Vancouver", "Canada");

        // Use the Etablissement factories to create 3 airports
        CreateurAeroport aeroF = new CreateurAeroport();
        Aeroport yul = (Aeroport) aeroF.creerEtablissement("YUL", montreal);
        Aeroport yyz = (Aeroport) aeroF.creerEtablissement("YYZ", toronto);
        Aeroport yyc = (Aeroport) aeroF.creerEtablissement("YYC", calgary);
        db.addEtablissement(yul);
        db.addEtablissement(yyz);
        db.addEtablissement(yyc);

        // 3 train stations
        CreateurGare gareF = new CreateurGare();
        Gare mtl = (Gare) gareF.creerEtablissement("MTL", montreal);
        Gare tor = (Gare) gareF.creerEtablissement("TOR", toronto);
        Gare cal = (Gare) gareF.creerEtablissement("CAL", calgary);
        db.addEtablissement(mtl);
        db.addEtablissement(tor);
        db.addEtablissement(cal);

        // 3 ports
        CreateurPort portF = new CreateurPort();
        Port mia = (Port) portF.creerEtablissement("MIA", miami);
        Port ott = (Port) portF.creerEtablissement("OTT", ottawa);
        Port van = (Port) portF.creerEtablissement("VAN", vancouver);
        db.addEtablissement(mia);
        db.addEtablissement(ott);
        db.addEtablissement(van);

        // Create 1 company of each kind
        CreateurCompagnieAerienne airF = new CreateurCompagnieAerienne();
        CompagnieAerienne airCan = (CompagnieAerienne) airF.creerCompagnie(1000f, "AIRCAN");
        db.addCompagnie(airCan);

        CreateurTrainLigne trainF = new CreateurTrainLigne();
        TrainLigne via = (TrainLigne) trainF.creerCompagnie(500f, "VIA");
        db.addCompagnie(via);

        CreateurCompagnieCroisiere cruiseF = new CreateurCompagnieCroisiere();
        CompagnieCroisiere oceanic = (CompagnieCroisiere) cruiseF.creerCompagnie(2000f, "OCEANIC");
        db.addCompagnie(oceanic);

        // Initiate vehicle factories
        CreateurAvion avF = new CreateurAvion();
        CreateurTrain trF = new CreateurTrain();
        CreateurPaquebot pqF = new CreateurPaquebot();

        // Seed 3 flights via CreateurVol + attach Avion
        CreateurVol volF = new CreateurVol();

        Vol v1 = (Vol) volF.creerVoyage(yul, yyz,
                LocalDateTime.of(2025, 1, 1, 8, 0),
                LocalDateTime.of(2025, 1, 1, 10, 0),
                airCan);
        v1.setVehicule(avF.creerMoyenTransport(airCan));
        db.addVoyage(v1);

        Vol v2 = (Vol) volF.creerVoyage(yyz, yyc,
                LocalDateTime.of(2025, 1, 2, 9, 30),
                LocalDateTime.of(2025, 1, 2, 12, 15),
                airCan);
        v2.setVehicule(avF.creerMoyenTransport(airCan));
        db.addVoyage(v2);

        Vol v3 = (Vol) volF.creerVoyage(yyc, yul,
                LocalDateTime.of(2025, 1, 3, 14, 0),
                LocalDateTime.of(2025, 1, 3, 17, 30),
                airCan);
        v3.setVehicule(avF.creerMoyenTransport(airCan));
        db.addVoyage(v3);

        // Seed 3 train trips + attach Train
        CreateurTrajet trajF = new CreateurTrajet();

        Trajet t1 = (Trajet) trajF.creerVoyage(mtl, tor,
                LocalDateTime.of(2025, 1, 1, 7, 0),
                LocalDateTime.of(2025, 1, 1, 11, 0),
                via);
        t1.setVehicule(trF.creerMoyenTransport(via));
        db.addVoyage(t1);

        Trajet t2 = (Trajet) trajF.creerVoyage(tor, cal,
                LocalDateTime.of(2025, 1, 2, 6, 0),
                LocalDateTime.of(2025, 1, 2, 20, 0),
                via);
        t2.setVehicule(trF.creerMoyenTransport(via));
        db.addVoyage(t2);

        Trajet t3 = (Trajet) trajF.creerVoyage(cal, mtl,
                LocalDateTime.of(2025, 1, 3, 5, 0),
                LocalDateTime.of(2025, 1, 3, 19, 0),
                via);
        t3.setVehicule(trF.creerMoyenTransport(via));
        db.addVoyage(t3);

        // Seed 3 cruises + attach Paquebot
        CreateurItineraire itinF = new CreateurItineraire();

        Itineraire i1 = (Itineraire) itinF.creerVoyage(mia, ott,
                LocalDateTime.of(2025, 1, 1, 12, 0),
                LocalDateTime.of(2025, 1, 4, 12, 0),
                oceanic);
        i1.setVehicule(pqF.creerMoyenTransport(oceanic));
        db.addVoyage(i1);

        Itineraire i2 = (Itineraire) itinF.creerVoyage(ott, van,
                LocalDateTime.of(2025, 1, 5, 10, 0),
                LocalDateTime.of(2025, 1, 8, 10, 0),
                oceanic);
        i2.setVehicule(pqF.creerMoyenTransport(oceanic));
        db.addVoyage(i2);

        Itineraire i3 = (Itineraire) itinF.creerVoyage(van, mia,
                LocalDateTime.of(2025, 1, 9, 8, 0),
                LocalDateTime.of(2025, 1, 12, 8, 0),
                oceanic);
        i3.setVehicule(pqF.creerMoyenTransport(oceanic));
        db.addVoyage(i3);

        // Attach the Observer/Visitor views
        AdminView admin = new AdminView(db);
        ClientView client = new ClientView(db);

        // Kick off the initial display
        admin.update();
        client.update();
    }
}