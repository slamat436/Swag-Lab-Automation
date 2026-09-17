
package codeStudio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findRadioButton {
	public static void main(String[] args) throws InterruptedException {

		String path = "C:\\uwais @123\\.metadata\\SwagLabsAutomationFramework\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		// launch radio website url
		driver.get("https://proleed.academy/exercises/selenium/automation-practice-form-with-radio-button-check-boxes-and-drop-down.php");
		Thread.sleep(2000);
		// locate radion button
		List<WebElement> radioButtonOptions = driver.findElements(By.xpath("//input[@type=\"radio\"]"));

		System.out.println("Total Number Of Radio Button : " + radioButtonOptions.size());
		
	}

}
