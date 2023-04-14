Feature: Login Functionalities

  @smoke
  Scenario: Valid Admin Login
    #Given open the browser and launch HRMS application
    When user enters valid email and valid password
    And click on login button
    Then user is logged in succesfully
    #And Close the browser
    #this isnt needed if u have hooks

  @smoke2
  Scenario: Valid Admin Login
    #Given open the browser and launch HRMS application
    When user enters valid "admin" and valid "Hum@nhrm123"
    And click on login button
    Then user is logged in succesfully
    #And Close the browser
    # this isnt needed if u have hooks

  @scenarioOutline
  #Parametization/DataDriven
  Scenario Outline: Login with multiple credentilas using Scenario Outline
    #Given open the browser and launch HRMS application
    When user enters valid "<username>" and valid "<password>"
    And click on login button
    Then user is logged in succesfully
    #And Close the browser, here  above is missing: into the application
    #below u have to write Examples, because Scenario Outline is without this just underlined red
  Examples:
      | username | password|
      | admin    | Hum@nhrm123 |
      | ADMIN    | Hum@nhrm123 |
      | Jason    | Hum@nhrm123 |


  @dataTable
  Scenario: Login with multiple credentials using data table
      When user enters username and password and verifies login
        | username | password|
        | admin    | Hum@nhrm123 |
        | ADMIN    | Hum@nhrm123 |
        | Jason    | Hum@nhrm123 |

#hard code
  #Config file
  #==========
#Cucumber Expression (limited Set of data)
  #Scenario Outline (parametrization or data driven testing) [for one test case, multiple data]
  #Scenario Outline is launching browser for every new Set of data, and closes it, every testcase is going to go from launching until closing browser.

  #data Table (actually the same like Scenario Outlet, but launches and closes browser one time, this means all test case
  # is executed in one step, so if u have to test multiple data for userlogin u have to write the test in one go, like login and then
  # back to login page through logout)

    #HOOKS: For defining pre ond post steps in any Cucumber framework
    #This is always created inside the StepDefinitions folder
    #This class cannot be inherited
    # Hooks will take care of pre and post conditions irrespective of what goes in between the test steps


  #BACKGROUND is the clubbing of common steps in different scenarios of a feature file
  #            till flow is broken
  #1. Hard code
  #2. Config file (this two steps from Java)
  #-------- Cucumber itself provides mutliple option through which we can feed data from
  #feature file into Step definition
  #3. Regular Expression
       # put data in double quotes ["  "]
  #4. Scenario Outline
       # provides you an alternative to Data driven testing
       # also supports parametrization

  #============================Parametarization===============================
  #Executing the same test case with multiple data


  # if u want to use parametrization
  # if u wish to implement data driven testing
     #Scenario Outline is always used along with the keyword Examples




