package module8;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "D://learning//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://smallpdf.com/word-to-pdf");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='l3tlg0-6 kkceuK']")).click();
		
		Thread.sleep(5000);
		String filePath = "D:\\Learning\\dummy.docx";
		
		Robot robot = new Robot();
		StringSelection selection = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		// Submit the file
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		// Wait for the conversion process to complete
		robot.delay(20000);

		// Download the converted file
		robot.setAutoDelay(500);
		driver.findElement(By.xpath("//a[@class='sc-1bu7qfl-0 bGbCKV sc-1az4ycp-1 dzHzSF']")).click();

	
	}
}
