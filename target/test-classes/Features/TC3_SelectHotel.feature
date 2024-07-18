@Select
Feature: Verify the Select Hotel Automation

  @Select1
  Scenario Outline: Select 1st hotel and verify navigate to book hotel upon accepting the alert
    Given User is on the OMR Branch hotel page
    When User login "<username>","<password>"
    Then User should verify Success message after login "Welcome Mukesh"
    When User select hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel Success message "Select Hotel"
    When User save the first Hotel Name
    And User save the first Hotel Price
    And User should accept the booking alert message
    Then User should verify success message after the select hotel "Book Hotel"

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-23 | 2024-06-26 | 1-One      | 2-Two        |             |

  @Select2
  Scenario Outline: Verify the Last hotel name and price and Canceling the alert
    Given User is on the OMR Branch hotel page
    When User login "<username>","<password>"
    Then User should verify Success message after login "Welcome Mukesh"
    When User select hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
    Then User should verify after search hotel Success message "Select Hotel"
    When User save the last Hotel Name
    And User save the last Hotel Price
    And User should canceling the booking alert message
    Then User should verify select hotel message after the canceling the alert "Select Hotel"

    Examples: 
      | username                     | password    | state      | city    | roomType | checkIn    | check-out  | No of Room | No of Adults | No of Child |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 | Tamil Nadu | Chennai | Deluxe   | 2024-06-23 | 2024-06-26 | 1-One      | 2-Two        |             |
