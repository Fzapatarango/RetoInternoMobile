Feature: Buy a product in Exito app
  Me as a user
  want buy a product in exito app
  to verify the correct functioning of the mobile app

  Background:
  Scenario: LogInExitoApp
    When "userA" logs in with credentials
    Then "userA" should see a greeding

    Scenario: BuyProduct
      When user buys a "productA"
      Then should see the "product" in the cart