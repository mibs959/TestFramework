Feature: WorldRemit Send Money
  
  Scenario: Navigate to Money Transfer page
    Given I navigate to 'https://www.worldremit.com'
    When I select 'Philippines' as Country to send money at the Home Page
    Then I click on the Get Started button from the Home Page
    And the Send Money page is focused on sending money to 'Philippines'
    And make sure that the Send Money To Dropdown at the Send Money page has 'Philippines' selected