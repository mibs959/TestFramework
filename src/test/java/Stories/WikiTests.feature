Feature: Wikipedia Test Scenarios


  Scenario: Wikipedia title verification
    Given I navigate to 'https://www.wikipedia.org/'
    Then the current Page Title is 'Wikipedia'


  Scenario: Wikipedia Search functionality verification
    Given I navigate to 'https://www.wikipedia.org/'
    When I search for 'furry rabbits' from the Home Page Search
    Then the Suggested Search Link 'is' displayed at the Results Page
    And the Suggested Search Link Text is 'fury rabbit'
    Then click on the Search Suggestion Link
    And the amount of Results displayed on the current page is '20'
    Then I click on the '1st' entry from the Results
    And the Article Title is displayed
    And the Article Table of Contents is displayed