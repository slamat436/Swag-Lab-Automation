package codeStudio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByCssSelector {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\uwais @123\\.metadata\\AutomationFramework\\chromedriver.exe");
		// create chrome object
		WebDriver driver = new ChromeDriver();
		// open swag lab page
		driver.get("http://saucedemo.com");
		// locate username -tag#id
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		// locate password tag[attribute=value]
		driver.findElement(By.cssSelector("input[name=password")).sendKeys("secret_sauce");
		// locate login button by using tag.value of class
		driver.findElement(By.cssSelector("input.submit-button")).click();
		// locate product page
		String currentwindowHandle = driver.getWindowHandle();
		driver.switchTo().window(currentwindowHandle);
		// Add to cart by using tag.valueofclass[attribute=value]
		driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack")).click();
		// tag[attribute$=substring]
		driver.findElement(By.cssSelector("button[name$=light")).click();
		driver.findElement(By.cssSelector("button#add-to-cart-sauce-labs-bolt-t-shirt")).click();

	}
}
