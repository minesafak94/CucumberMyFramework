package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources/Features",
        glue = "StepDefinitions",
        dryRun = false,
        tags ="@testcase2",
        //put here the tag u want, for generating code, additionally change dryRun to true for generating not coded steps yet
        plugin = {"pretty","html:target/Cucumber.html","json:target/Cucumber.json"}) //target for where we want the report, cucumber.html for the name of our code
// pretty is just for seeing the code prettier in console
        //...,tags="@testcase1") tags option will execute the tagged testcase as mentioned in your runner class

//target folder is mostly used for storing the test case execution reports generated using Cucumber

public class SmokeRunner {
}
