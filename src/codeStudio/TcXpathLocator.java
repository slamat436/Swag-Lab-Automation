package codeStudio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TcXpathLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\uwais @123\\.metadata\\SwagLabsAutomationFramework\\chromedriver.exe");
		//create chrome object
		WebDriver driver = new ChromeDriver();
		//launch swag lab url
		driver.get("http://saucedemo.com");
		//locate username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//locate password 
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		//locate login button 
		driver.findElement(By.className("submit-button")).click();
		//open swag lab product page
		String currentWindowHandle=driver.getWindowHandle();
		driver.switchTo().window(currentWindowHandle);
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[1]/div/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		//locate Sauce Labs Backpack
		//driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		//add to cart by name backpack
		//driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
		//add to cart by class -bike light
		//driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
	
		//locate Sauce webelements
	   // List<WebElement> elementList = driver.findElements(By.partialLinkText("Sauce"));
	  //  System.out.println("Element Size : " +elementList.size());
		
}
}
