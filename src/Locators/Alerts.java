package Locators;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\sahil_learn\\Automation testing\\Sahilselenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	
//	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
//	driver.switchTo().alert().accept();
	
	// alert window with OK and Cancel button
//	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
//	//driver.switchTo().alert().accept(); // close the alert using OK button
//	driver.switchTo().alert().dismiss();  // close the alert using Cancel button
	
	
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
	Thread.sleep(2000);
	Alert messages=driver.switchTo().alert();
	System.out.println("The messsage display in alert is .."+messages);
	messages.sendKeys("tester");
	messages.accept();
	
}
}
