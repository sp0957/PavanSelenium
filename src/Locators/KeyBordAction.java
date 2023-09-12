package Locators;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.w3c.dom.events.MouseEvent;


public class KeyBordAction {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\sahil_learn\\Automation testing\\Sahilselenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/key_presses?");
	
	Actions actions=new Actions(driver);
	
	actions.sendKeys(Keys.BACK_SPACE).perform();
	Thread.sleep(2000);
	actions.sendKeys(Keys.ALT).perform();
	Thread.sleep(2000);
	actions.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	actions.sendKeys(Keys.SPACE).perform();
	Thread.sleep(2000);
}
}
