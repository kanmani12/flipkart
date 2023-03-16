package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public WebDriver d;

	public WebDriver WebDriverManager() throws IOException {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\Resource\\global.properties");
		Properties prob = new Properties();
		prob.load(fis);
		String browerProperty = prob.getProperty("browser");
		String url = prob.getProperty("QAurl");
		if (d == null) {
			if (browerProperty.equalsIgnoreCase("chrome")) {

				ChromeOptions co = new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				d = new ChromeDriver(co);
			} else if (browerProperty.equalsIgnoreCase("firefox")) {
				d = new FirefoxDriver();
			} else if (browerProperty.equalsIgnoreCase("edge")) {
				d = new EdgeDriver();
			}
			d.manage().window().maximize();
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			d.get(url);

		}
		return d;
	}

}
