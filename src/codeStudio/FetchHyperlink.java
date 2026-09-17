package codeStudio;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchHyperlink {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\uwais @123\\.metadata\\SwagLabsAutomationFramework\\chromedriver.exe");
		//crate chrome object
		WebDriver driver = new ChromeDriver();
		//lauch calculator.net url
		driver.get("https://www.calculator.net/");
		//fetch hyper links
		List<WebElement> linkelement = driver.findElements(By.tagName("a"));
		System.out.println("Element Size ; " + linkelement.size());//count hyperlink
		//get hyper links
		for(WebElement el:linkelement)
		{
			System.out.println(el.getText());
		}
		driver.close();
		
	}

}

