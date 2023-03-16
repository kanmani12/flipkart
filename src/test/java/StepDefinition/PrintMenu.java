package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import PageFactory.HomePage;
import PageFactory.PrintMenuPage;
import Utils.TestSetup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class PrintMenu {
	WebDriver d;
	Actions act;
	TestSetup ts;
	HomePage hp;
	PrintMenuPage pm;

	public PrintMenu(TestSetup ts) {
		this.ts = ts;
		this.pm = ts.pom.getPrintMenuPage();
		this.hp = ts.pom.getHomePage();
	}

	@And("^Check the banner is redirect to page with top menu items$")
	public void Check_the_banner_is_redirect_to_page_Electronic_menu() {
		if (pm.back_to_homepage() == true) {
			hp.mouse_handles_bannner();
		}

	}

	@Then("^Print the Submenu items$")
	public void print_the_Submenu_items() {

		// for menu handling
		pm.print_submenu_items();

	}

}
