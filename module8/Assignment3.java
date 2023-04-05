package module8;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 
{
	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		//Automate the file upload
		System.setProperty("webdriver.chrome.driver", "D://learning//drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://smallpdf.com/word-to-pdf");
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='l3tlg0-6 kkceuK']"))).click();
		
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

		Thread.sleep(5000);
		//WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
		//wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='sc-1bu7qfl-0 bGbCKV sc-1az4ycp-1 dzHzSF']"))).click();
		
		WebElement ele = new WebDriverWait(driver,Duration.ofSeconds(5000)).
				until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='sc-1bu7qfl-0 bGbCKV sc-1az4ycp-1 dzHzSF']")));
		ele.click();
	}
}
