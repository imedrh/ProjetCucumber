$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Home.feature");
formatter.feature({
  "line": 1,
  "name": "home page",
  "description": "",
  "id": "home-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Going to Assitance page",
  "description": "",
  "id": "home-page;going-to-assitance-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User lanch chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user open URL \"http://www.expedia.fr/\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Clik on link \"Assistance\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Text should be \"L’agent virtuel est à votre disposition.\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});