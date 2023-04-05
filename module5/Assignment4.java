package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment4 
{
	public static void main(String[] args) 
	{
		//Step1 -launch browser
		System.setProperty("webdriver.gecko.driver", "D://learning//drivers//geckoDriver.exe");
		WebDriver driver = new FirefoxDriver();
		//step 2- go to url
		driver.get("https://www.jquery-az.com/javascript/demo.php/?ex=151.1_1");
		driver.manage().window().maximize();
		
		//step 3- click on button to show alert
		driver.findElement(By.xpath("//button[contains(text(),'Click here to show confirm alert')]")).click();
		
		//step 4- Get alert text displayed into console 
		String alert = driver.switchTo().alert().getText();
		System.out.println("the alert message is :"+alert);
		
		//step 5- Accept the web alert to delete account
		driver.switchTo().alert().accept();
		
		//step 6 - Get alert text displayed into console
		String newAlert = driver.switchTo().alert().getText();
		System.out.println("After clicking new alert is "+newAlert);
		
		//step 7 - Accept the alert 
		driver.switchTo().alert().accept();
		
		//close the browser 
		driver.close();
		
	}
}
