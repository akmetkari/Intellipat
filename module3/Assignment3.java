package module3;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D://learning//drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		driver.switchTo().frame("login_page");
		
		driver.findElement(By.linkText("Know More...")).click();
		Thread.sleep(2000);
		
		ArrayList<String>list = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(list.get(1));
		
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		Thread.sleep(3000);
		driver.switchTo().window(list.get(0));
	
		System.out.println(driver.getTitle());
		driver.close();
		
		
	}
}
