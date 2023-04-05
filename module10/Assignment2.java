package module10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		//To run the multiple packages we can use mvn test -Dtest = module1.*,module2.*
		System.setProperty("webdriver.chrome.driver", "D://learning//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("eclipse");
		
		String title = driver.getTitle();
		System.out.println("Title of the page is "+title);

	}
	
}
