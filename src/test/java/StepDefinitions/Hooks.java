package StepDefinitions;

import Utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends CommonMethods {
    @Before//import Before
    public void preConditions(){
        openBrowserAndLaunchApplication();
    }

    //Scenario Class holds the complete information of your tests execution in Cucumber framework
    @After//import After
    public void postConditions(Scenario scenario) {
        byte[]pic;
        if (scenario.isFailed())
        {
           pic= takeScreenshot("failed/"+ scenario.getName());
        }
        else{
           pic= takeScreenshot("passer/"+scenario.getName());
        }

        //attach the screenshot in  my report
        scenario.attach(pic,"image/png", scenario.getName());
        closeBrowser();
    }
}
