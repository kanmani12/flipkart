package StepDefinition;

import java.io.IOException;

import Utils.TestSetup;
import io.cucumber.java.After;

public class Hooks {
	TestSetup ts;

	public Hooks(TestSetup ts) {
		this.ts = ts;
	}

	@After
	public void after_scenario() {
		try {
			ts.tb.WebDriverManager().quit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
