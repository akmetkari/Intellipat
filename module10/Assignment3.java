package module10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		//To execute the multiple test with the help 
		//of maven we can use below command for the same 
		//mvn test -Dtest =Assignment1,Assignment2
		
		System.setProperty("webdriver.chrome.driver", "D://learning//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("eclipse");
		
		String title = driver.getTitle();
		System.out.println("Title of the page is "+title);
		
		
	}
}
