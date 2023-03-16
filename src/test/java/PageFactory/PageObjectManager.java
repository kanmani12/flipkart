package PageFactory;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver d;
	HomePage hp;
	PrintMenuPage pm;

	public PageObjectManager(WebDriver d) {
		this.d = d;
	}

	public HomePage getHomePage() {
		hp = new HomePage(d);
		return hp;
	}

	public PrintMenuPage getPrintMenuPage() {
		pm = new PrintMenuPage(d);
		return pm;
	}

}
