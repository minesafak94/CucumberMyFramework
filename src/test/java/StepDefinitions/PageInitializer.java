package StepDefinitions;

import Pages.AddEmployeePage;
import Pages.EmployeeSearchPage;
import Pages.LoginPage;

public class PageInitializer {

    public static LoginPage login;
    public static AddEmployeePage addEmployeePage;

    public static EmployeeSearchPage employeeSearchPage;
    public static void initializePageObjects() {
        login = new LoginPage();
        addEmployeePage=new AddEmployeePage();
        employeeSearchPage=new EmployeeSearchPage();
    }
}

    //this class will manage the object creations of different page Objects in our Framework.
    //Instead of calling the page objects again and again, this class willl take good care of that step.
