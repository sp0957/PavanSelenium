package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragen_drop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\sahil_learn\\Automation testing\\Sahilselenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
     Thread.sleep(3000);
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"post-2669\"]/div[2]/div/div/div[1]/p/iframe")));
	
   WebElement item1=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/img"));
   WebElement item2=driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[2]/img"));
   
   WebElement trget=driver.findElement(By.xpath("//*[@id=\"trash\"]"));
   
  Actions actions =new Actions(driver);
  actions.dragAndDrop(item1 ,trget).perform();
  actions.dragAndDrop(item2 ,trget).perform();
		 
   
   
}
}
