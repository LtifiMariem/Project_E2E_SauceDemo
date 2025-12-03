@login
Feature: Tests fonctionnels de l application SauceDemo Tests
  Vérification du bon fonctionnement des fonctionnalités principales SauceDemo

  Background:
     Given Je me connecte sur l application SauceDemo
     When Je saisis le nom de utilisateur 
     And Je tape le mot de passe
  @login_validCredential 
  Scenario: Connexion avec des identifiants valides
     And Je clique sur Login
    Then Redirection vers la page d acceuil avec la liste des produits "Products"
  @login_invalidCredential
  Scenario: Connexion avec des identifiants invalides
    When Je saisis le nom de utilisateur "Fake_user"
    And Je tape le mot de passe
    And Je clique sur Login
    Then Un message d erreur "Epic sadface: Username and password do not match any user in this service" doit s afficher
 
  

 