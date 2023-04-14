package Pages;

import StepDefinitions.AddEmployee;
import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//every page class has to have extends CommonMethods
public class AddEmployeePage extends CommonMethods {



    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimTab;  //this was on this line before this last version -->  WebElement pimTab=driver.findElement(By.id("menu_pim_viewPimModule"));
    //add public

    @FindBy(id="menu_pim_addEmployee")
    public WebElement addEmpBtn;

    @FindBy(id="firstName")
    public WebElement firstNameTextBox;

    @FindBy(id="middleName")
    public WebElement middleNameTextBox;

    @FindBy(id="lastName")
    public WebElement lastNameTextBox;

    @FindBy(id="btnSave")
    public WebElement saveBtn;

    public AddEmployeePage(){
        PageFactory.initElements(driver,this);
    }

}
