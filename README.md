# ✈️🚢🚆 Système de Réservation de Voyages

> Projet réalisé dans le cadre du cours **IFT3911 – Analyse et conception des logiciels** à l’**Université de Montréal**.  
> Ce système de réservation prend en charge les voyages **aériens**, **navals** et **ferroviaires**, et a été développé progressivement à travers **DM1, DM2 et DM3**.

---

##  Table des matières

- [ Description](#-description)
- [ Objectifs](#-objectifs)
- [ Évolution du projet](#-évolution-du-projet)
- [ Architecture du projet](#️-architecture-du-projet)
- [ Concepts et patrons de conception](#-concepts-et-patrons-de-conception)
- [ Fonctionnalités principales](#️-fonctionnalités-principales)
- [ Technologies utilisées](#️-technologies-utilisées)
- [ Exécution du projet](#️-exécution-du-projet)
- [Captures et diagrammes](#-captures-et-diagrammes)
- [ Équipe](#-équipe)
- [ Contexte académique](#-contexte-académique)
- [ Valeur du projet](#-valeur-du-projet)

---

##  Description

Ce projet consiste en un **système de réservation de voyages** développé en **Java** selon une approche de **conception orientée objet**.

Le système permet de gérer plusieurs modes de transport :

- **Voyage aérien**
- **Voyage naval**
- **Voyage ferroviaire**

L’application est divisée en deux grands volets :

- **Volet administratif** : gestion des compagnies, établissements, voyages, sections et tarifs
- **Volet client** : recherche, réservation et paiement

Ce projet met en pratique :

- l’analyse des besoins
- la modélisation UML
- la conception logicielle
- l’implémentation de plusieurs **patrons de conception**

---

##  Objectifs

- Appliquer les principes de la **programmation orientée objet**
- Concevoir un système logiciel **modulaire** et **extensible**
- Modéliser le système avec des **diagrammes UML**
- Intégrer des **patrons de conception** à une application réelle
- Développer une architecture claire et maintenable

---

##  Évolution du projet

### **DM1 – Système de Réservation de Voyages**
Première phase du projet consacrée à l’analyse du problème et à l’identification des fonctionnalités principales :

- gestion des voyages
- gestion des compagnies
- réservation
- paiement
- consultation des disponibilités

### **DM2 – Modélisation et Analyse**
Deuxième phase centrée sur la modélisation du système :

- diagrammes de classes
- diagrammes de séquence
- organisation des paquets
- raffinement de l’architecture orientée objet

### **DM3 – Patrons de Conception**
Troisième phase consacrée à l’amélioration de l’architecture grâce à l’intégration de patrons de conception :

- Fabrique
- Singleton
- Commande
- Observateur
- Visiteur
- État
- Décorateur
- Adaptateur

---

##  Architecture du projet

Le projet est organisé en plusieurs paquets/modules :

```text
Travel-reservation-system/
├── Application/
├── Paiement/
├── PatronCommande/
├── Reservation/
├── Section/
└── Users/

Cette structure favorise :
- la séparation des responsabilités
- la modularité
- la maintenabilité
- l’extensibilité du système 
```

---

###  Concepts logiciels mis en pratique

- Encapsulation
- Héritage
- Polymorphisme
- Composition
- Abstraction
- Modélisation UML
- Architecture modulaire
- Séparation des responsabilités

---

##  Patrons de conception implémentés

### 1. Patron de Fabrique
Utilisé pour encapsuler la création de plusieurs entités du système, comme :
- les compagnies
- les moyens de transport
- les voyages

Cela permet de centraliser la logique de création et de réduire le couplage.

### 2. Singleton
Employé avec les générateurs d’identifiants afin d’assurer l’unicité des ID produits dans le système.

### 3. Patron de Commande
Utilisé pour les opérations administratives de :
- modification
- suppression

Une variante **undo/redo** est utilisée afin de pouvoir annuler ou rétablir certaines actions.

### 4. Patron Observateur
Permet de découpler le modèle de données des vues :
- mise à jour automatique des vues administratives et client
- synchronisation lors des changements dans la base de données

### 5. Patron Visiteur
Utilisé pour séparer la logique de présentation des objets métier, en particulier pour :
- l’affichage des vols
- l’affichage des trajets
- l’affichage des itinéraires

### 6. Patron d’État
Appliqué à la gestion des états d’un siège, par exemple :
- libre
- réservé
- occupé

Ce patron facilite la gestion des transitions d’état et réduit la complexité des conditions.

### 7. Patron Décorateur
Utilisé pour ajouter dynamiquement des services supplémentaires à une réservation, comme :
- une assurance
- des services additionnels

### 8. **Patron Adaptateur**
Permet l’intégration d’un système de paiement externe à travers une interface compatible avec le système interne.

---

## ⚙️ Fonctionnalités principales

### Volet administratif
- création, modification et suppression d’aéroports, ports et gares
- gestion des compagnies aériennes, de croisière et des lignes de train
- création et gestion des vols, itinéraires et trajets
- gestion des sections/classes et de leurs prix
- consultation des voyages par établissement ou compagnie

### Volet client
- recherche de voyages disponibles selon :
  - origine
  - destination
  - date
  - classe
- réservation d’un siège ou d’une cabine
- paiement d’une réservation
- confirmation d’un arrangement après paiement

---

## 📊 Modélisation UML

Le projet s’appuie sur plusieurs artefacts de modélisation, notamment :

- diagramme de classes global
- diagrammes de classes révisés par paquet
- diagrammes de séquence
- diagrammes liés aux patrons de conception

Ces éléments permettent de mieux comprendre :
- la structure du système
- les interactions entre objets
- les choix de conception réalisés

---

##  Technologies utilisées

- **Java**
- **UML**
- **Git / GitHub**
- **Patrons de conception**
- **Conception orientée objet**

---

##  Exécution du projet

1. Cloner le dépôt :
```bash
git clone https://github.com/rachidatoumi21/Travel-reservation-system.git
```


## 👥 Équipe
Rachida Toumi
Athavan Pathmanathan
Le Kinh Vi Phung

---
