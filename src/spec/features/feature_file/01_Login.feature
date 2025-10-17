@login
Feature: Authentification
  ETQ utilisateur je souhaite me connecter sur le site proservices

   Background:

    Given Je me connecte sur le site proservices
    When Je saisis l adresse email 
    And Je saisis le mot de passe
    And Je clique sur le bouton Login
    
  @login_validCredential   
  Scenario: Je souhaite me connecter avec des identifiants valides
    Then Je me redirige vers la page Home"Total des tickets"   
    @logout
    Scenario: Je souhaite me déconnecter 
    When Je clique sur Avatar droite en haut
    And Je clique sur se déconnecter
    Then Je me redirige vers la page de connexion "Accéder à votre compte"
    
    
     
    

  
    