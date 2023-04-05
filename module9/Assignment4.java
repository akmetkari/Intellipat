package module9;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 
{

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D://learning//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Properties properties =new Properties();
		FileInputStream fis = new FileInputStream("D:\\Learning\\Eclipse\\IntellipaatAssignments\\configs\\config.properties");
		properties.load(fis);
		System.out.println(properties.getProperty("URL"));
		
		
		driver.get(properties.getProperty("URL"));
	}
}
