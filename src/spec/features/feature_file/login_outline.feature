@loginOutline
Feature: Je souhaite tester l application swaglabs avec données multiples

  Scenario Outline: Je souhaite tester l application swaglabs avec plusieurs comptes
    Given Je me connecte sur l application SauceDemo
    When  Je saisis le nom de utilisateur "<username>"
    And   Je tape le mot de passe "<password>"
    And   Je clique sur Login
    Then  Je vérifie le résultat "<result >"

    Examples: 
      | username                | password     |      result           |
      | standard_user           | secret_sauce |Home Page              |
      | locked_out_user         | secret_sauce |error                  |
      | fake_user               | secret_sauce | error                 |
      | problem_user            | secret_sauce |error                   |
      | performance_glitch_user | secret_sauce |Home Page |
      | error_user              | secret_sauce |error |
      | visual_user             | secret_sauce |error |