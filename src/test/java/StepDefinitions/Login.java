package StepDefinitions;

import Pages.LoginPage;
import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class Login extends CommonMethods {

   /* @Given("open the browser and launch HRMS application")
    public void open_the_browser_and_launch_hrms_application() {

       openBrowserAndLaunchApplication();

    }*/

    @When("user enters valid email and valid password")
    public void user_enters_valid_email_and_valid_password() {
        //create object of login page to use the methods in this login.java class
       // LoginPage login=new LoginPage();

     /*   driver.findElement(By.id("txtUsername")).sendKeys(ConfigReader.getPropertyValue("username"));
       driver.findElement(By.id("txtPassword")).sendKeys(ConfigReader.getPropertyValue("password"));
*/
       // WebElement usernameTextBox = driver.findElement(By.id("txtUsername"));
       // WebElement passwordTextBox = driver.findElement(By.id("txtPassword")); we dont need it anymore because of page factory model
        sendText(login.usernameTextBox, ConfigReader.getPropertyValue("username"));//here add login. for using login Page methods
        sendText(login.passwordTextBox, ConfigReader.getPropertyValue("password"));

    }


    @When("click on login button")
    public void click_on_login_button() {

      //  LoginPage login=new LoginPage();  after u have extended commonon methods extends pageinitializer class
      //  WebElement loginBtn=driver.findElement(By.id("btnLogin"));
        doClick(login.loginBtn);
    }

    @Then("user is logged in succesfully")
    public void user_is_logged_in_succesfully() {
        boolean userLoggedIn=driver.findElement(By.xpath("//a[contains(text(),'Welcome')]")).isDisplayed();
        if (userLoggedIn){
            System.out.println("User is logged in successfully");
        }
    }
/*    @Then("Close the browser")
    public void close_the_browser() {

        closeBrowser();
    }*/
    //we dont need this any longer, we have hooks right now, this wont be called if we have hooks


        @When("user enters valid {string} and valid {string}")
        public void user_enters_valid_and_valid(String username, String password) {
         //   LoginPage login=new LoginPage();
           // WebElement usernameTextBox = driver.findElement(By.id("txtUsername"));
            sendText(login.usernameTextBox, username);

           // WebElement passwordTextBox = driver.findElement(By.id("txtPassword"));
            sendText(login.passwordTextBox, password);
        }

    @When("user enters username and password and verifies login")
    public void user_enters_username_and_password_and_verifies_login(DataTable dataTable) { //io.cucumber.datatable. das habe ich vor Datatable entfernt
       // LoginPage login=new LoginPage();

        List <Map<String,String>> userCredentials=dataTable.asMaps();
            for (Map<String,String> userCreds: userCredentials)
            {
                String username=userCreds.get("username");
                String password= userCreds.get("password");
                sendText(login.usernameTextBox, username);
                sendText(login.passwordTextBox, password);
                doClick(login.loginBtn);
                doClick(login.welcomeIcon);
                doClick(login.logoutLink);

            }
    }}

