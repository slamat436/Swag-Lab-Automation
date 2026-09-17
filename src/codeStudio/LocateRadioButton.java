package codeStudio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateRadioButton {
	public static void main(String[] args) {

		// Launch Chrome browser
		String path = "C:\\uwais @123\\.metadata\\SwagLabsAutomationFramework\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);

		// Create Chrome browser object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// launch url
		driver.get("https://www.calculator.net/");
		List<WebElement> radioButton = driver.findElements(By.xpath("//input[@type=\"radio\"]"));

		System.out.println("Total Radio Button on WebPage : " + radioButton.size());

		driver.close();

	}

}
