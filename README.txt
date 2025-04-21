# README.txt

Le code ne fonctionne pas complètement et ne couvre pas toutes les spécifications, mais il se compile correctement.

---

## Compilation  
À la racine du dépôt, exécutez les commandes suivantes pour compiler le code du projet :

```bash
mkdir out  
javac -d out .\Application\Application\*.java
javac -d out .\Application\Paiement\*.java
javac -d out .\Application\PatronCommande\*.java
javac -d out .\Application\Reservation\*.java
javac -d out .\Application\Section\*.java
javac -d out .\Application\Users\*.java


--- 
Placez‑vous dans le dossier Users, puis lancez Main.java depuis votre éditeur de code ou en ligne de commande.
Il doit afficher:
```
[Admin View] Database updated: 3 vols, 3 trajets, 3 itinéraires
[Client View] Availability update: 3 vols, 3 trajets, 3 itinéraires