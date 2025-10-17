@createTicket @smoketest  @sanitytest
Feature: Creation Ticket
  ETQ utilisateur je souhaite creer un ticket
  
  Background:
     Given Je me connecte sur le site proservices
     When Je saisis l adresse email 
     And Je saisis le mot de passe
     And Je clique sur le bouton Login
     Then Je me redirige vers la page Home"Total des tickets"
   @required_fields_filled
  Scenario: Je souhaite creer un ticket avec champs obligatoires remplis 
    When Je clique sur le bouton creation ticket
    When Je me redirige vers la page creation ticket "Nouveau Ticket"
    When Je selectionne  le nom de l agence"Agence centrale" 
    When Je saisis le titre de ticket"ticket01"
    When Je selectionne le departement"Finance"
    When Je saisis la description de ticket"Probléme de facturation"
    When Je selectionne le responsable"Managerfinancier" 
    Then Je clique sur le bouton en bas à droite  creation ticket
    Then un message s affiche"ticket ajoutée avec succés"
    Then Je clique sur le bouton OK de pop up confiramtion de creation ticket 
     
    
    
    
    
    
    