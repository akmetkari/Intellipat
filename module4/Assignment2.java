package module4;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D://learning//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//go to facebook.com
		driver.get("https://www.facebook.com");
		
		//storing all links in webelement
		List<WebElement> allURLs= driver.findElements(By.tagName("a"));
		System.out.println("Total links "+allURLs.size());
		
		//Traversing all links and getting text and links
		for(WebElement link:allURLs)
		{
			System.out.println(link.getText()+" - "+link.getAttribute("href"));
			Thread.sleep(2000);
			link.click();
		}
		
	}
}
