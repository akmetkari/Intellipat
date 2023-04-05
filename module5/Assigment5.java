package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assigment5 
{
	public static void main(String[] args) 
	{
		//Step1 -launch browser
		System.setProperty("webdriver.gecko.driver", "D://learning//drivers//geckoDriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Step 2- Open the test URL
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		//step 3 - switch into frame
		driver.switchTo().frame("iframeResult");
		
		//step 4 - click on try it button 
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		
		//step 5 - send the text into alert 
		driver.switchTo().alert().sendKeys("Akshay Metkari");
		
		//step 6 - send the web alert 
		driver.switchTo().alert().accept();
		
		//step 7 - Get the text on console 
		String txt = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println("the text displayed is "+txt);
		
		
		
	}
}
