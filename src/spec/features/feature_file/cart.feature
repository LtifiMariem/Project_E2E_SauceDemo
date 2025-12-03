@cart
Feature: Gestion du panier sur SauceDemo
  Vérification de l’ajout de produits au panier

  Background:
    Given Je me connecte sur l application SauceDemo
    When Je saisis le nom de utilisateur
    And Je tape le mot de passe
    And Je clique sur Login

  @add_product_to_cart
  Scenario: Ajouter un produit au panier
    When Je clique sur add to cart pour ajouter le produit Sauce Labs Backpack au panier
    Then Je vérifie que le panier doit contenir 1 produit

