 package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Step1 -launch browser
		System.setProperty("webdriver.chrome.driver", "D://learning//drivers//chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
				
		driver.get("https://www.facebook.com");
		//maximising the browser
		driver.manage().window().maximize();
				
		//clicking on create new account link
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
				
		//filling info on page
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("akshay");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("metkari");		
				
	}
}
