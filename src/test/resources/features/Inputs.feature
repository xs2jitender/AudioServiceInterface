Feature: As a user, I want to add inputs by clicking on the input source link on the left panel of the dashboard page

  @ValidCase @Smoke
  Scenario: Successfully adding inputs
    Given I am on the dashbaord page
    When I click on the input link on the left panel
    Then I should be seeing the sources link on the main panel to add inputs

  @ValidCase @Smoke
  Scenario: debug
    Given I am on the dashbaord page
    And I click on the main panel of the dashboard page
    When I click on new source tab
    Then the dropdowm menu should be displayed

  @ValidCase @Smoke
  Scenario Outline:
    Given I click on the add new source tab on the main panel
    When the dialog box opens
    Then I add a user friendly name <Name>
    And I choose source type from the dropdown menu <SourceType>
    And I add the url <URL>
    And I click on save button
    Examples:
      | Name | Source Type | URL                                            |
      | AAA  | Web Stream  | http://dabstream.celador.co.uk/sam-hants-ssdab |
