package codeStudio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DrodownDemo {

	public static void main(String[] args) throws InterruptedException {

		// Launch Chrome browser
		String path = "C:\\uwais @123\\.metadata\\SwagLabsAutomationFramework\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);

		// Create Chrome browser object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		Thread.sleep(2000);

		// Launch OpenCart URL
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

		// Locate dropdown
		WebElement element = driver
				.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div[2]/div/div/div/p/select"));

		// Create Select object
		Select dropDown = new Select(element);

		// Select country
		dropDown.selectByIndex(5);
		// dropDown.selectByVisibleText("Angola");
		// dropDown.selectByValue("ASM");
		

		// Check whether dropdown is multiple or si
		if (dropDown.isMultiple()) {
			System.out.println("Dropdown is Multiple");
		} else {
			System.out.println("Dropdown is not Multiple");
		}

		// Print all dropdown options
		List<WebElement> allDropdownOptions = dropDown.getOptions();

		for (WebElement el : allDropdownOptions) {
			System.out.println(el.getText());
		}

		// Close browser
		driver.quit();
	}
}
