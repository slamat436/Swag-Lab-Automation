package codeStudio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageLink {

	public static void main(String[] args) {
		
		String path ="C:\\uwais @123\\.metadata\\SwagLabsAutomationFramework\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		//open link open cart image
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		//locate image link
		
		driver.findElement(By.xpath("//img[@title=\"OpenCart - Demo\"]")).click();
		//verify image link
		
		if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution"))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
	}
	
}
