Feature: Login

  @LoginSuccessful
  Scenario: Login successful
    Given the customer is on the login page of the app
    When he types user prueba@accenture.com and password 123456
    Then he should see the home page of the app

  @LoginFailed
  Scenario: Login failed
    Given the customer is on the login page of the app
    When he types user tester@accenture.com and password abcdef
    Then he should see a error