package module9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;




public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D://learning//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");

		Thread.sleep(3000);
		driver.findElement(By.id("login-button")).click();

		String Actual_title = driver.findElement(By.xpath("//span[@class='title']")).getText();
		String Expected_title = "PRODUCTS";
		System.out.println("Actual title is "+Actual_title);
		if (Actual_title.equalsIgnoreCase(Expected_title))
		{
			System.out.println("successfull login");
		}
		
	}
}
