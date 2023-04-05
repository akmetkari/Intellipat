package module9;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignment2_3 
{
	
	static WebDriver driver;
	
	@Test(priority=1)
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D://learning//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@Test(priority=2)
	public void Login() throws InterruptedException, BiffException, IOException
	{
		//navigate to the site
		driver.get("https://www.saucedemo.com/");
		//locate the file 
		FileInputStream fis = new FileInputStream("D:\\Learning\\LoginData.xls");
		Workbook wb = Workbook.getWorkbook(fis);
		
		//locate the sheet in the file
		Sheet sh = wb.getSheet(0); 
		//Get the contents of the file 
		String userName = sh.getCell(0,1).getContents();
		String password = sh.getCell(1,1).getContents();
		
		System.out.println(userName);
		System.out.println(password);
		driver.findElement(By.id("user-name")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(password);
		
		Thread.sleep(3000);
		driver.findElement(By.id("login-button")).click();
		
	}
	

	@Test(priority=3)
	public void tearDown()
	{
		driver.close();
	}
	
}
