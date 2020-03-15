$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Inputs.feature");
formatter.feature({
  "line": 1,
  "name": "As a user, I want to add inputs by clicking on the input source link on the left panel of the dashboard page",
  "description": "",
  "id": "as-a-user,-i-want-to-add-inputs-by-clicking-on-the-input-source-link-on-the-left-panel-of-the-dashboard-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14576472601,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#@ValidCase @Smoke"
    },
    {
      "line": 4,
      "value": "#Scenario: Successfully adding inputs"
    },
    {
      "line": 5,
      "value": "#\tGiven I am on the dashbaord page"
    },
    {
      "line": 6,
      "value": "#\tWhen I click on the input link on the left panel"
    },
    {
      "line": 7,
      "value": "#\tThen I should be seeing the sources link on the main panel to add inputs"
    }
  ],
  "line": 10,
  "name": "debug",
  "description": "",
  "id": "as-a-user,-i-want-to-add-inputs-by-clicking-on-the-input-source-link-on-the-left-panel-of-the-dashboard-page;debug",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@ValidCase"
    },
    {
      "line": 9,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I am on the dashbaord page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on the main panel of the dashboard page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on new source tab",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the dropdowm menu should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "InputsSteps.i_am_on_the_dashbaord_page()"
});
