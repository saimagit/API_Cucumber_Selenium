
Feature: Weather API
  

  Scenario: Verify the status code in the response is 200 when the correct city name is used
    Given URL of the weather API for correct city is avaiable
    When Hit the weather API   
    Then status code in the response is 200



   
