package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BootstrapDemo2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\sahil_learn\\Automation testing\\Sahilselenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
	driver.findElement(By.id("menu1")).click();
	
	List<WebElement> option=driver.findElements(By.xpath("//ul[@class='dropdown-menu test']//li"));
	System.out.println("number of option: "+option.size());
	for (WebElement select : option) {
		if (select.getText().equals("CSS")) {
			Thread.sleep(2000);
			select.click();
			Thread.sleep(2000);
			break;
		}
	}
}
}
