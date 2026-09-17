package codeStudio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindDropDown {
	public static void main(String[] args) {
		// Launch Chrome browser
		String path = "C:\\uwais @123\\.metadata\\SwagLabsAutomationFramework\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);

		// Create Chrome browser object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// launch url
		driver.get("https://practice.expandtesting.com/dropdown");
		// locate dropdown
		WebElement element = driver.findElement(By.xpath("//select[@id=\"dropdown\"]"));

		Select dropDown = new Select(element);
		// dropDown.selectByVisibleText("Option 2");
		// dropDown.selectByValue("");

		WebElement element1 = driver.findElement(By.xpath("//select[@id=\"elementsPerPageSelect\"]"));
		Select dropDown1 = new Select(element1);
		dropDown1.selectByValue("20");

		WebElement element2 = driver.findElement(By.xpath("//select[@name=\"country\"]"));
		Select dropdown2 = new Select(element2);
		dropdown2.selectByValue("AL");

	}

}
