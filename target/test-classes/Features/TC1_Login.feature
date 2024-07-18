@Login
Feature: Verifying OMR Branch Hotel Login Automation

  Scenario Outline: Verifying Login with valid Credentials
    Given User is on the OMR Branch hotel page
    When User login "<username>","<password>"
    Then User should verify Success message after login "Welcome Mukesh"

    Examples: 
      | username                     | password    |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 |

  Scenario Outline: Verifying Login with valid Credentials using ENTER key
    Given User is on the OMR Branch hotel page
    When User login "<username>","<password>" with Enter key
    Then User should verify Success message after login "Welcome Mukesh"

    Examples: 
      | username                     | password    |
      | mukeshkumar.r01127@gmail.com | Mukesh@1127 |

  Scenario Outline: Verifying Login with Invalid Credentials
    Given User is on the OMR Branch hotel page
    When User login "<username>","<password>"
    Then User should verify error message after login "Invalid Login details or Your Password might have expired"

    Examples: 
      | username                     | password   |
      | mukeshkumar.r01127@gmail.com | Mukesh1127 |
