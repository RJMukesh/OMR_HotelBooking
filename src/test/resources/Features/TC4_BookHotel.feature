@BookHotel
Feature: Verifying the Book Hotel Automation

  @BookHotel1
  Scenario Outline: Verifying Book Hotel with valid Credentials
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

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child | Select salutation | First name | Last name | Mobile no  | Email                        | Enter registration No | Enter company name     | Enter company address | Request            | Card type  |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-23 | 2024-06-26 | 1-One      | 2-Two        |             | Mr.               | Mukesh     | RJ        | 8124683929 | mukeshkumar.r01127@gmail.com |            9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Need parking space | Debit Card |

  @BookHotel2
  Scenario Outline: Verifying Book Hotel Including GST-Card(Credit Card-Visa) with special request
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

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child | Select salutation | First name | Last name | Mobile no  | Email                        | Enter registration No | Enter company name     | Enter company address | Request            | Card type   |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-23 | 2024-06-26 | 1-One      | 2-Two        |             | Mr.               | Mukesh     | RJ        | 8124683929 | mukeshkumar.r01127@gmail.com |            9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Need parking space | Credit Card |

  @BookHotel3
  Scenario Outline: Verifying Book Hotel Including GST-Card(Debit Card-Visa) without special request
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

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child | Select salutation | First name | Last name | Mobile no  | Email                        | Enter registration No | Enter company name     | Enter company address | Card type  |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-23 | 2024-06-26 | 1-One      | 2-Two        |             | Mr.               | Mukesh     | RJ        | 8124683929 | mukeshkumar.r01127@gmail.com |            9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Debit Card |

  @BookHotel4
  Scenario Outline: Verifying Book Hotel Including GST-Card(Credit Card-Visa) without special request
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

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child | Select salutation | First name | Last name | Mobile no  | Email                        | Enter registration No | Enter company name     | Enter company address | Card type   |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-23 | 2024-06-26 | 1-One      | 2-Two        |             | Mr.               | Mukesh     | RJ        | 8124683929 | mukeshkumar.r01127@gmail.com |            9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Credit Card |

  @BookHotel5
  Scenario Outline: Verifying Book Hotel without GST-Card(Debit Card-Visa) with special request
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
    And User add Special request "<Request>"
    And User add Payment Details,Processed with card type "<Card type>"
      | Select Card | Card No          | Card Name | Month | Year | CVV |
      | Visa        | 5555555555552222 | Mukesh    | July  | 2027 | 245 |
      | MasterCard  | 5555555555554444 | Mukesh    | July  | 2027 | 445 |
      | Amex        | 5555555555553333 | Mukesh    | July  | 2027 | 567 |
      | Discover    | 5555555555556666 | Mukesh    | July  | 2027 | 777 |
    Then User should verify after hotel booking success message "Booking is Confirmed" and save the order ID
    And User should verify selected hotel and booked hotel is same or not

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child | Select salutation | First name | Last name | Mobile no  | Email                        | Request            | Card type  |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-23 | 2024-06-26 | 1-One      | 2-Two        |             | Mr.               | Mukesh     | RJ        | 8124683929 | mukeshkumar.r01127@gmail.com | Need parking space | Debit Card |

  @BookHotel6
  Scenario Outline: Verifying Book Hotel without GST-Card(Credit Card-Visa) without special request
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

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child | Select salutation | First name | Last name | Mobile no  | Email                        | Request            | Card type   |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-23 | 2024-06-26 | 1-One      | 2-Two        |             | Mr.               | Mukesh     | RJ        | 8124683929 | mukeshkumar.r01127@gmail.com | Need parking space | Credit Card |

  @BookHotel7
  Scenario Outline: Verifying Error Message of Book Hotel without Entering any Card details
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
    And User click Credit card
    And User click Submit button without entering any Card details
    Then User should verify the Error message after click the Submit button "Please select your card type","Please select your card","Please provide your card number","Please provide name on your card","Please provide your Card Expiry Date", and "Please provide your Card's security code"

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child | Select salutation | First name | Last name | Mobile no  | Email                        | Enter registration No | Enter company name     | Enter company address | Request            |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-23 | 2024-06-26 | 1-One      | 2-Two        |             | Mr.               | Mukesh     | RJ        | 8124683929 | mukeshkumar.r01127@gmail.com |            9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Need parking space |

  @BookHotel8
  Scenario Outline: Verifying Book Hotel with GST(UPI-ID) with special request
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

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child | Select salutation | First name | Last name | Mobile no  | Email                        | Enter registration No | Enter company name     | Enter company address | Request            | UPI ID               |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-23 | 2024-06-26 | 1-One      | 2-Two        |             | Mr.               | Mukesh     | RJ        | 8124683929 | mukeshkumar.r01127@gmail.com |            9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Need parking space | seleniumtraining@vbc |

  @BookHotel9
  Scenario Outline: Verifying Book Hotel with GST(UPI-ID) without special request
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

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child | Select salutation | First name | Last name | Mobile no  | Email                        | Enter registration No | Enter company name     | Enter company address | UPI ID               |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-23 | 2024-06-26 | 1-One      | 2-Two        |             | Mr.               | Mukesh     | RJ        | 8124683929 | mukeshkumar.r01127@gmail.com |            9043592058 | Greens Tech OMR Branch | Thoraipakkam          | seleniumtraining@vbc |

  @BookHotel10
  Scenario Outline: Verifying Book Hotel without GST(UPI-ID) without special request
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

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child | Select salutation | First name | Last name | Mobile no  | Email                        | UPI ID               |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-23 | 2024-06-26 | 1-One      | 2-Two        |             | Mr.               | Mukesh     | RJ        | 8124683929 | mukeshkumar.r01127@gmail.com | seleniumtraining@vbc |

  @BookHotel11
  Scenario Outline: Verifying Error Message of Book Hotel without entering UPI details
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
    And User click UPI
    And User cick Submit button
    Then User should verify Error message after click the Submit button of UPI "Please provide your UPI ID"

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child | Select salutation | First name | Last name | Mobile no  | Email                        | Enter registration No | Enter company name     | Enter company address | Request            |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-23 | 2024-06-26 | 1-One      | 2-Two        |             | Mr.               | Mukesh     | RJ        | 8124683929 | mukeshkumar.r01127@gmail.com |            9043592058 | Greens Tech OMR Branch | Thoraipakkam          | Need parking space |
