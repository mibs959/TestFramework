Feature: API Testing Excersise


  Scenario: Retrieve all events Test and verify that there are Tennis and Football events.
    Given I perform a Get to the following URL: 'http://localhost:49160/events'
    Then The GET Performed returned '4' Events
    And Among the Events there are 'Tennis' Events
    And Among the Events there are 'Football' Events


  Scenario: Create a new Selection and Verify it was created Successfully.
    Given Add a new Random Market Selection