Feature: Login Exito app
  Me as a user
  want to log in exito app
  to verify the correct functioning of the mobile app

  Scenario: LogInExitoApp
    When "userA" logs in with credentials
    Then "userA" should see a greeding