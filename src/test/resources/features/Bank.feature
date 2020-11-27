
  Feature: Add a new Payee

      Background:
        Given user goes to mainpage
        And clicks sign in
        And username
        And password
        Then clicks login button
    @bank
    Scenario: create a new payment
      And user clicks pay bills
      And clicks Add new payee
      And Enters payee name
      And enters payee address
      And enters account
      And enters payee details
      Then clicks login
      Then Assert alert text
