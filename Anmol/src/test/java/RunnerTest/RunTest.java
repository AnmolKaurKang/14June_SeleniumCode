package RunnerTest;

import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	
	features = "src/test/resources/Features",
	glue = {"StepDefinitions"},
	plugin= {"pretty","json:Reports/cucumber.json"}

)		
public class RunTest {
	
}



