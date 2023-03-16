package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageFactory.HomePage;
import Utils.TestSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Search {
	public WebDriver d;

	TestSetup ts;
	HomePage hp;

	public Search(TestSetup ts) {
		this.ts = ts;
		this.hp = ts.pom.getHomePage();

	}

	@Given("^User on Home page$")
	public void open_flipkar_link() {

		//
	}

	@And("^Close the default login$")
	public void Close_the_default_login() {
		hp.close_button_click();

	}

	@When("^Click on any banner$")
	public void click_on_any_banner() {

		hp.mouse_handles_bannner();

	}

}
