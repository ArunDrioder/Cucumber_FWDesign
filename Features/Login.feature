Feature: Login
  Scenario: Successful Login with Valid Credentials
    Given User launches the chrome browser
    When User launches the URL "http://admin-demo.nopcommerce.com/login"
    Then User enters the login Email address as "admin@yourstore.com"
    And User enters the password as "admin"
    And User Clicks the Login Button
    And Close browser