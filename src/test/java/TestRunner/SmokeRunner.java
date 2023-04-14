package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources/Features",
        glue = "StepDefinitions",
        dryRun = false,
        tags ="@smoke1",
        //put here the tag u want, for generating code, additionally change dryRun to true for generating not coded steps yet
        plugin = {"pretty"})
// pretty is just for seeing the code prettier in console
        //...,tags="@testcase1") tags option will execute the tagged testcase as mentioned in your runner class

public class SmokeRunner {
}
