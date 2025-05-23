Feature: Add employee

  Background:
    #Given user is able to access HRMS application
    When user enters valid username and password
    And user clicks on login button
    Then user is able to see dashboard page
    When user clicks on PIM option
    And user clicks on Add employee option

  @sprint1 @melissa
    Scenario: Adding the employee by firstname and lastname
      And user enters firstname and lastname
      And user clicks on save button
      Then employee added successfully

    @sprint2 @smoke @regression @melissa
      Scenario: Adding the employee by firstname middlename and lastname
        And user enters firstname and middlename and lastname
        And user clicks on save button
        Then employee added successfully

      @params
      Scenario: Adding employee using parameters
        And user enters "Don" and "mond" and "Funds" in the application
        And user clicks on save button
        Then employee added successfully

        @example
        Scenario Outline: Adding multiple employees
          And user add "<firstname>" , "<middlename>" and "<lastname>"
          And user clicks on save button
          Then employee added successfully
          Examples:
            | firstname | middlename | lastname |
            |keropetse  |v           |Godwin    |
            |Jasmine    |M           |Godwin    |
            |Adams      |M           |Godwin    |



          @datatables
          Scenario: Adding multiple employees using data table
            When user adds multiple employees using data table and save them
            |firstname  |middlename    |lastname|
            |keropetse  |v           |Godwin    |
            |Jasmine    |M           |Godwin    |
            |Adams      |M           |Godwin    |

           @excel
            Scenario: adding employees using excel file
              When user adds multiple employees from excel file

