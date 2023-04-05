package module10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 
{
	public static void main(String[] args) 
	{	//To run the test suite with maven 
		//Need to add maven surefire and compiler plugin 
		//To run the testscript we can mvn test
		
		
		System.setProperty("webdriver.chrome.driver", "D://learning//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("eclipse");
		
		String title = driver.getTitle();
		System.out.println("Title of the page is "+title);

	}
}
