Feature: Employee

  #you can tag whatever u want, it will u allow to execute this specific testcase with this tag @testthis
  @testcase2 @smoke
  Scenario: Adding a new Employee
    #Given open the browser and launch HRMS application
    When user enters valid email and valid password
    And click on login button
    When user clicks on PIM option
    And user clicks on add employee button
    And user enters firstname and middle name and lastname
    #And user clicks on save button

  #this is a comment in feature file
    #And Close the browser



