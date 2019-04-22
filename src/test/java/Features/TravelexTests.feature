Feature: Wikipedia Test Scenarios


  Scenario: Wikipedia title verification
    Given I navigate to 'https://www.travelex.co.uk/'
    When Resize the current Window to emulate Mobile Resolution
    Then I swipe at the Features Carousel unil the '3rd' Feature
    And the '3rd' Slide of the Features Carousel at the Home Page is Displayed