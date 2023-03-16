package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import PageFactory.PageObjectManager;

public class TestSetup {
	public WebDriver d;
	public Actions act;
	public PageObjectManager pom;
	public TestBase tb;

	public TestSetup() {
		tb = new TestBase();
		try {
			pom = new PageObjectManager(tb.WebDriverManager());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
