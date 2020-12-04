
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

    @bank2
    Scenario: Money transferring

      And clicks transfer funds
      And selects savings from account drag drop
      And selects brokers from to account drag drop
      And enters amount
      And enters descriptions
      And clicks continue
      And clicks submit
      Then verifies the message text "You successfully submitted your transaction."

      @bank3

      Scenario: Feedback sending
        And user clicks bankzero
        And user clicks feedbacks
        And user enters name "Jason"
        And user enters mail address "asdx@gmail.com"
        And user enters subject "Money transferring"
        And users enters questions " How can I pay my fees?"
        Then user clicks send message
        Then user verifies the message contains "Jason"







