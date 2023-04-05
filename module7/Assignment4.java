package module7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D://learning//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
		
		List<WebElement>st = (driver.findElements(By.xpath("//div[@class='card-body px-0 text-center']/p[1]")));
		for(WebElement link:st)
		{
			System.out.println(link.getText());
			
		}
		driver.close();
		
		
	}
}
