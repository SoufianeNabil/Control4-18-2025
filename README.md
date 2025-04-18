# Mini Service de Gestion de Campagnes de Dons

## 📚 Description du Projet
Ce projet est un mini-service de gestion de campagnes de dons et de transactions, réalisé dans le cadre du cours **JEE**.


## 🔧 Stack Technique
- **Java 17**
- **Spring Boot 3.4.4**
- **Spring Data JPA**
- **Base de données H2** (en mémoire pour les tests)
- **Maven** (gestionnaire de dépendances)
- **Swagger UI** (documentation API)


## 🔹 Fonctionnalités Principales **(a venir pour si on continue sur ce projet)**
- **CRUD Campagne** : Création, Lecture, Mise à jour et Suppression d’une campagne.
- **CRUD SuiviDonateur** : Gestion des dons associés à une campagne.
- **Projection** : Affichage d'une projection personnalisée des donateurs (nom, email, téléphone).
- **Recherche** :
  - Donateurs actifs.
  - Recherche par email.
  - Classement des donateurs les plus généreux.
- **Validation des Données** :
  - Champs obligatoires non vides.
  - Format d’email valide.
- **Gestion d’erreurs** : Réponses HTTP appropriées en cas d’erreur.


## 🌐 Comment démarrer le projet

1. Cloner le dépôt GitHub :
```bash
git clone https://github.com/votre-compte/votre-repo.git
```

2. Ouvrir le projet avec **IntelliJ IDEA**.

3. S'assurer que **Java 17** est installé et configuré.

4. Lancer l’application à partir de la classe `DonserviceApplication.java` :
   - Cliquer droit sur la classe > **Run 'DonserviceApplication'**

6. Accéder à la console H2 pour visualiser la base de données :
```
http://localhost:8080/h2-console
```
- JDBC URL : `jdbc:h2:mem:controle`
- User : `SoufianeControle`
- Password : aucun mot de passe

7. Accéder à la documentation Swagger (si activée) :
```
http://localhost:8080/swagger-ui/index.html
```


## 📊 Structure du projet

```
com/
|-- controllers/
|   |-- CampagneController.java
|   |-- DonController.java
|   |-- GlobalExceptionHandler.java
|
|-- dto/
|   |-- DonDTO.java
|
|-- entities/
|   |-- Campagne.java
|   |-- Don.java
|
|-- hadoop.mapreduce/
|   |-- Main.java
|
|-- projections/
|   |-- CampagneResume.java
|
|-- Repositories/
|   |-- CampagneRepository.java
|   |-- DonRepository.java
|
|-- Services/
|   |-- ServiceCampagne.java
|   |-- ServiceDon.java
|
|-- DonserviceApplication.java

src/main/resources/
|-- application.properties
```


## 👨‍🎓 Auteur
- **Nom :** Soufiane Nabil
- **Filière :** 4ème année IIR
- **Classe :** G6
- **Année :** 2024/2025


## 💡 Remarque
Ce projet a été réalisé dans le cadre d’un **contrôle de 2 heures**. Plusieurs améliorations futures sont envisagées pour une version plus avancée.

Merci.

