package RunnerTest;

import org.junit.runner.RunWith;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	
	features = "src/test/resources/Features",
	glue = {"StepDefinitions"},
	plugin= {"pretty","json:Reports/cucumber.json"},
	dryRun=true

)		
public class RunTest extends AbstractTestNGCucumberTests {
	
}



