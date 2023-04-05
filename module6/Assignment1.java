package module6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D://learning//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[starts-with(@class,'_2KpZ6l _2doB4z')]")).click();
		//driver.findElement(By.name("q")).sendKeys("iphone 14");
		Actions action = new Actions(driver);
		WebElement e = driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"));
		action.moveToElement(e).build().perform();
		
		Thread.sleep(2000);
		WebElement sub = driver.findElement(By.xpath("//a[contains(text(),'Women Footwear')]"));
		action.moveToElement(sub).build().perform();
		WebElement all = driver.findElement(By.xpath("//a[contains(text(),'Women Sports Shoes')]"));
		all.click();
		//action.moveToElement(sub).perform();
		
		
	}
}
