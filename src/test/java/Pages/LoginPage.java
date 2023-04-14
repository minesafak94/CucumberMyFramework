package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonMethods {

    public LoginPage(){
        PageFactory.initElements(driver,this);//initializing the webelements of the current page
        //always in every Webpage we need a constructor.
        // initialize all the Webelement, which are using PageFactory, with the driver
        //all webelements have to be initialized with driver
    }
    @FindBy(id="txtUsername")
    public WebElement usernameTextBox;
   //instead of this WebElement usernameTextBox = driver.findElement(By.id("txtUsername")); these above now with page factory model
    @FindBy(id="txtPassword")
    public WebElement passwordTextBox;
    //WebElement passwordTextBox = driver.findElement(By.id("txtPassword")); this is converted to the above

    @FindBy(id="btnLogin")
    public WebElement loginBtn;

    @FindBy(id="welcome")
    public WebElement welcomeIcon;

    @FindBy (id="//a[text()='Logout']")
    public WebElement logoutLink;

    //Page Factory Model (this is in Selenium used) to write Webelement


}
