Feature: To validate login functionality

  Background: 
    Given Open chrome and launch fb application

  Scenario Outline: To test fb login using invalid credentials
    When User enters "<username>" and "<password>"
    And Clicks on login button
    Then User should be navigated to invalid credentials page

    Examples: 
      | username | password |
      | Imaz     | imaz123  |

  Scenario Outline: To test user fb registration
    When user enters "<firstname>" and "<lastname>"
    And enters "<phnum>"
    And enters "<newpass>"
    And selects birthday and gender
    And clicks on signup
    Then action completed

    Examples: 
      | firstname | lastname | phnum     | newpass | 
      | Imzu      | Ray      | 321456987 | hello@1 |
