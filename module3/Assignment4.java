package module3;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "D://learning//drivers//msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		driver.switchTo().frame("login_page");
		
		driver.findElement(By.linkText("Know More...")).click();
		Thread.sleep(2000);
		
		ArrayList<String>list = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(list.get(1));
		String Title = driver.getTitle();
		System.out.println(Title);
		driver.switchTo().window(list.get(1)).close();
		
		driver.switchTo().window(list.get(0));
		String Title1 = driver.getTitle();
		System.out.println(Title1);
		
		driver.close();
		
		
	
	}
}
