package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestNGRunner {
	@CucumberOptions(
			features = "src/test/java/features", 
			glue = "StepDefinition",
			tags = "@Search"

	)
	public class TestRunner extends AbstractTestNGCucumberTests {

	}

}
