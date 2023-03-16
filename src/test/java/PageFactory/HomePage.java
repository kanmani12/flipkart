package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
	public WebDriver d;
	public Actions act;

	public HomePage(WebDriver d) {
		this.d = d;
	}

	By closebtn = By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]");
	// for banner handling
	By banner = By.xpath("//div[@class='_3eARKq']");

	public void close_button_click() {
		WebElement close = d.findElement(closebtn);
		if (close.isDisplayed()) {
			close.click();
		} else {

		}
	}

	public void mouse_handles_bannner() {
		WebElement bannerClick = d.findElement(banner);
		act = new Actions(d);
		act.moveToElement(bannerClick).perform();
		act.click().build().perform();
	}
}
