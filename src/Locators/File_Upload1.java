package Locators;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class File_Upload1 {
	
	public void File() throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","D:\\sahil_learn\\Automation testing\\Sahilselenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.foundit.in/");
		
		driver.findElement(By.className("heroSection-buttonContainer_secondaryBtn__text")).click();
		//using sendkeys (when in html format always type=file then sendkeys work )
//		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("D:\\sahil learn\\Simple\\Word Resume Templates\\Word Doc Resume #1.docx");
//		Thread.sleep(2000);
		
		
		
		//using robot class(if you cannot click on file to upload then this try..)
		WebElement button=driver.findElement(By.xpath("//input[@id='file-upload']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", button);//click action on button
		
		/*
		 * there is 3 step to follow
		 * 1.copy path
		 * 2.CRTL + V
		 * 3.Enter 
		 */
		
		Robot rb=new Robot();
		rb.delay(1000);
		
		//put the path into a clipbord
		StringSelection ss=new StringSelection("D:\\sahil learn\\Simple\\Word Resume Templates\\Word Doc Resume #1.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		
		//CRTL + V
		rb.keyPress(KeyEvent.VK_CONTROL);//press on CRTL key
		rb.keyPress(KeyEvent.VK_C);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		//Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		System.out.println("FIle IS UpLoad");
	}
	}


