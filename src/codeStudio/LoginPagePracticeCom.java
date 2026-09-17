package codeStudio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPagePracticeCom {

	public static void main(String[] args) {

		// launch url
		String path = "C:\\uwais @123\\.metadata\\SwagLabsAutomationFramework\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);

		// create chrome object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// launch url
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		String title =driver.getTitle();
		System.out.println("Page Title : " +title);
		
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();

	}

}
