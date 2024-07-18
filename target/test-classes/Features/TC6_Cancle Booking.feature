Feature: Verifying the Cancel Booking Automation

  @Cancel1
  Scenario Outline: Verify the Book Hotel by cancle the OrderID
    Given User is on the OMR Branch hotel page
    When User login "<username>","<password>"
    Then User should verify Success message after login "Welcome Mukesh"
    When User select hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel Success message "Select Hotel"
    When User save the first hotel name and price
    And User accept the booking  alert message
    Then User should verify after the success message "Book Hotel"
    When User add Guest Details  "<Select salutation>","<First name>","<Last name>","<Mobile no>" and "<Email>"
    And User add GST Details "<Enter registration No>","<Enter company name>" and "<Enter company address>"
    And User add Special request "<Request>"
    And User add Payment Details,Processed with card type "<Card type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552222 | Mukesh    | July  | 2027 | 245 |
      | MasterCard  | 5555555555554444 | Mukesh    | July  | 2027 | 445 |
      | Amex        | 5555555555553333 | Mukesh    | July  | 2027 | 567 |
      | Discover    | 5555555555556666 | Mukesh    | July  | 2027 | 777 |
    Then User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    And User should verify selected hotel and booked hotel is same or not
    When User navigate to the My Booking page
    Then User should verify after the Success message "Bookings"
    When User search the OrderID
    Then User should verify after the search OrderID
    And User should verify the Hotel name
    And User should verify the Hotel price
    When User click Cancle button and accept the Cancle booking alert message
    Then User should verify after Cancel Success message "Your booking cancelled successfully"

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child | Select salutation | First name | Last name | Mobile no  | Email                        | Enter registration No | Enter company name     | Enter company address | Request            | Card type  |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-23 | 2024-06-26 | 1-One      | 2-Two        |             | Mr.               | Mukesh     | RJ        | 8124683929 | mukeshkumar.r01127@gmail.com |            9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Need parking space | Debit Card |
