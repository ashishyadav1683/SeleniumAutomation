Feature: Login feature with multiple datasets

  Scenario Outline: Test login feature with multiple datasets
    Given User is on login page
    When I enter valid <username> and <password> on login page
    Then Homepage should be displayed

    Examples: 
      | username             | password      |
      | dzwork19@hotmail.com | temp@password |
      | dzwork19@hotmail.com | temp@password |
