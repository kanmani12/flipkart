package PageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PrintMenuPage {
	public WebDriver d;
	public Actions act;

	HomePage hp;

	public PrintMenuPage(WebDriver d) {
		this.d = d;
	}

	// span menus
	By sMenu = By.xpath("//*[@class='_2I9KP_']");// div[@class='_1kidPb']//*[contains(@class,'_2I9KP_')]
	List<WebElement> menu;
	By back = By.xpath("//div[@class='_3qX0zy']//img[@alt='Flipkart']");

	// Contain of sub menu in menu
	By con = By.xpath("//div[@class='_1fwVde']//*");// _1fwVde _1QrT3s @FindBy(xpath = "//a[@class='_2I9KP_']")

	// to check sub menu categories list is present in container
	By sub_menu = By.xpath("//*[contains(@class,'_3QN6WI _1MMnri')]");

	public boolean back_to_homepage() {
		menu = d.findElements(sMenu);
		WebElement backbtn = d.findElement(back);

		if (menu.isEmpty()) {
			backbtn.click();
			return true;
		} else {
			return false;
		}

	}

	public void print_submenu_items() {
		act = new Actions(d);
		int count = 1;
		// To get all the main menu content
		for (WebElement main : menu) {
			System.out.println(main.getText());
			act.moveToElement(main).perform();
			// To get all the sub menu in main menu
			List<WebElement> container = d.findElements(con);
			count = 1;
			for (WebElement sub : container) {
				List<WebElement> subMenu = d.findElements(sub_menu); // To get all the sub menu's sub menu items
				if (subMenu.contains(sub)) {
					System.out.println(sub.getText());
					count = 1;
				} else {
					System.out.println("  " + count++ + "." + sub.getText());
				}

			}

		}

	}

}
