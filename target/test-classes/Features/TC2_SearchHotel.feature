@Search
Feature: Verifying OMR Branch Hotel Search Automation

  @Search1
  Scenario Outline: Verifying Search Hotel with valid Credentials in all Fields
    Given User is on the OMR Branch hotel page
    When User login "<username>","<password>"
    Then User should verify Success message after login "Welcome Mukesh"
    When User select hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel Success message "Select Hotel"

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-23 | 2024-06-26 | 1-One      | 2-Two        |           1 |

  @Search2
  Scenario Outline: Verifying Search Hotel with valid Credentials in mandatory Fields
    Given User is on the OMR Branch hotel page
    When User login "<username>","<password>"
    Then User should verify Success message after login "Welcome Mukesh"
    When User select hotel "<state>","<city>","<checkIn>","<check-out>","<No of Room>" and "<No of Adults>"
    Then User should verify after search hotel Success message "Select Hotel"

    Examples: 
      | username                     | password    | state      | city    | checkIn    | check-out  | No of Room | No of Adults |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | 2024-06-23 | 2024-06-26 | 1-One      | 2-Two        |

  @Search3
  Scenario Outline: Verifying Search Hotel without entering any Fields
    Given User is on the OMR Branch hotel page
    When User login "<username>","<password>"
    Then User should verify Success message after login "Welcome Mukesh"
    When User click Search button
    Then User should verify error message after click the Search button "Please select state","Please select city","Please select Check-in date","Please select Check-out date","Please select no. of rooms" and "Please select no. of adults"

    Examples: 
      | username                     | password    |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 |

  @Search4
  Scenario Outline: Search Hotel with valid Credentials in all Fields and Verify the hotel price by sorting from Low to High
    Given User is on the OMR Branch hotel page
    When User login "<username>","<password>"
    Then User should verify Success message after login "Welcome Mukesh"
    When User select hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel Success message "Select Hotel"
    When User click sort button from Low to High
    Then User should verify after the sorting price listed from Low to High

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-23 | 2024-06-26 | 1-One      | 2-Two        |           1 |

  @Search5
  Scenario Outline: Search Hotel with valid Credentials in all Fields and Verify the hotel price by sorting from High to Low
    Given User is on the OMR Branch hotel page
    When User login "<username>","<password>"
    Then User should verify Success message after login "Welcome Mukesh"
    When User select hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel Success message "Select Hotel"
    When User click sort button from High to Low
    Then User should verify after the sorting price listed from High to Low

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-23 | 2024-06-26 | 1-One      | 2-Two        |           1 |

  @Search6
  Scenario Outline: Search Hotel with valid Credentials in all Fields and Verify the hotel names in Ascending order
    Given User is on the OMR Branch hotel page
    When User login "<username>","<password>"
    Then User should verify Success message after login "Welcome Mukesh"
    When User select hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel Success message "Select Hotel"
    When User click sort button from Ascending order
    Then User should verify after the sorting names listed in Ascending order

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-23 | 2024-06-26 | 1-One      | 2-Two        |           1 |

  @Search7
  Scenario Outline: Search Hotel with valid Credentials in all Fields and Verify the hotel names in Descending order
    Given User is on the OMR Branch hotel page
    When User login "<username>","<password>"
    Then User should verify Success message after login "Welcome Mukesh"
    When User select hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel Success message "Select Hotel"
    When User click sort button from Descending order
    Then User should verify after the sorting names listed in Descending order

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-23 | 2024-06-26 | 1-One      | 2-Two        |           1 |

  @Search8
  Scenario Outline: Verify Select multiple Room Type only present in the Header
    Given User is on the OMR Branch hotel page
    When User login "<username>","<password>"
    Then User should verify Success message after login "Welcome Mukesh"
    When User select hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel Success message "Select Hotel"
    And User should verify Room Types present in header after search hotel "<roomType>"

    Examples: 
      | username                     | password    | state      | city    | roomType                            | checkIn    | check-out  | No of Room | No of Adults | No of Child |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Standard/Deluxe/Suite/Luxury/Studio | 2024-06-23 | 2024-06-26 | 1-One      | 2-Two        |             |

  @Search9
  Scenario Outline: Verify Select Room Type is ends with Displayed Hotle name
    Given User is on the OMR Branch hotel page
    When User login "<username>","<password>"
    Then User should verify Success message after login "Welcome Mukesh"
    When User select hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel Success message "Select Hotel"
    And User should verify Select Room Type is ends with Displayed Hotle name "<roomType>"

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-23 | 2024-06-26 | 1-One      | 2-Two        |             |
