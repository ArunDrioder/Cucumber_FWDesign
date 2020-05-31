$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User launches the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.LoginStep.user_launches_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User launches the URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.LoginStep.user_launches_the_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the login Email address as \"admin@yourstore.com\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.LoginStep.user_enters_the_login_Email_address_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.LoginStep.user_enters_the_password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.LoginStep.user_Clicks_the_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.LoginStep.close_browser()"
});
formatter.result({
  "status": "passed"
});
});