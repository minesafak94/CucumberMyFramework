Feature: Login Functionalities

  @smoke
  Scenario: Valid Admin Login
    #Given open the browser and launch HRMS application
    When user enters valid email and valid password
    And click on login button
    Then user is logged in succesfully
    #And Close the browser this isnt needed if u have hooks

    #HOOKS: For defining pre ond post steps in any Cucumber framework
    #This is always created inside the StepDefinitions folder
    #This class cannot be inherited
    # Hooks will take care of pre and post conditions irrespective of what goes in between the test steps

