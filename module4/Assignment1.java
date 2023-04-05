package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D://learning//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Going to facebook.com
		driver.get("https://www.facebook.com");
		
		//maximising the browser
		driver.manage().window().maximize();
		
		//clicking on create new account link
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		
		//filling info on page
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("akshay");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("metkari");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("aksh@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("aksh@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("newPass");
		
		WebElement birthDay = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.name("birthday_month"));
		WebElement year = driver.findElement(By.name("birthday_year"));
		
		Select s = new Select(birthDay);
		s.selectByValue("31");
		Select s1 = new Select(month);
		s1.selectByVisibleText("Aug");
		Select s3 = new Select(year);
		s3.selectByValue("1996");
		
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		
		driver.findElement(By.name("websubmit")).click();
		
	}
}
