package module10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 
{
	//testscript to execute multiple classes from different packages in maven 
	//we can use the exec-maven plugin 
	//while running run : mvn exec:java -Dexec:mainclass="module1.Assignment1"s
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D://learning//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("eclipse");
		
		String title = driver.getTitle();
		System.out.println("Title of the page is "+title);
		
		
	}
}
