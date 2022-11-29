Feature: Assistance page

  Scenario: Going to Assitance page
    Given User lanch chrome browser
    When user open URL "http://www.expedia.fr/"
    And Clik on link "Assistance"
    Then Text should be "L’agent virtuel est à votre disposition."
    When user enter "Enregistrement" in searchbox
    And Click on btn search
    Then text should be "Résultats de la recherche"
    And close browser  
 