@checkout
Feature: Passer une commande sur SauceDemo
  Vérification du processus de commande complet

  Background:
    Given Je me connecte sur l application SauceDemo
    When Je saisis le nom de utilisateur
    And Je tape le mot de passe
    And Je clique sur Login

  @place_an_order
  Scenario: Passer une commande complète
    When Je clique sur add to cart pour ajouter le produit Sauce Labs Backpack au panier
    Then Je vérifie que le panier doit contenir 1 produit
    When Je clique sur le panier 
    
    And Je clique sur checkout
    And Je renseigne le prénom "Mariem"
    And Je renseigne le nom "Ltifi"
    And Je renseigne le code postal 2027
    And Je clique sur le bouton Continue
    And Je clique sur le bouton Finish
    Then La page de confirmation de commande doit s afficher avec le message "Thank you for your order!"
    And Je clique sur le bouton Back Home
    Then Redirection vers la page d acceuil avec la liste des produits "Products"
    
