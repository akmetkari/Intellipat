package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2_3_4 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "D://learning//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://only-testing-blog.blogspot.com/2014/09/selectable.html");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		//Assignment 2 
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//button"));
		act.doubleClick(ele).perform();
		

		//Assignment 3
		driver.switchTo().alert().accept();
		act.contextClick(ele).perform();
		
		//Assignment 4
		WebElement slider = driver.findElement(By.id("slider"));
		act.dragAndDropBy(slider, 50, 0).perform();
		
		
	}

}
