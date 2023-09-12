package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseDoubleClick {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\sahil_learn\\Automation testing\\Sahilselenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
	
	driver.switchTo().frame("iframeResult");
	WebElement fileld=driver.findElement(By.xpath("//input[@id='field1']"));
	fileld.clear();
	fileld.sendKeys("Tester");
	
	WebElement button= driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
	Actions actions=new Actions(driver);
	actions.doubleClick(button).perform(); 
	

	
}
}
