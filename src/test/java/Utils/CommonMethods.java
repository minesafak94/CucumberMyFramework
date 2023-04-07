package Utils;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;

public class CommonMethods {
    public static WebDriver driver;
    public static void openBrowserAndLaunchApplication(){

        ConfigReader.readProperties();//here properties file is loaded, so u don't need to load it anytime again, just call ur details

        String browserType=ConfigReader.getPropertyValue("browserType");
        switch (browserType) {

            case "Chrome":
                driver=new ChromeDriver();
                break;

            case "Firefox":
                driver=new FirefoxDriver();
                break;

            case "IE":
                driver=new InternetExplorerDriver();
                break;

            default:
                driver=new EdgeDriver();
                break;
        }

        driver.manage().window().maximize();
        driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(Constants.WAIT_TIME));//here u have to call constants class and value wait time
    }

    public static void closeBrowser(){

        driver.close();
    }

    public static void doClick(WebElement element){
        element.click();
    }

    public static void sendText(WebElement element, String text){
        element.sendKeys(text);
    }
}
