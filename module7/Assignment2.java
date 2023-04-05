package module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D://learning//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev//downloads/");
		driver.findElement(By.xpath("//body/div[1]/main[1]/div[5]/div[3]/div[1]/div[2]/p[2]/a[1]")).click();
		
		driver.quit();
		
	}
}
