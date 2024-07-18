Feature: Verifying Change Booking Automation

  @Modify1
  Scenario Outline: Modify the checkIn date in Book Hotel with GST-Card(Debit Card-Visa) with special request
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
    When User Modify the check-In date "<Modify Date>"
    Then User should verify after Success message "Booking updated successfully"

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child | Select salutation | First name | Last name | Mobile no  | Email                        | Enter registration No | Enter company name     | Enter company address | Request            | Card type  | Modify Date |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-24 | 2024-06-26 | 1-One      | 2-Two        |             | Mr.               | Mukesh     | RJ        | 8124683929 | mukeshkumar.r01127@gmail.com |            9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Need parking space | Debit Card | 2024-06-25  |

  @Modify2
  Scenario Outline: Modify the checkIn date in Book Hotel with GST(UPI-ID) with special request
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
    And User add UPI details "<UPI ID>"
    Then User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    And User should verify selected hotel and booked hotel is same or not
    When User navigate to the My Booking page
    Then User should verify after the Success message "Bookings"
    When User search the OrderID
    Then User should verify after the search OrderID
    And User should verify the Hotel name
    And User should verify the Hotel price
    When User Modify the check-In date "<Modify Date>"
    Then User should verify after Success message "Booking updated successfully"

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child | Select salutation | First name | Last name | Mobile no  | Email                        | Enter registration No | Enter company name     | Enter company address | Request            | UPI ID               | Modify Date |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-23 | 2024-06-26 | 1-One      | 2-Two        |             | Mr.               | Mukesh     | RJ        | 8124683929 | mukeshkumar.r01127@gmail.com |            9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Need parking space | seleniumtraining@vbc | 2024-06-25  |

  @Modify3
  Scenario Outline: Modify the checkIn date in Book Hotel with GST-Card(Credit Card-Visa) with special request
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
      | Visa        | 5555555555552223 | Mukesh    | July  | 2027 | 245 |
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
    When User Modify the check-In date "<Modify Date>"
    Then User should verify after Success message "Booking updated successfully"

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child | Select salutation | First name | Last name | Mobile no  | Email                        | Enter registration No | Enter company name     | Enter company address | Request            | Card type   | Modify Date |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-24 | 2024-06-26 | 1-One      | 2-Two        |             | Mr.               | Mukesh     | RJ        | 8124683929 | mukeshkumar.r01127@gmail.com |            9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Need parking space | Credit Card | 2024-06-25  |

  @Modify4
  Scenario Outline: Modify the checkIn date in Book Hotel with GST-Card(Debit Card-Visa) without special request
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
    And User click the next button
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
    When User Modify the check-In date "<Modify Date>"
    Then User should verify after Success message "Booking updated successfully"

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child | Select salutation | First name | Last name | Mobile no  | Email                        | Enter registration No | Enter company name     | Enter company address | Card type  | Modify Date |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-24 | 2024-06-26 | 1-One      | 2-Two        |             | Mr.               | Mukesh     | RJ        | 8124683929 | mukeshkumar.r01127@gmail.com |            9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Debit Card | 2024-06-25  |

  @Modify5
  Scenario Outline: Modify the checkIn date in Book Hotel with GST-Card(Credit Card-Visa) without special request
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
    And User click the next button
    And User add Payment Details,Processed with card type "<Card type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552223 | Mukesh    | July  | 2027 | 245 |
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
    When User Modify the check-In date "<Modify Date>"
    Then User should verify after Success message "Booking updated successfully"

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child | Select salutation | First name | Last name | Mobile no  | Email                        | Enter registration No | Enter company name     | Enter company address | Card type   | Modify Date |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-24 | 2024-06-26 | 1-One      | 2-Two        |             | Mr.               | Mukesh     | RJ        | 8124683929 | mukeshkumar.r01127@gmail.com |            9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Credit Card | 2024-06-25  |

  @Modify6
  Scenario Outline: Modify the checkIn date in Book Hotel without GST-Card(Debit Card-Visa) without special request
    Given User is on the OMR Branch hotel page
    When User login "<username>","<password>"
    Then User should verify Success message after login "Welcome Mukesh"
    When User select hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel Success message "Select Hotel"
    When User save the first hotel name and price
    And User accept the booking  alert message
    Then User should verify after the success message "Book Hotel"
    When User add Guest Details  "<Select salutation>","<First name>","<Last name>","<Mobile no>" and "<Email>"
    And User click the GST next button
    And User click the next button
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
    When User Modify the check-In date "<Modify Date>"
    Then User should verify after Success message "Booking updated successfully"

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child | Select salutation | First name | Last name | Mobile no  | Email                        | Card type  | Modify Date |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-24 | 2024-06-26 | 1-One      | 2-Two        |             | Mr.               | Mukesh     | RJ        | 8124683929 | mukeshkumar.r01127@gmail.com | Debit Card | 2024-06-25  |

  @Modify7
  Scenario Outline: Modify the checkIn date in Book Hotel without GST-Card(Credit Card-Visa) without special request
    Given User is on the OMR Branch hotel page
    When User login "<username>","<password>"
    Then User should verify Success message after login "Welcome Mukesh"
    When User select hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel Success message "Select Hotel"
    When User save the first hotel name and price
    And User accept the booking  alert message
    Then User should verify after the success message "Book Hotel"
    When User add Guest Details  "<Select salutation>","<First name>","<Last name>","<Mobile no>" and "<Email>"
    And User click the GST next button
    And User click the next button
    And User add Payment Details,Processed with card type "<Card type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552223 | Mukesh    | July  | 2027 | 245 |
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
    When User Modify the check-In date "<Modify Date>"
    Then User should verify after Success message "Booking updated successfully"

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child | Select salutation | First name | Last name | Mobile no  | Email                        | Card type   | Modify Date |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-24 | 2024-06-26 | 1-One      | 2-Two        |             | Mr.               | Mukesh     | RJ        | 8124683929 | mukeshkumar.r01127@gmail.com | Credit Card | 2024-06-25  |

  @Modify8
  Scenario Outline: Modify the checkIn date in Book Hotel with GST(UPI-ID) without special request
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
    And User click the next button
    And User add UPI details "<UPI ID>"
    Then User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    And User should verify selected hotel and booked hotel is same or not
    When User navigate to the My Booking page
    Then User should verify after the Success message "Bookings"
    When User search the OrderID
    Then User should verify after the search OrderID
    And User should verify the Hotel name
    And User should verify the Hotel price
    When User Modify the check-In date "<Modify Date>"
    Then User should verify after Success message "Booking updated successfully"

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child | Select salutation | First name | Last name | Mobile no  | Email                        | Enter registration No | Enter company name     | Enter company address | UPI ID               | Modify Date |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-23 | 2024-06-26 | 1-One      | 2-Two        |             | Mr.               | Mukesh     | RJ        | 8124683929 | mukeshkumar.r01127@gmail.com |            9043592058 | Greens Tech OMR Branch | Thoraipakkam          | seleniumtraining@vbc | 2024-06-25  |

  @Modify9
  Scenario Outline: Modify the checkIn date in Book Hotel without GST(UPI-ID) without special request
    Given User is on the OMR Branch hotel page
    When User login "<username>","<password>"
    Then User should verify Success message after login "Welcome Mukesh"
    When User select hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel Success message "Select Hotel"
    When User save the first hotel name and price
    And User accept the booking  alert message
    Then User should verify after the success message "Book Hotel"
    When User add Guest Details  "<Select salutation>","<First name>","<Last name>","<Mobile no>" and "<Email>"
    And User click the GST next button
    And User click the next button
    And User add UPI details "<UPI ID>"
    Then User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    And User should verify selected hotel and booked hotel is same or not
    When User navigate to the My Booking page
    Then User should verify after the Success message "Bookings"
    When User search the OrderID
    Then User should verify after the search OrderID
    And User should verify the Hotel name
    And User should verify the Hotel price
    When User Modify the check-In date "<Modify Date>"
    Then User should verify after Success message "Booking updated successfully"

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child | Select salutation | First name | Last name | Mobile no  | Email                        | UPI ID               | Modify Date |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-23 | 2024-06-26 | 1-One      | 2-Two        |             | Mr.               | Mukesh     | RJ        | 8124683929 | mukeshkumar.r01127@gmail.com | seleniumtraining@vbc | 2024-06-25  |

  @Modify10
  Scenario Outline: Verifying Book Hotel by modifying the existing order id, pass from examples
    Given User is on the OMR Branch hotel page
    When User login "<username>","<password>"
    Then User should verify Success message after login "Welcome Mukesh"
    When User click the user profile and select the My Account
    And User enter the existing order id and search "<Exixting OrderId>"
    When User Modify the check-In date "<Modify Date>"
    Then User should verify after Success message "Booking updated successfully"

    Examples: 
      | username                     | password    | Exixting OrderId | Modify Date |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | #AMZUW52737      | 2024-06-25  |
